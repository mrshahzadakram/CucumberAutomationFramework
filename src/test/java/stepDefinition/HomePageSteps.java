package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import context.TestContext;
import io.cucumber.java.en.Given;
import pages.PatientBanner;


public class HomePageSteps {

	TestContext testContext;
	PatientBanner patientBanner;
	WebDriver driver;
	
	 public HomePageSteps(TestContext context) {
	 testContext = context;
	 patientBanner = testContext.getPageObjectManager().getPatientBannerPage();
	 }
	
	// Test Case ID = PE_TC001
	@Given("the user is on home page")
	public void the_user_is_on_home_page() {
		String message = patientBanner.find_message_on_home_page();
		Assert.assertEquals(message, "No Patient Selected");
		
			}

	
	
}
