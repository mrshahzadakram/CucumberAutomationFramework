package stepDefinition;
import context.TestContext;
import io.cucumber.java.en.When;
import pages.SearchPage;
import support.ConfigReader;


public class SearchPatientSteps {
	
	TestContext testContext;
	SearchPage searchPage;
	
	 public SearchPatientSteps(TestContext context) {
	 testContext = context;
	 searchPage = testContext.getPageObjectManager().getSearchPage();
	 }
	 
    
	@When("the user searched a patient")
	public void the_user_searched_a_patient() throws InterruptedException {

		searchPage.click_search_icon();
		searchPage.enter_user_name(ConfigReader.getInstance().getPatientName());
		searchPage.click_dropdown_records();
	  
	}
	
	
    
	
    
    
	

}
