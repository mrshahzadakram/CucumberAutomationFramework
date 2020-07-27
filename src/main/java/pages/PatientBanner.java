package pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientBanner {
	By id_tabs_panel = By.id("panelID");
	List<String> list=new ArrayList<String>();
	WebDriver driver = null;
	By id_tabs = By.cssSelector("[id=nav-tab]>a");
	By css_home_page_message = By.cssSelector("span[class='badge m-4 badge-warning']");
	By css_patient_name = By.cssSelector("[class*='patient-name']");
	
	public PatientBanner(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String find_name_on_banner()
	{
		String name;
		WebDriverWait wait = new WebDriverWait(driver, 40);
	     wait.until(ExpectedConditions.elementToBeClickable(css_patient_name));
	     Actions action = new Actions(driver);
			WebElement settings = driver.findElement(css_patient_name);
			action.moveToElement(settings).click(settings).build().perform();
			name = driver.findElement(css_patient_name).getText();
		return name;
	}
	
	public int find_data_on_banner() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
	     wait.until(ExpectedConditions.elementToBeClickable(id_tabs_panel));
	     Actions action = new Actions(driver);
			WebElement settings = driver.findElement(id_tabs_panel);
			action.moveToElement(settings).perform();
			action.moveToElement(settings).click(settings).build().perform();
			action.moveToElement(settings).click(settings).build().perform();
			List<WebElement> items = driver.findElements(id_tabs_panel);
		int a =	items.size();
      
      System.out.println(a);
      return a;
	}
	
	public int find_no_of_tabs()
	{
	    Actions action = new Actions(driver);
				WebElement settings = driver.findElement(id_tabs);
				action.moveToElement(settings).perform();
				action.moveToElement(settings).click(settings).build().perform();
				action.moveToElement(settings).click(settings).build().perform();
				List<WebElement> items = driver.findElements(id_tabs);
			int n =	items.size();
			System.out.println(n);

		return n;
		
	}
	
	public String find_message_on_home_page() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
	     wait.until(ExpectedConditions.elementToBeClickable(css_home_page_message));
	     Actions action = new Actions(driver);
			WebElement settings = driver.findElement(css_home_page_message);
			action.moveToElement(settings).perform();
			action.moveToElement(settings).build().perform();
			
		String message = settings.getText();
      
      System.out.println("Home Page: Message at Patient Banner before Selecting a patient: " +message);
      return message;
	}

}
