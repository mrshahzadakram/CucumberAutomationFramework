package stepDefinition;

import org.junit.Assert;

import context.TestContext;
import io.cucumber.java.en.Then;
import pages.AUCPage;

public class AUCSteps {
	
	AUCPage aucPage;
	TestContext testContext;
	
	 public AUCSteps(TestContext context) {
		 testContext = context;
		 aucPage = testContext.getPageObjectManager().getAUCPage();
				 
		 }
	
	@Then("a search bar is shown on ui")
	public void a_search_bar_is_shown_on_ui()
	{
	  String t=  aucPage.find_text_search_bar();
	  String expected = "Please select an exam or indication";
	  Assert.assertEquals(expected, t);
	  
	};

	@Then("search bar text is {string}")
	public void search_bar_text_is(String expectedText)
	{
	  String t=  aucPage.find_text_search_bar();
	  System.out.println("In AUC, Search bart text = "+t);
	  Assert.assertEquals(expectedText, t);
	  
	};
}
