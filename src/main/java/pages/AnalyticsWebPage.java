package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AnalyticsWebPage {
	WebDriver driver;
	
	public AnalyticsWebPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By css_sections_dashboards = By.cssSelector("[class='m-0']");
	By css_dashboard_reports_links = By.cssSelector("[class='navbar-nav mr-auto']>li");
	
	
	public int find_no_of_links()
	{
//		 WebDriverWait wait = new WebDriverWait(driver, 40);
//	     wait.until(ExpectedConditions.elementToBeClickable(css_dashboard_reports_links));
	    Actions action = new Actions(driver);
				WebElement settings = driver.findElement(css_dashboard_reports_links);
				action.moveToElement(settings).perform();
				action.moveToElement(settings).click(settings).build().perform();
				List<WebElement> items = driver.findElements(css_dashboard_reports_links);
		     	int n =	items.size();
		     	System.out.println(n);
		     	for (int i=0;i<n;i++)
				{
					System.out.println(items.get(i).getText());
				}
		     	return n;
	}
	

	public int find_no_of_sections()
	{
//		 WebDriverWait wait = new WebDriverWait(driver, 40);
//	     wait.until(ExpectedConditions.elementToBeClickable(css_sections_dashboards));
	    Actions action = new Actions(driver);
				WebElement settings = driver.findElement(css_sections_dashboards);
				action.moveToElement(settings).perform();
				action.moveToElement(settings).click(settings).build().perform();
				List<WebElement> items = driver.findElements(css_sections_dashboards);
		     	int n =	items.size();
		     	System.out.println(n);
		     	for (int i=0;i<n;i++)
				{
					System.out.println(items.get(i).getText());
				}
		     	return n;
	}
	
	public String find_url_of_page()
	{
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		// driver.switchTo().window(tabs.get(0));
		System.out.println(url);
		String[] u=url.split("\\?",2);
		System.out.println(u[0]);
		return u[0];

		
	}
	

	
}
