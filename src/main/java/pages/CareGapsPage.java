package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareGapsPage {
	WebDriver driver=null;
	By xpath_columns_count = By.xpath("//div[@id='cp']//div//thead[@class='MuiTableHead-root']//tr//th");
	By id_caregaps_tab = By.id("care-plans");
	By css_1st_column = By.cssSelector("div[id='cp']>div>div>div>table>thead>tr>th:nth-of-type(1)");
	By css_2nd_column = By.cssSelector("div[id='cp']>div>div>div>table>thead>tr>th:nth-of-type(2)");
	By css_3rd_column = By.cssSelector("div[id='cp']>div>div>div>table>thead>tr>th:nth-of-type(3)");
	By css_4th_column = By.cssSelector("div[id='cp']>div>div>div>table>thead>tr>th:nth-of-type(4)");
	By css_5th_column = By.cssSelector("div[id='cp']>div>div>div>table>thead>tr>th:nth-of-type(5)");
	
	public CareGapsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public int find_no_of_tabs()
	{
		 WebDriverWait wait = new WebDriverWait(driver, 40);
	     wait.until(ExpectedConditions.elementToBeClickable(xpath_columns_count));
	    Actions action = new Actions(driver);
				WebElement settings = driver.findElement(xpath_columns_count);
				action.moveToElement(settings).perform();
				action.moveToElement(settings).click(settings).build().perform();
				List<WebElement> items = driver.findElements(xpath_columns_count);
		     	int n =	items.size();
		     	System.out.println(n);
		     	for (int i=0;i<n;i++)
				{
					System.out.println(items.get(i).getText());
				}
		     	return n;
		
	}

	public void click_careGaps_tab()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
	     wait.until(ExpectedConditions.elementToBeClickable(id_caregaps_tab));
		 Actions action = new Actions(driver);
			WebElement settings = driver.findElement(id_caregaps_tab);
			action.moveToElement(settings).perform();
			action.moveToElement(settings).click(settings).build().perform();
		
	}
	
	public String get_text_first_column()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
    wait.until(ExpectedConditions.elementToBeClickable(css_1st_column));
		
		String a = driver.findElement(css_1st_column).getText();
		return a;
	}
	
	public String get_text_second_column()
	{
		String a = driver.findElement(css_2nd_column).getText();
		return a;
	}
	public String get_text_third_column()
	{
		String a = driver.findElement(css_3rd_column).getText();
		return a;
	}
	public String get_text_fourth_column()
	{
		String a = driver.findElement(css_4th_column).getText();
		return a;
	}
	public String get_text_fifth_column()
	{
		String a = driver.findElement(css_5th_column).getText();
		return a;
	}
	

}
