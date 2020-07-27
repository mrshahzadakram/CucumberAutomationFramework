package stepDefinition;


import context.TestContext;
import io.cucumber.java.en.When;
import pages.FooterPage;

public class FooterLinksSelectionSteps {

	FooterPage footerPage;
    TestContext testContext;
	
	 public FooterLinksSelectionSteps(TestContext context) {
		 testContext = context;
		 footerPage = testContext.getPageObjectManager().getFooterPage();
		
		 
		 }
	 
	
	@When("the user clicks footer {string} of {string}")
	public void the_user_clicks_of(String type,String sectionName) 
	{
	
			
		// If user has chose a button or icon to click
		if(type.equalsIgnoreCase("section"))
		{	
		
			if (sectionName.equalsIgnoreCase("See your Schedules"))
			{
		       footerPage.click_global_schedules_link();
			}
			else if (sectionName.equalsIgnoreCase("Analytics"))
			{
		       footerPage.click_analytics_link();
			}
			else {
				System.out.println("No section link found!");
				 }
	 
		 }
		
	}
}
