package org.xtext.library.validation;

import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtext.validation.Check;
import org.xtext.library.library.Add;
import org.xtext.library.library.Author;
import org.xtext.library.library.LibraryPackage;
 

public class LibraryJavaValidator extends AbstractLibraryJavaValidator {

	@Check
	public void checkAuthorNamesNotEmpty(Author author)
	{
		if(author.getFirstname().isEmpty()){
			error("Imiê autora nie mo¿e byæ puste", LibraryPackage.Literals.AUTHOR__FIRSTNAME);
		}
		if(author.getSecondname().isEmpty()){
			error("Nazwisko autora nie mo¿e byæ puste", LibraryPackage.Literals.AUTHOR__SECONDNAME);
		}
	}
	
	@Check
	public void checkIsbnIsDifferent(Add crrent)
	{
		
		//EObject myModel = myResource.getContents().get(0);
		//EObject myModel = reso
		//getEPackages().
		//for(Add other : LibraryPackage.Literals.ADD)
	}
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

}
