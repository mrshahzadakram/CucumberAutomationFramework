package stepDefinition;

import org.junit.Assert;

import context.TestContext;
import io.cucumber.java.en.Then;
import pages.AnalyticsWebPage;
import pages.FooterPage;
import pages.GlobalSchedulesPage;

public class GlobalSchedulesSteps {

	FooterPage footerPage;
	TestContext testContext;
	GlobalSchedulesPage globalSchedulesPage;
	AnalyticsWebPage analyticsWebPage;
	
	 public GlobalSchedulesSteps(TestContext context) {
		 testContext = context;
		 footerPage = testContext.getPageObjectManager().getFooterPage();
		 globalSchedulesPage = testContext.getPageObjectManager().getGlobalSchedulesPage(); 
		 analyticsWebPage = testContext.getPageObjectManager().getAnalyticsWebPage();
		 }
	
	@Then("the screen is toggled to calendar")
	public void the_screen_is_toggled_to_calendar() {
		
	int a =	globalSchedulesPage.find_data_on_global_schedules_screen();
	Assert.assertNotEquals(null, a);
	    
	}
	

	@Then("today button is available on calendar screen")
	public void today_button_is_available_on_calendar_screen() {
     String n = globalSchedulesPage.get_text_today_btn();
     Assert.assertEquals("TODAY", n);
	    
	}


	@Then("date field has date of today")
	public void date_field_has_date_of_today() {
    
		String actual= globalSchedulesPage.get_date_field_text();
		String expected = globalSchedulesPage.currentDate();
		System.out.println("expected date= "+expected);
		
	    Assert.assertEquals(actual, expected);
	    
	}
	
	@Then("the user lands on auc dashboard web page")
	public void the_user_lands_on_auc_dashboard_web_page() 
	{
		String u =analyticsWebPage.find_url_of_page();
		Assert.assertEquals("https://slt-int.solitontechnologies.com/PersiviaExtensionWeb/aucDashboard", u);

	int a=	analyticsWebPage.find_no_of_links();
	Assert.assertEquals(2, a);
	
	
	    
	}
	
	
}
