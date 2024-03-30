package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CheckoutYourInformationPage;
import pageObjects.CompletePage;
import pageObjects.OverviewPage;
import pageObjects.YourcartPage;
import pageObjects.loginPage;
import pageObjects.productsPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class EndToEnd_Test extends BaseClass{
	
	@Test(dataProvider="userinformationData",dataProviderClass=DataProviders.class)
	public void endtoendtest(String fname, String lname, String zipcode)
	{
		logger.info("********End to End testing started********");
		try {
			CheckoutYourInformationPage cp = new CheckoutYourInformationPage(driver);
			CompletePage cmp = new CompletePage(driver);
			loginPage lp = new loginPage(driver);
			OverviewPage op = new OverviewPage(driver);
			productsPage pp = new productsPage(driver);
			YourcartPage yp = new YourcartPage(driver);
			
			
			lp.login_operation(p.getProperty("username"), p.getProperty("password"));
			logger.info("login user name entered");
			logger.info("login password entered");
			
			pp.clickAddToCart();
			logger.info("Product added to cart");
			pp.clickCarticon();
			logger.info("Cart page opened successfully");
			
			yp.click_checkoutBtn();
			logger.info("Product Checkout successfully");
			
			cp.enterFirstname(fname);
			logger.info("First Name entered successfully");
			cp.enterLastname(lname);
			logger.info("Last Name entered successfully");
			cp.enterZip(zipcode);
			logger.info("Zip Code entered successfully");
			cp.clickContinue();
			
			System.out.println("Item Name: "+op.getItemname());
			System.out.println("Item Quantity: "+op.getItemqty());
			System.out.println("Payment Information:"+op.getPaymentinfo());
			System.out.println("Shipping Information:"+op.getShippinginfo());
			System.out.println("Price Total: "+op.getTotalprice());
			logger.info("Item Name: "+op.getItemname());
			logger.info("Item Quantity: "+op.getItemqty());
			logger.info("Payment Information:"+op.getPaymentinfo());
			logger.info("Shipping Information:"+op.getShippinginfo());
			logger.info("Price Total: "+op.getTotalprice());
			op.clickFinish();
			logger.info("Finish button clicked successfully");
			
			System.out.println("Confirmation message : "+cmp.getConfirmmsg());
			logger.info("Confirmation message : "+cmp.getConfirmmsg());
			cmp.clickBackhomebtn();
			logger.info("Back to home page");
			
			pp.logout();
			logger.info("log out successfully");
			
		}
		catch(Exception e)
		{
			logger.error("Login is not successful");
			Assert.fail("An exception occurred: " + e.getMessage());
			
		}
		logger.info("********End to End testing Finished********");
	}

}
