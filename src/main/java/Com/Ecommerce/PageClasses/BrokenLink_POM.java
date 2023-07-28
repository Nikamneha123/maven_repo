package Com.Ecommerce.PageClasses;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URL;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
//import java.net.HttpURLConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenLink_POM {

	public WebDriver driver;

	public BrokenLink_POM(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(tagName = "a") // links
	public List<WebElement> AllLinks;

	public void Broken() throws IOException {

		System.out.println("Number of linkd=======>" + AllLinks.size());

		int Brokenlinks = 0;

		for (WebElement element : AllLinks) {
			String url = element.getAttribute("href");
			if (url == null || url.isEmpty()) {

				System.out.println("url is empty or null");

			}
			URL Link = new URL(url);
			CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
			// HttpsURLConnection httpscode=(HttpsURLConnection) Link.openConnection();

			HttpsURLConnection httpscode = (HttpsURLConnection) Link.openConnection();
			// HttpURLConnection httpscode= (HttpURLConnection) L2.openConnection();
			httpscode.connect();

			// 200=========ok
			// 201=======created
			// 400===========bad request

			if (httpscode.getResponseCode() >= 400) {

				System.out.println(httpscode.getResponseCode() + "==>" + url + "is=========>broken list");

				Brokenlinks++;
			} else {
				System.out.println(httpscode.getResponseCode() + "========>" + url + "is=======>valid list");

			}
		}

		System.out.println("number of broken list======>" + Brokenlinks);

		driver.quit();

	}
}
