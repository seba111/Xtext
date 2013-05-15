package tests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.library.LibraryUiInjectorProvider;
import org.xtext.library.library.Model;
import org.xtext.library.library.Add;
import org.xtext.library.library.Author;
import org.xtext.library.library.ByYear;
import com.google.inject.Inject;



@RunWith(XtextRunner.class)
@InjectWith(LibraryUiInjectorProvider.class)
public class ParserTests {
	
	@Inject private ParseHelper<Model> parseHelper;
	
	private Model model;
	
	@Test
	public void test1(){
		StringBuilder modelString = new StringBuilder();
		modelString.append("Add book 437-67-98, \"Tytu³\", 2013");
		modelString.append(" written by \"Jan\" \"Kowalski\", \"Anna\" \"Nowak\"");
		try{
			model = parseHelper.parse(modelString);
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}	
		for(EObject el : model.eContents()){
			if(el instanceof Add){				
				Assert.assertEquals(2, ((Add) el).getAuthors().size());
			}
		}
	}
	@Test
	public void test2(){
		StringBuilder modelString = new StringBuilder();
		modelString.append("Search book by year 1999");
		try{
			model = parseHelper.parse(modelString);
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}

		for(EObject el : model.eContents()){
			if(el instanceof ByYear){				
				Assert.assertEquals("1999", ((ByYear) el).getYear());
			}
		}
	}
}
