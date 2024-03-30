package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productsPage extends BasePage{

	public productsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@id=\"react-burger-menu-btn\"]")
	WebElement navbar;
	
	@FindBy(xpath="//a[@id=\"logout_sidebar_link\"]")
	WebElement logout_link;
	
	
	
	@FindBy(className="app_logo")
	WebElement heading;
	
	@FindBy(xpath="//select[@class=\"product_sort_container\"]")
	WebElement filter;
	
	@FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
	WebElement cart_btn;
	
	
	//below elements XPATH need to implement later
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement addtocart_btn;
	
	@FindBy(xpath="//img[@alt=\"Sauce Labs Backpack\"]")
	WebElement prod_img;
	
	@FindBy(xpath="//div[normalize-space()=\"Sauce Labs Backpack\"]")
	WebElement prod_title;
	
	@FindBy(className="inventory_item_price")
	WebElement prod_price;
	
	public boolean cart_btn_presence()
	{
		try {
			return (cart_btn.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	
	public void logout()
	{
		navbar.click();
		logout_link.click();
	}
	
	public void clickAddToCart()
	{
		addtocart_btn.click();
	}
	
	public void clickCarticon()
	{
		cart_btn.click();
	}
}
