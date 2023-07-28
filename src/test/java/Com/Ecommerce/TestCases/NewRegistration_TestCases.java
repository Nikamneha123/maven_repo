package Com.Ecommerce.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClasses.TC_NewRegistration;
import net.bytebuddy.utility.RandomString;

public class NewRegistration_TestCases extends Ecommerce_BaseClass {
	@Test
	public void Registration() {
		
		TC_NewRegistration NR=new TC_NewRegistration(driver);
		
		NR.Register();
		NR.SelectGender();
		NR.SetFirstname("NEHA");
		NR.SetLastname("NIKAM_PADGHAN");
		NR.Select_Day();
		NR.Select_Month();
		NR.Select_Year();
	
		
		String name=RandomString.make(5);
		NR.SetEmail(name + "nikamneha1@gmail.com");
		
		NR.SetPassword("Neha@1234");
		NR.SetConfirmPassword("Neha@1234");
		NR.ClickRegisterButton();
		
		boolean validate=driver.findElement(By.xpath("//div[text()=\"Your registration completed\"]")).isDisplayed();
		
		String xp="Your registration completed";
		if(xp.equals(validate)) {
			
			System.out.println("correct txt");
		}
		else {
			System.out.println("incorrect txt");
		}
	}

}
