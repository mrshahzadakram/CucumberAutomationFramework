package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AUCPage {
	WebDriver driver;
	
	By id_auc_tab = By.id("Auc");
	By xpath_auc_search_text = By.xpath("//h2[contains(text(),'Please select an exam or indication')]");
	
	
	public AUCPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click_auc_tab()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
	    wait.until(ExpectedConditions.elementToBeClickable(id_auc_tab));
		driver.findElement(id_auc_tab).click();
	}
	
	public String find_text_search_bar()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		String t = driver.findElement(xpath_auc_search_text).getText();
		return t;
	}
}
