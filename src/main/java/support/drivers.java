package support;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class drivers 
{
	public static WebDriver driver;
	 
	  public static WebDriver getdriver(){
		  System.setProperty("webdriver.chrome.driver", ConfigReader.getInstance().getDriverPath());
		   driver = new ChromeDriver();
	    if (driver == null)
	    {
	      driver = new ChromeDriver();
	      return driver;
	    }
	    else
	    {
	      return driver;
	    }
	  }

}
