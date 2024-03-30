package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage{

	public OverviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//button[@id=\"cancel\"]")
	WebElement cancel_btn;
	
	@FindBy(xpath="//button[@id=\"finish\"]")
	WebElement finish_btn;
	
	@FindBy(xpath="//div[@class='summary_value_label'][@data-test='payment-info-value']")
	WebElement payment_info;
	
	@FindBy(xpath="//div[@class='summary_value_label'][@data-test='shipping-info-value']")
	WebElement shipping_info;
	
	@FindBy(xpath="//div[@class='summary_total_label'][@data-test='total-label']")
	WebElement total_price;
	
	@FindBy(xpath="//div[@class='inventory_item_name'][@data-test='inventory-item-name']")
	WebElement item_name;
	
	@FindBy(xpath="//div[@class='cart_quantity'][@data-test='item-quantity']")
	WebElement item_qty;
	
	//methods
	
	public void clickCancel()
	{
		cancel_btn.click();
	}
	public void clickFinish()
	{
		finish_btn.click();
	}
	public String getPaymentinfo()
	{
		String pinfo = payment_info.getText();
		return pinfo;
	}
	public String getShippinginfo()
	{
		String sinfo = shipping_info.getText();
		return sinfo;
	}
	public String getTotalprice()
	{
		String tprice = total_price.getText();
		return tprice;
	}
	public String getItemname()
	{
		String iname = item_name.getText();
		return iname;
	}
	public String getItemqty()
	{
		String iqty = item_qty.getText();
		return iqty;
	}

}
