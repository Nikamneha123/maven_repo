package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecom_BaseClass;

public class TC_Ecommerce_login_page extends Ecom_BaseClass {
	
	public TC_Ecommerce_login_page() {
		PageFactory.initElements(driver, this);
		
	}
@FindBy(id="Email")
public WebElement Username;

@FindBy(id="Password")
public WebElement Password;

@FindBy(xpath="//button[contains(text(),\"Log in\")]")
public WebElement login;

//@FindBy(xpath="//a[contains(text(),\"Log out\")]")
//public WebElement logout;


public void Username(String UN1) {
	Username.sendKeys(UN1);
}

public void Password(String Pass) {
	Password.sendKeys(Pass);
}

public void click_login() {
	login.click();
	
	
}










}
