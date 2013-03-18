package org.xtext.library.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.library.library.Model
import org.xtext.library.library.Command
import org.xtext.library.library.Add
import org.xtext.library.library.Author
import org.xtext.library.library.Borrow
import org.xtext.library.library.Return
import org.xtext.library.library.Remove
import org.xtext.library.library.Check
import org.xtext.library.library.AddAuthor
import org.xtext.library.library.Show
import org.xtext.library.library.ByYear
import org.xtext.library.library.ByAuthor
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import java.util.List
import org.eclipse.xtext.common.types.util.TypeReferences

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class LibraryJvmModelInferrer extends AbstractModelInferrer {
	int numberOfCommand = 0

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject TypeReferences typeReferences

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
   	def dispatch void infer(Model element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(element.toClass("Main")).initializeLater([
			val param = newTypeRef(typeof(String)).addArrayTypeDimension

			members += toMethod("main",element.newTypeRef(Void::TYPE))[
				setStatic(true)
				parameters += toParameter("args",param)
				body = [
					append(
						'''
						Database db = new Database();
						Book boo;
						«FOR comm : element.eAllOfType(typeof(Command))»
							«fillMain(comm)»
						«ENDFOR»
						'''
					)
				]
			]
			
		])
 		
		acceptor.accept(element.toClass("Database")).initializeLater([
			members += toField("statement",newTypeRef('java.sql.Statement'))
			members += toField("connection",newTypeRef('java.sql.Connection'))
			members += toConstructor()[
				body =[
					append(
						'''
							try
							{
								Class.forName("org.sqlite.JDBC");
							}
							catch(ClassNotFoundException ex)
							{
								System.err.println(ex.getMessage());
							}
							connection = null;
							try{
								connection = java.sql.DriverManager.getConnection("jdbc:sqlite:base.db");
								statement = connection.createStatement();
								statement.setQueryTimeout(30);
								
								statement.executeUpdate("drop table book;");
								statement.executeUpdate("drop table author;");
								statement.executeUpdate("drop table connection;");
								
								statement.executeUpdate("create table if not exists book("
													+ "bookId integer primary key autoincrement,"
													+ "isbn varchar(50),"
													+ "title varchar(100),"
													+ "year integer(4),"
													+ "available varchar(6)"
													+ ")");
																
								statement.executeUpdate("create table if not exists author("
													+ "authorId integer primary key autoincrement,"
													+ "firstname varchar(50),"
													+ "secondname varchar(200)"
													+ ")");
								statement.executeUpdate("create table if not exists connection("
													+ "bookId integer,"
													+ "authorId integer,"
													+ "FOREIGN KEY(bookId) REFERENCES book(bookId),"
													+ "FOREIGN KEY(authorId) REFERENCES book(authorId)"
													+ ")");
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
						'''
					)
				]	
			]
			members += toMethod("CloseConnection",newTypeRef(Void::TYPE))[
				setVisibility(JvmVisibility::PUBLIC)
				body = [
					append(
						'''
							try
							{
								if(connection != null)
									connection.close();
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
						'''
					)
				]
			]
			members += toMethod("AddAuthorToBook",newTypeRef(Void::TYPE))[
				setVisibility(JvmVisibility::PUBLIC)
				parameters += toParameter("isbn",element.newTypeRef('java.lang.String'))
				parameters += toParameter("au",element.newTypeRef('Author'))
				body = [
					append(
						'''
							System.out.println("------------------------");
							System.out.println("Add Book:");
							java.sql.ResultSet rs;
							try
							{
								int bId = 0;
								int aId = 0;
								boolean bookExists = false;
								rs = statement.executeQuery("select * from book where isbn='"+isbn+"'");
								if(!rs.next())
								{
									System.out.println("Niema takiej ksiazki w bazie");
									return;
								}
								else
								{
									bId = rs.getInt(1);
									bookExists = true;
								}
								
								rs = statement.executeQuery("select * from author where firstname = '"
																+ au.getFirstname()+"' and secondname = '"
																+ au.getSecondname()+"'");
																
								//jesli niema jeszcze takiego autora to go dodajemy do bazy i pobieramy id
								if(!rs.next())
								{
									statement.executeUpdate("insert into author(firstname, secondname) values('"
																+ au.getFirstname()+"','"
																+ au.getSecondname()+"')");
										
									System.out.println("Dodano autora "+au.getFirstname()+" "+au.getSecondname()+" do bazy danych");
									rs = statement.executeQuery("select authorId from author where firstname='"+au.getFirstname()
																							+"' and secondname='"+au.getSecondname()+"'");
									rs.next();
									aId = rs.getInt(1);
								}
								else  // jesli jest to pobieramy id
								{
									System.out.println("Taki autor juz istnieje w bazie");
									aId = rs.getInt(1);
								}
								if(bookExists)
								{
									statement.executeUpdate("insert into connection(bookId, authorId) values("
																+ bId+","
																+ aId+")");
									System.out.println("Dodano danego autora do ksiazki o ISBN: "+ isbn);
								}
									

							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
						'''
					)
				]
			]
			members += toMethod("BorrowBook",newTypeRef(Void::TYPE))[
				parameters += toParameter("isbn",element.newTypeRef('java.lang.String')) 
				setVisibility(JvmVisibility::PUBLIC)
				body = [
					append(
						'''
							System.out.println("------------------------");
							System.out.println("Borrow:");
							java.sql.ResultSet rs;
							try
							{
								rs = statement.executeQuery("select * from book where isbn='"+isbn+"'");
								if(!rs.next())
								{
									System.out.println("Nie mozna wypozyczyc ksiazki o ISBN "+isbn+", gdyz takiej ksiazki niema w bazie");
								}
								else
								{
									rs = statement.executeQuery("select * from book where isbn='"+isbn+"' and available='true'");
									if(!rs.next())
									{
										System.out.println("Nie mozna wypozyczyc ksiazki o ISBN "+isbn+", gdyz zostala ona juz wypozyczona");
									}
									else
									{
										statement.executeUpdate("update book set available='false' where isbn='"+isbn+"'");
										System.out.println("wypozyczono ksiazke o ISBN "+isbn);
									}
								}
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
						'''
					)
				]
			]
			members += toMethod("ReturnBook",newTypeRef(Void::TYPE))[
				parameters += toParameter("isbn",element.newTypeRef('java.lang.String')) 
				setVisibility(JvmVisibility::PUBLIC)
				body = [
					append(
						'''
							System.out.println("------------------------");
							System.out.println("Return:");
							java.sql.ResultSet rs;
							try
							{
								rs = statement.executeQuery("select * from book where isbn='"+isbn+"'");
								if(!rs.next())
								{
									System.out.println("Ksiazki o takim ISBN( "+isbn+") niema w bazie. Uzyj polecenia dodawania ksiazki ");
								}
								else
								{
									statement.executeUpdate("update book set available='true' where isbn='"+isbn+"'");
									System.out.println("zwrocono ksiazke o ISBN "+isbn);
								}
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
						'''
					)
				]
			]
			members += toMethod("AddBook",newTypeRef(Void::TYPE))[
				parameters += toParameter("book",element.newTypeRef("Book"))
				setVisibility(JvmVisibility::PUBLIC)
				body = [
					append(
						'''
							System.out.println("------------------------");
							System.out.println("Add:");
							boolean added = false;	
							java.sql.ResultSet rs;
							try
							{
								rs = statement.executeQuery("select * from book where isbn = '"
															+ book.getIsbn()+"'");
								//jesli niema jeszcze takiej ksiazki to ja dodajemy do bazy
								if(!rs.next())
								{
									statement.executeUpdate("insert into book(isbn, title, year, available) values('"
															+ book.getIsbn()+"','"
															+ book.getTitle()+"','"
															+ book.getYear()+"','true')");
									
									System.out.println("Dodano ksiazke o ISBN "+book.getIsbn());
									added = true;
								}
								else
								{
									System.out.println("Ksiazka o takim ISBN ("+ book.getIsbn() +") juz istnieje w bazie");	
								}
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
							
							try
							{
								for(Author au : book.getAuthors())
								{
									rs = statement.executeQuery("select * from author where firstname = '"
																+ au.getFirstname()+"' and secondname = '"
																+ au.getSecondname()+"'");
																
									//jesli niema jeszcze takiego autora to go dodajemy do bazy
									if(!rs.next())
									{
										statement.executeUpdate("insert into author(firstname, secondname) values('"
																+ au.getFirstname()+"','"
																+ au.getSecondname()+"')");
										
										System.out.println("Dodano autora "+au.getFirstname()+" "+au.getSecondname()+" do bazy danych");
										added = true;
									}
									else
									{
										System.out.println("Taki autor juz istnieje w bazie");	
									}

									if(added)
									{
										added = false;
										rs = statement.executeQuery("select authorId from author where firstname='"+au.getFirstname()
																							+"' and secondname='"+au.getSecondname()+"'");
										rs.next();
										int aId = rs.getInt(1);
										rs = statement.executeQuery("select bookId from book where isbn='"+ book.getIsbn()+"'");
										rs.next();
										int bId = rs.getInt(1);
										
										statement.executeUpdate("insert into connection(bookId, authorId) values("
																+ bId+","
																+ aId+")");
									}
								}
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
						'''
					)
				]
			]
			members += toMethod("RemoveBook",newTypeRef(Void::TYPE))[
				parameters += toParameter("isbn",element.newTypeRef("java.lang.String"))
				setVisibility(JvmVisibility::PUBLIC)
				body = [
					append(
						'''
							System.out.println("------------------------");
							System.out.println("Remove book:");
							java.sql.ResultSet rs;
							try
							{
								rs = statement.executeQuery("select bookId from book where isbn = '"
															+ isbn +"'");
															
								if(!rs.next())
								{
									System.out.println("Ksiazka nie moze zostac usunieta, poniewaz niema takiej w bazie");
								}
								else
								{
									int bId = rs.getInt(1);
									statement.executeUpdate("delete from connection where bookId =" + bId);
									statement.executeUpdate("delete from book where bookId =" + bId);
									System.out.println("Usuniêto ksi¹¿kê");
								}
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
						'''
					)
				]
			]
			members += toMethod("ShowAllBooks",newTypeRef(Void::TYPE))[
				setVisibility(JvmVisibility::PUBLIC)
				body = [
					append(
						'''
							System.out.println("------------------------");
							System.out.println("Wszystkie ksi¹¿ki znajduj¹ce siê w bazie:");
							java.sql.ResultSet rs;
							try
							{
								rs = statement.executeQuery("select * from book");															
								while(rs.next())
								{
									System.out.println(rs.getString(2)+", "+rs.getString(3)+", "+rs.getInt(4)+", dostepna: "+rs.getString(5));

								}
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
						'''
					)
				]
			]
			members += toMethod("ShowAllAuthors",newTypeRef(Void::TYPE))[
				setVisibility(JvmVisibility::PUBLIC)
				body = [
					append(
						'''
							System.out.println("------------------------");
							System.out.println("Wszyscy autorzy znajduj¹ce siê w bazie:");
							java.sql.ResultSet rs;
							try
							{
								rs = statement.executeQuery("select * from author");															
								while(rs.next())
								{
									System.out.println(rs.getString(2)+" "+rs.getString(3));

								}
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
						'''
					)
				]
			]
			members += toMethod("CheckBook",element.newTypeRef("Book"))[
				parameters += toParameter("isbn",element.newTypeRef("java.lang.String"))
				setVisibility(JvmVisibility::PUBLIC)
				body = [
					append(
						'''
							System.out.println("------------------------");
							System.out.println("Check Book:");
							Author au;
							Book boo = new Book();
							java.sql.ResultSet rs;
							try
							{
								rs = statement.executeQuery("select * from book where isbn = '"
															+ isbn +"'");
															
								if(!rs.next())
								{
									System.out.println("Niema takiej ksiazki w bazie");
								}
								else
								{
									//pobieramy dane ksiazki
									int bId = rs.getInt(1);
									boo.setIsbn(rs.getString(2));
									boo.setTitle(rs.getString(3));
									boo.setYear(rs.getString(4));
									boo.setAvailable(rs.getString(5));
									
									//pobieramy id autora danej ksiazki
									java.util.List<Integer> authorIds = new java.util.ArrayList<Integer>();
									rs = statement.executeQuery("select authorId from connection where bookId = "+ bId);
									while(rs.next())
									{
										authorIds.add(rs.getInt(1));
									}
									//pobieramy dane autora
									for(Integer aId : authorIds)
									{
										au = new Author();
										rs = statement.executeQuery("select * from author where authorId = "+ aId);
										rs.next();
										au.setFirstname(rs.getString(2));
										au.setSecondname(rs.getString(3));
										boo.addAuthor(au);
									}
									System.out.println("Tytul: "+boo.getTitle()+", Rok: "+boo.getYear());
									System.out.println("Napisana przez:");
									for(Author author : boo.getAuthors())
									{
										System.out.println(author.getFirstname()+" "+author.getSecondname());
									}
									if(boo.getAvailable().contentEquals("true"))
									{
										System.out.println("Status: dostepna");
									}
									else
									{
										System.out.println("Status: wypozyczona");
									}
								}
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
							
							return boo;
						'''
					)
				]
			]
			members += toMethod("SearchByYear",newTypeRef(Void::TYPE))[
				parameters += toParameter("year",element.newTypeRef('java.lang.String')) 
				setVisibility(JvmVisibility::PUBLIC)
				body = [
					append(
						'''
							System.out.println("------------------------");
							System.out.println("Search by year:");
							java.sql.ResultSet rs;
							try
							{
								rs = statement.executeQuery("select * from book where year='"+year+"'");
								System.out.println("Znalezione ksiazki:");
								while(rs.next())
								{
									System.out.println("ISBN: "+ rs.getString(2));
									System.out.println("Tytul: "+ rs.getString(3));
									System.out.println("Rok: "+ rs.getString(4));
									
									if(rs.getString(5).contentEquals("true"))
									{
										System.out.println("dostepna");
									}
									else
									{
										System.out.println("wypozyczona");									
									}
									System.out.println(" ");
								}
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
						'''
					)
				]
			]
			members += toMethod("SearchByAuthor",newTypeRef(Void::TYPE))[
				parameters += toParameter("au",element.newTypeRef("Author")) 
				setVisibility(JvmVisibility::PUBLIC)
				body = [
					append(
						'''
							System.out.println("------------------------");
							System.out.println("Search by author:");
							java.sql.ResultSet rs;
							int aId = 0;
							try
							{
								rs = statement.executeQuery("select authorId from author where firstname='"+au.getFirstname()
																						+"' and secondname='"+au.getSecondname()+"'");
								if(rs.next())
								{
									aId = rs.getInt(1);
								}
								else
								{
									System.out.println("Niema takiego autora");
									return;
								}
									
								rs = statement.executeQuery("select bookId from connection where authorId="+aId);
								java.util.List<Integer> bookIds = new java.util.ArrayList<Integer>();
								while(rs.next())
								{
									bookIds.add(rs.getInt(1));
								}
								System.out.println("Znalezione ksiazki:");
								for(Integer bId : bookIds)
								{
									rs = statement.executeQuery("select * from book where bookId ='"+bId+"'");
									
									rs.next();

									System.out.println("ISBN: "+ rs.getString(2));
									System.out.println("Tytul: "+ rs.getString(3));
									System.out.println("Rok: "+ rs.getString(4));
										
									if(rs.getString(5).contentEquals("true"))
									{
										System.out.println("dostepna");
									}
									else
									{
										System.out.println("wypozyczona");									
									}
									System.out.println(" ");
								}
								
							}
							catch(java.sql.SQLException e)
							{
								System.err.println(e.getMessage());
							}
							
						'''
					)
				]
			]
			
		])
		
		acceptor.accept(element.toClass("Author")).initializeLater([
			members += toField("firstname",newTypeRef('java.lang.String'))
			members += toSetter("firstname",newTypeRef('java.lang.String'))
			members += toGetter("firstname",newTypeRef('java.lang.String'))	
			members += toField("secondname",newTypeRef('java.lang.String'))
			members += toSetter("secondname",newTypeRef('java.lang.String'))
			members += toGetter("secondname",newTypeRef('java.lang.String'))		
		])
		acceptor.accept(element.toClass("Book")).initializeLater([
			members += toField("isbn",newTypeRef('java.lang.String'))
			members += toSetter("isbn",newTypeRef('java.lang.String'))
			members += toGetter("isbn",newTypeRef('java.lang.String'))	
			members += toField("title",newTypeRef('java.lang.String'))
			members += toSetter("title",newTypeRef('java.lang.String'))
			members += toGetter("title",newTypeRef('java.lang.String'))	
			members += toField("year",newTypeRef('java.lang.String'))
			members += toSetter("year",newTypeRef('java.lang.String'))
			members += toGetter("year",newTypeRef('java.lang.String'))
			members += toField("available",newTypeRef('java.lang.String'))
			members += toSetter("available",newTypeRef('java.lang.String'))
			members += toGetter("available",newTypeRef('java.lang.String'))	
			
			members += toField("authors", newTypeRef(typeof(List), newTypeRef('Author')))
			members += toMethod("addAuthor", newTypeRef(Void::TYPE))[
				visibility = JvmVisibility::PUBLIC
				parameters += toParameter("au",element.newTypeRef('Author') )
				body = [
					append(
						'''
							if(authors == null)
							{
								authors = new java.util.ArrayList<Author>();
							}
							authors.add(au);
						'''
					)
				]
			]
			members += toMethod("getAuthors", newTypeRef(typeof(List), newTypeRef('Author')))[
				visibility = JvmVisibility::PUBLIC
				body = [
					append(
						'''
							return authors;
						'''
					)
				]
			]
		//	members += toSetter("authors",newTypeRef(StringArrayType))
		//	members += toGetter("authors",newTypeRef(StringArrayType))		
		])
   	}
   	def protected fillMain(Object command)
   	{
				
   		switch command {
   			Add:
   				'''
					boo = new Book();
					boo.setIsbn("«command.isbn»");
					boo.setTitle("«command.title»");
					boo.setYear("«command.year»");
					boo.setAvailable("true");
   				«FOR au : command.eAllOfType(typeof(Author))»
					Author au«addOneToCommandNumber()» = new Author();
					au«numberOfCommand».setFirstname("«au.firstname»");
					au«numberOfCommand».setSecondname("«au.secondname»");
					
					boo.addAuthor(au«numberOfCommand»);
   				«ENDFOR»
					db.AddBook(boo);
				'''
			AddAuthor:
				'''
					Author au«addOneToCommandNumber()» = new Author();
					au«numberOfCommand».setFirstname("«command.author.firstname»");
					au«numberOfCommand».setSecondname("«command.author.secondname»");
					db.AddAuthorToBook("«command.isbn»" , au«numberOfCommand»);
				'''
			Borrow:
				'''
					db.BorrowBook("«command.isbn»");
				'''
			Return:
				'''
					db.ReturnBook("«command.isbn»");
				'''	
			Remove:
				'''
					db.RemoveBook("«command.isbn»");
				'''	
			Show:
				'''
					«IF command.what == "books"»
						db.ShowAllBooks();
					«ENDIF»
					«IF command.what == "authors"»
						db.ShowAllAuthors();
					«ENDIF»
				'''
			Check:
				'''
					Book tmp«addOneToCommandNumber()» = db.CheckBook("«command.isbn»");
				'''	
			ByYear:
				'''
					db.SearchByYear("«command.year»");
				'''	
			ByAuthor:
				'''
					Author au«addOneToCommandNumber()» = new Author();
					au«numberOfCommand».setFirstname("«command.author.firstname»");
					au«numberOfCommand».setSecondname("«command.author.secondname»");
												
					db.SearchByAuthor(au«numberOfCommand»);
				'''	
		}						
	}	
	def protected int addOneToCommandNumber()
	{
		
		numberOfCommand = numberOfCommand +1
		return numberOfCommand
	}	 			
}
   				
   				