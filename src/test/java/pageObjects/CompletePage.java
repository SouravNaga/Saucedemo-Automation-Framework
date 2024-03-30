package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends BasePage{

	public CompletePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//h2[@class='complete-header'][@data-test='complete-header']")
	WebElement confirm_msg;
	
	@FindBy(xpath="//button[@id=\"back-to-products\"]")
	WebElement BackHome_btn;
	
	///methods
	public String getConfirmmsg()
	{
		String msg = confirm_msg.getText();
		return msg;
	}
	
	public void clickBackhomebtn()
	{
		BackHome_btn.click();
	}
}
