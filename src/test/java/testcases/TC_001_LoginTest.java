package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.loginPage;
import pageObjects.productsPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_001_LoginTest extends BaseClass{


	
	@Test(dataProvider="LoginData1",dataProviderClass=DataProviders.class)
	public void verify_login_functionality(String username, String password, String exp)
	{
		logger.info("*********Login Test started **********");
		
		try {
			
			loginPage lp = new loginPage(driver);
			
			lp.login_operation(username,password);
			logger.info("Login data is entered");
			logger.info("Login button clicked");
			productsPage pp = new productsPage(driver);
			boolean res = pp.cart_btn_presence();
			if(exp.equalsIgnoreCase("valid")) {
				
				if(res==true)
				{
					logger.info("Login is successful for: "+username);
					pp.logout();
					Assert.assertTrue(true);
					
				}
				else
				{
				
					logger.info("Login is not successful for: "+username);
					Assert.assertTrue(false);
				}
			}
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(res==true)
				{
					pp.logout();
					logger.info("Login is successful for invalid user : "+username);
					Assert.assertTrue(false);
				
		
				}
				else
				{
					logger.info("Login is not successful: "+username);
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			logger.error("Login is not successful");
			Assert.fail("An exception occurred: " + e.getMessage());
			
		}
		
		logger.info("*******Login Test Finished *********");
			
	}

}
