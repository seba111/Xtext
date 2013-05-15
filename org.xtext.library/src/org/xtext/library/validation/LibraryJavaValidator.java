package org.xtext.library.validation;

import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtext.validation.Check;
import org.xtext.library.library.Add;
import org.xtext.library.library.Author;
import org.xtext.library.library.AddUser;
import org.xtext.library.library.LibraryPackage;
 

public class LibraryJavaValidator extends AbstractLibraryJavaValidator {

	public final static String EMPTY_AUTHOR_FIRSTNAME = "130";
	public final static String EMPTY_AUTHOR_SECONDNAME = "131";
	public final static String EMPTY_USER_FIRSTNAME = "132";
	public final static String EMPTY_USER_SECONDNAME = "133";
	
	@Check
	public void checkAuthorNamesNotEmpty(Author author)
	{
		if(author.getFirstname().isEmpty()){
			error("Imiê autora nie mo¿e byæ puste", LibraryPackage.Literals.AUTHOR__FIRSTNAME,EMPTY_AUTHOR_FIRSTNAME);
		}
		if(author.getSecondname().isEmpty()){
			error("Nazwisko autora nie mo¿e byæ puste", LibraryPackage.Literals.AUTHOR__SECONDNAME,EMPTY_AUTHOR_SECONDNAME);
		}
	}
	@Check
	public void checkUserNamesNotEmpty(AddUser user)
	{
		if(user.getFirstname().isEmpty()){
			error("Imiê u¿ytkownika nie mo¿e byæ puste", LibraryPackage.Literals.ADD_USER__FIRSTNAME,EMPTY_USER_FIRSTNAME);
		}
		if(user.getSecondname().isEmpty()){
			error("Nazwisko u¿ytkownika nie mo¿e byæ puste", LibraryPackage.Literals.ADD_USER__SECONDNAME,EMPTY_USER_SECONDNAME);
		}
	}

}
