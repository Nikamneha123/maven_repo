package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecom_BaseClass;
import Com.Ecommerce.PageClasses.TC_Ecommerce_login_page;
import Com.Ecommerce.Utilities.XLSUtils;

public class TestData extends Ecom_BaseClass {
@Test(dataProvider="Logindata")
	
	public void login(String Username,String Password,String Expected) throws InterruptedException {
		
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
		
		String  Act_title=driver.getTitle();
		String exp_title="nopCommerce demo store";
		
		if(Expected.equals("Valid")) {
			
			if(Act_title.equals(exp_title)) {
				
				AssertJUnit.assertTrue(true);
				
				logger.info("pass");
			}
			else {
				Assert.assertTrue(false);
				
				logger.info("fail");
			}
			
			if(Expected.equals("Invalid")) {
				
				if(Act_title.equals(exp_title)) {
					
					AssertJUnit.assertTrue(true);
					
					logger.info("pass");
				}
				else {
					Assert.assertTrue(false);
					
					logger.info("fail");
				}
			
		}
		}
}
	
		@DataProvider(name="Logindata")
		public String[][] getdata() throws IOException{
			String path="C:\\Users\\admin\\eclipse-workspace\\Maven_project\\src\\main\\java\\Com\\Ecommerce\\TestData\\11Match_TestData.xlsx";
			
			int rownum=XLSUtils.getRowcount(path, "Sheet1");
			int Colcount=XLSUtils.getCellcount(path, "Sheet1",1);
			
			String logindata[][]=new String [rownum][Colcount];
			
			for(int i=1;i<=rownum;i++) {
				
				for(int j=0;j<Colcount;j++) {
					logindata[i-1][j]=XLSUtils.getCelldata(path, "Sheet1",i, j);
				}
			}
			return logindata;
			
		
	
		}



}
