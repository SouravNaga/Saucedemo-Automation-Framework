package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage{

	WebDriver driver;
	public loginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id=\"user-name\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@id=\"login-button\"]")
	WebElement login_btn;
	
	public void login_operation(String user,String pwd)
	{
		username.clear();
		username.sendKeys(user);
		password.clear();
		password.sendKeys(pwd);
		login_btn.click();
		
	}
	
}
