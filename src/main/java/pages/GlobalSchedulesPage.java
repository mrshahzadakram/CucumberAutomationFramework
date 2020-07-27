package pages;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalSchedulesPage {
	WebDriver driver;
	
	By id_calender = By.id("dp");
	By css_today_btn = By.cssSelector("[class='MuiButtonBase-root MuiButton-root MuiButton-outlined']");
	By id_date_text = By.id("date");
	
	public GlobalSchedulesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public int find_data_on_global_schedules_screen()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
	     wait.until(ExpectedConditions.elementToBeClickable(id_calender));
	     Actions action = new Actions(driver);
			WebElement settings = driver.findElement(id_calender);
			action.moveToElement(settings).click(settings).build().perform();
		
			List<WebElement> items = driver.findElements(id_calender);
			int a =	items.size();
			System.out.println("-------------------Global Schedules Method------------");
			for (int i=0;i<a;i++)
			{
				System.out.println(items.get(i).getText());
			}
			System.out.println("----------------Data on Global schedules------------------------");
			
	      System.out.println(a);
	      
	      return a;
		
	}

	
	public String get_text_today_btn()
	{
		return driver.findElement(css_today_btn).getText();
	}
	
	public void click_today_btn()
	{
		driver.findElement(css_today_btn).click();
	}
	
	public String get_date_field_text()
	{
		
		String date = driver.findElement(id_date_text).getAttribute("value");
		System.out.println("actual date = "+date);
		return date;
	}
	public String currentDate()
	{
		// displaying today's date
	      Format f = new SimpleDateFormat("yyyy-MM-dd");
	      String strDate = f.format(new Date());
	      System.out.println("Current Date = "+strDate);
	      return strDate;
	}
	

}
