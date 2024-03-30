package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourcartPage extends BasePage{

	public YourcartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//button[@id=\"continue-shopping\"]")
	WebElement continue_shopping_btn;
	
	@FindBy(xpath="//button[@id=\"checkout\"]")
	WebElement checkout_btn;
	
	@FindBy(xpath="//button[@id=\"remove-sauce-labs-backpack\"]")
	WebElement remove_btn;
	
	public void click_continueShoppingBtn()
	{
		continue_shopping_btn.click();
	}

	public void click_checkoutBtn()
	{
		checkout_btn.click();
	}
	
	public void click_removeBtn()
	{
		remove_btn.click();
	}
}
