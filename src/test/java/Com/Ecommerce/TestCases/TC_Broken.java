package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecom_BaseClass;
import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
//import Com.Ecommerce.Baseclass.Ecommerce_Base_class;
import Com.Ecommerce.PageClasses.BrokenLink_POM;

public class TC_Broken extends  Ecommerce_BaseClass {
	

		
		
		@Test
		public void B_links() throws IOException {
			
			BrokenLink_POM BL=new BrokenLink_POM(driver);
			
			BL.Broken();
			
			
			
			
		}
	}


