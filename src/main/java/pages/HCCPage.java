package pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HCCPage {
	
	WebDriver driver=null;
	
	
	By id_hcc_tab = By.id("score");
	By xpath_active_problem_list_columns = By.xpath("//div[@id='score_hcc']//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div[1]//table[1]//thead[1]//tr[1]//th");
	
	By xpath_dropped_codes_columns = By.xpath("//div[@id='score_hcc']//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div[2]//table//thead//tr/th");
	By xpath_1st_col_of_list = By.xpath("//div[@id='score_hcc']//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div[1]//table[1]//thead[1]//tr[1]//th[1]");
	By xpath_2nd_col_of_list = By.xpath("//div[@id='score_hcc']//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div[1]//table[1]//thead[1]//tr[1]//th[2]");
	By xpath_3rd_col_of_list = By.xpath("//div[@id='score_hcc']//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div[1]//table[1]//thead[1]//tr[1]//th[3]");
	By xpath_4th_col_of_list = By.xpath("//div[@id='score_hcc']//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div[1]//table[1]//thead[1]//tr[1]//th[4]");
	
	By xpath_1st_col_of_dropped_codes = By.xpath("//div[@id='score_hcc']//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div[2]//table//thead//tr//th[1]");
	By xpath_2nd_col_of_dropped_codes = By.xpath("//div[@id='score_hcc']//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div[2]//table[1]//thead//tr[1]//th[2]");
	By xpath_3rd_col_of_dropped_codes = By.xpath("//div[@id='score_hcc']//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div[2]//table[1]//thead//tr[1]//th[3]");
	By xpath_4th_col_of_dropped_codes = By.xpath("//div[@id='score_hcc']//div[@class='MuiPaper-root MuiPaper-elevation1 MuiPaper-rounded']//div[2]//table[1]//thead//tr[1]//th[4]");
	
	public HCCPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	
	public void click_hcc_tab()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
	     wait.until(ExpectedConditions.elementToBeClickable(id_hcc_tab));
		driver.findElement(id_hcc_tab).click();
		
		
	}
	
	public int find_no_of_columns_of_active_problem_list()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Actions action = new Actions(driver);
	
		List<WebElement> items = driver.findElements(xpath_active_problem_list_columns);
		int n =	items.size();
		System.out.println(n);
		for (int i=0;i<n;i++)
		{
			System.out.println(items.get(i));
		}
		return n;
		
	}
	
	public int find_no_of_columns_of_dropped_codes()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		 Actions action = new Actions(driver);
//			WebElement settings = driver.findElement(xpath_dropped_codes_columns);
//			action.moveToElement(settings).perform();
//			action.moveToElement(settings).build().perform();
		List<WebElement> items = driver.findElements(xpath_dropped_codes_columns);
		int n =	items.size();
		System.out.println(n);
		return n;
	}
	
	//-----------------------------------------------------
	//--- Getting text from columns of dropped codes
	//-----------------------------------------------------
	
	public String get_text_first_column_dropped_codes()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
    wait.until(ExpectedConditions.elementToBeClickable(xpath_1st_col_of_dropped_codes));
		
		String a = driver.findElement(xpath_1st_col_of_dropped_codes).getText();
		return a;
	}
	
	public String get_text_second_column_dropped_codes()
	{
		String a = driver.findElement(xpath_2nd_col_of_dropped_codes).getText();
		return a;
	}
	public String get_text_third_column_dropped_codes()
	{
		String a = driver.findElement(xpath_3rd_col_of_dropped_codes).getText();
		return a;
	}
	public String get_text_fourth_column_dropped_codes()
	{
		String a = driver.findElement(xpath_4th_col_of_dropped_codes).getText();
		return a;
	}
	
	//-----------------------------------------------------
	//--- Getting text from columns of Active list problems
	//-----------------------------------------------------
	public String get_text_of_first_column()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
    wait.until(ExpectedConditions.elementToBeClickable(xpath_1st_col_of_list));
		
		String a = driver.findElement(xpath_1st_col_of_list).getText();
		return a;
	}
	
	public String get_text_of_second_column()
	{
		String a = driver.findElement(xpath_2nd_col_of_list).getText();
		return a;
	}
	public String get_text_of_third_column()
	{
		String a = driver.findElement(xpath_3rd_col_of_list).getText();
		return a;
	}
	public String get_text_of_fourth_column()
	{
		String a = driver.findElement(xpath_4th_col_of_list).getText();
		return a;
	}
	

}
