package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Log;

public class Home_Page {

	private static WebElement element = null;

	public static WebElement lnk_MyAccount(WebDriver driver) {

		element = driver.findElement(By.id("account"));
		
		Log.info("My Account link element found");

		return element;

	}

	public static WebElement lnk_LogOut(WebDriver driver) {

		element = driver.findElement(By.xpath("//span[@id='mainnav-side']/a"));
		
		Log.info("Logout link element found");

		return element;

	}

	public static WebElement lnk_SignIn(WebDriver driver) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/mislam/eclipse-workspace/all_jar/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://ceweb.azqa1.ahmcert.com:8443/ce2web/validate.do");
		
		Log.info("lnk_SignIn element found");

		
		return element;
	}

}
