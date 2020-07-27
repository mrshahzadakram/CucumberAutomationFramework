package stepDefinition;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import context.TestContext;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;



public class Hooks{

	 TestContext testContext;
    

//    public Hooks(BaseUtil base) {
//        this.base = base;
//    }
    public Hooks(TestContext context) {
        this.testContext = context;
    }

    @Before
    public void InitializeTest(Scenario scenario) {

       
        System.out.println("Opening the browser : Chrome"+scenario.getName());

          }


    @After
    public void TearDownTest(Scenario scenario) throws IOException {
    	
        if (scenario.isFailed()) {
        	 System.out.println("Taking the screenshot!");
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
            TakesScreenshot ts = (TakesScreenshot)testContext.getWebDriverManager().getDriver();
            File srcFile = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("C:\\Users\\shahzad.akram\\eclipse-workspace\\AutomationPersiviaUI\\target\\Screenshots\\"+scenario.getName()+".jpg"));
        }
        System.out.println("Closing the browser");
        testContext.getWebDriverManager().closeDriver();
    }

    @BeforeStep
    public void BeforeEveryStep(Scenario scenario) {
        System.out.println("Before every step " + scenario.getId());
    }

    @AfterStep
    public void AfterEveryStep(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
    	System.out.println("After every step " + scenario.getId());
    	
    }

}

	 /*
	 public void beforeScenario(Scenario scenario) {
	     Reporter.assignAuthor("PE Extension QA - Shahzad Akram");
	 }
	 
	 @After(order = 1)
	 public void afterScenario(Scenario scenario) {
	 if (scenario.isFailed()) {
	 String screenshotName = scenario.getName().replaceAll(" ", "_");
	 try {
	 //This takes a screenshot from the driver at save it to the specified location
	 File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
	 
	 //Building up the destination path for the screenshot to save
	 //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
	 File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
	 
	 //Copy taken screenshot from source location to destination location
	 Files.copy(sourcePath, destinationPath);   
	 
	 //This attach the specified screenshot to the test
	 Reporter.addScreenCaptureFromPath(destinationPath.toString());
	 } catch (IOException e) {
	 } 
	 }
	 }
	 */
	

