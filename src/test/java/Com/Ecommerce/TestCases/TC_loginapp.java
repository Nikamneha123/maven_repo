package Com.Ecommerce.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecom_BaseClass;
import Com.Ecommerce.PageClasses.TC_Ecommerce_login_page;

public class TC_loginapp extends  Ecom_BaseClass {
	
	@Test
	
	public void login() throws InterruptedException {
		
		TC_Ecommerce_login_page TE=new TC_Ecommerce_login_page();
		
		TE.Username(Username);
		logger.info("enter the user email");
		
		Thread.sleep(2000);
		
		TE.Password(Password);
		logger.info("enter the user password");
		
		Thread.sleep(2000);
		
		TE.click_login();
		logger.info("click login");
		
		Thread.sleep(2000);
String title = driver.getTitle();
		
		if(title.equals("nopCommerce demo store")) {
			Assert.assertTrue(false);
			logger.info("log in test case pass");
		}
		else {
			Assert.assertTrue(false);
			logger.info("log in test case fail");
		}
		
		
	}

}
