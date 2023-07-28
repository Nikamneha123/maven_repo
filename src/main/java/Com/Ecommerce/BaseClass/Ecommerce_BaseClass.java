package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.math3.stat.inference.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Ecommerce_BaseClass {
	public WebDriver driver;
	
	@BeforeMethod
	
	public void initialization() {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 Logger log=Logger.getLogger("Open Browser");
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fregisterresult%2F1");
		
		 driver.get("https://demo.nopcommerce.com/");
	}
	@AfterMethod
	
	public void Teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}

}
