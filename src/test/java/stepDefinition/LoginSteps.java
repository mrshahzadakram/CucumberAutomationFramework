package stepDefinition;

import org.openqa.selenium.WebDriver;

import context.TestContext;
import io.cucumber.java.en.Given;
import pages.PersiviaLoginPage;
import support.ConfigReader;

public class LoginSteps 
{
	TestContext testContext;
	PersiviaLoginPage persiviaLoginPage;
	WebDriver driver;
	 public LoginSteps(TestContext context) {
	 testContext = context;
	 persiviaLoginPage = testContext.getPageObjectManager().getpersiviaLoginPage();
	 }
	
	@Given("the user has logged in")
	public void the_user_has_logged_in() {
		driver = testContext.getWebDriverManager().getDriver();
		driver.get(ConfigReader.getInstance().getBaseUrl());
		persiviaLoginPage.enter_user_name(ConfigReader.getInstance().getUserName());
		persiviaLoginPage.enter_user_pwd(ConfigReader.getInstance().getPassword());
		persiviaLoginPage.click_login_button();
			}

}
