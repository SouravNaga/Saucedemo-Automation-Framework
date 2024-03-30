package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPage extends BasePage{

	public CheckoutYourInformationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//button[@id=\"cancel\"]")
	WebElement cancel_btn;
	
	@FindBy(xpath="//input[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id=\"last-name\"]")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id=\"postal-code\"]")
	WebElement zipcode;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	WebElement continue_btn;
	
	@FindBy(xpath="//div[@class=\"error-message-container error\"]")
	WebElement error_field;
	
	//methods
	
	public String find_error_msg()
	{
		String error_msg = error_field.getText();
		return error_msg;
	}
	public void enterFirstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	public void enterLastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void enterZip(String zip)
	{
		zipcode.sendKeys(zip);
	}
	public void clickContinue()
	{
		continue_btn.click();
	}
	public void clickCancel()
	{
		cancel_btn.click();
	}
}
