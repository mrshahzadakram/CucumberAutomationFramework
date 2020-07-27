package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterPage {
	WebDriver driver;

	By css_footer_row = By.cssSelector("[class='col p-2 m-1']");
	//patient care plan link
	By css_1st_footer_link = By.cssSelector("[class='col p-2 m-1']:nth-of-type(1)");
	//care views link
	By css_2nd_footer_link = By.cssSelector("[class='col p-2 m-1']:nth-of-type(2)");
	//care gaps link
	By css_3rd_footer_link = By.cssSelector("[class='col p-2 m-1']:nth-of-type(3)");
	//assessments link
	By css_4th_footer_link = By.cssSelector("[class='col p-2 m-1']:nth-of-type(4)");
	//global schedules link
	By css_5th_footer_link = By.cssSelector("[class='col p-2 m-1']:nth-of-type(5)");
	//analytics link
	By css_6th_footer_link = By.cssSelector("[class='col p-2 m-1']:nth-of-type(6)");
	
	public FooterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public int find_data_on_footer()
	{
		
	     Actions action = new Actions(driver);
			WebElement settings = driver.findElement(css_footer_row);
			action.moveToElement(settings).build().perform();
		
			List<WebElement> items = driver.findElements(css_footer_row);
			int a =	items.size();
	      
			for (int i=0;i<a;i++)
			{
				System.out.println(items.get(i).getText());
			}
	      System.out.println(a);
	 
	      return a;
		
	}
	
	public String get_text_first_icon_text()
	{
		
		String a = driver.findElement(css_1st_footer_link).getText();
		return a;
	}
	
	public String get_text_second_icon_text()
	{
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//        wait.until(ExpectedConditions.elementToBeClickable(css_2nd_footer_link));
		String a = driver.findElement(css_2nd_footer_link).getText();
		return a;
	}
	public String get_text_third_icon_text()
	{
		
		String a = driver.findElement(css_3rd_footer_link).getText();
		return a;
	}
	public String get_text_fourth_icon_text()
	{
		
		String a = driver.findElement(css_4th_footer_link).getText();
		return a;
	}
	public String get_text_fifth_icon_text()
	{
				String a = driver.findElement(css_5th_footer_link).getText();
		return a;
	}
	public String get_text_sixth_icon_text()
	{
		
		String a = driver.findElement(css_6th_footer_link).getText();
		return a;
	}
	
	public void click_global_schedules_link()
	{
		driver.findElement(css_5th_footer_link).click();
	}
	
	public void click_analytics_link()
	{
		driver.findElement(css_6th_footer_link).click();
	}
}
