package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	By css_search_icon = By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/a/img");
	By css_search_text = By.cssSelector("input[placeholder='Search']");
	By xpath_aldo_patient = By.xpath("//h5[contains(text(),'Appointment, Test')]");
	By css_searched_patients_dropdown_results = By.cssSelector("li[class='MuiListItem-root MuiListItem-gutters']");
	WebDriver driver = null;
	
	
	 public SearchPage(WebDriver driver) {
		 	this.driver=driver;
	 }
	
	 public void click_search_icon()
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 60);
	     wait.until(ExpectedConditions.elementToBeClickable(css_search_icon));
//		 Actions action = new Actions(driver);
//			WebElement settings = driver.findElement(css_search_icon);
//			action.moveToElement(settings).perform();
//			action.moveToElement(settings).click(settings).build().perform();

       driver.findElement(css_search_icon).click();  
	 }
	 
   public void enter_user_name(String txt) throws InterruptedException
   {
	   Thread.sleep(2000);
  	 WebDriverWait wait = new WebDriverWait(driver, 40);
	     wait.until(ExpectedConditions.elementToBeClickable(css_search_text));
	     WebElement searchbox =  driver.findElement(css_search_text);
	     searchbox.sendKeys(txt);
	     searchbox.sendKeys(Keys.ENTER);  
	     searchbox.sendKeys(Keys.ENTER);
	     searchbox.sendKeys(Keys.ENTER);
       
   }

   public void click_dropdown_records()
   {
  	 WebDriverWait wait = new WebDriverWait(driver, 40);
	     wait.until(ExpectedConditions.elementToBeClickable(xpath_aldo_patient));
       driver.findElement(xpath_aldo_patient).click();
   }

   

}
