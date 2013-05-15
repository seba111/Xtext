package tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.xtext.library.LibraryUiInjectorProvider
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.xtext.library.library.Model
import org.junit.Test
//import static org.xtext.example.mydsl3.validation.MyDslJavaValidator.*
import static org.xtext.library.library.LibraryPackage$Literals.*;
import static org.xtext.library.validation.LibraryJavaValidator.*;
//import static org.xtext.example.mydsl3.myDsl.MyDslPackage$Literals.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LibraryUiInjectorProvider))
class ValidationTests {
	
	@Inject extension ParseHelper<Model> 
	@Inject extension ValidationTestHelper
	
	@Test
	def AuthorFirstnameNotEmpty(){
		'''
			Search book by author "" "Kowalski"
		'''.parse.assertError(AUTHOR,EMPTY_AUTHOR_FIRSTNAME)
	} 
	@Test
	def AuthorSecondnameNotEmpty(){
		'''
			Search book by author "Jan" ""
		'''.parse.assertError(AUTHOR,EMPTY_AUTHOR_SECONDNAME)
	}
	@Test
	def UserFirstnameNotEmpty(){
		'''
			Add user "" "Kowalski" 1980
		'''.parse.assertError(ADD_USER,EMPTY_USER_FIRSTNAME)
	} 
	@Test
	def UserSecondnameNotEmpty(){
		'''
			Add user "Jan" "" 1980
		'''.parse.assertError(ADD_USER,EMPTY_USER_SECONDNAME)
	}	
}

