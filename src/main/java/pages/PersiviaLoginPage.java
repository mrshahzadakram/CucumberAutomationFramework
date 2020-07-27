package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersiviaLoginPage {
	WebDriver driver = null;
	 By id_username_textfield = By.id("username");
     By id_password_textfield = By.id("userpwd");
     By id_signin_btn = By.id("loginButton");
	
	 public PersiviaLoginPage(WebDriver driver) {
		 	this.driver=driver;
	 }
	
    public void enter_user_name(String txt)
    {
   	 WebDriverWait wait = new WebDriverWait(driver, 40);
	     wait.until(ExpectedConditions.elementToBeClickable(id_signin_btn));
        driver.findElement(id_username_textfield).sendKeys(txt);   
    }

    public void enter_user_pwd(String pwd)
    {
   	 WebDriverWait wait = new WebDriverWait(driver, 40);
	     wait.until(ExpectedConditions.elementToBeClickable(id_signin_btn));
        driver.findElement(id_password_textfield).sendKeys(pwd);
    }

    public void click_login_button()
    {
        driver.findElement(id_signin_btn).click();
    }



}
