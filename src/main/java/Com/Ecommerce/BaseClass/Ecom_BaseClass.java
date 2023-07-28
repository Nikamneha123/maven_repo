package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.Ecommerce.Utilities.ReadConfiguration;

public class Ecom_BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
	
	ReadConfiguration read=new ReadConfiguration();
	
	public String BaseURL=read.GetURL();
	
	public String Username=read.UName();
	
	public String Password=read.Password();
	
	
	
	@BeforeMethod
	
	@Parameters("Browser")
	
	public void initialization(String browser) {
		
		
		logger=logger.getLogger("Maven_project");
		PropertyConfigurator.configure("C:\\Users\\admin\\eclipse-workspace\\Maven_project\\Configuration\\log4j.properties");
		
		if(browser.equals("Chrome")) {
			System.setProperty("Webdriver.chrome.driver", read.GetCrome());
			driver=new ChromeDriver();
		}
		else if(browser.equals("FireFox")) {
			
			System.setProperty("Webdriver.gecko.driver", read.GetFireFox());
			driver=new FirefoxDriver();
		}
		
		logger.info("Open browser");
		
		driver.manage().window().maximize();
		
		logger.info("maximize the browser");
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 
		 driver.get(BaseURL);
		 
		 logger.info("Open application");
		
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}

}
