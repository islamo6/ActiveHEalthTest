package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Import package pageObject.*

import pageObjects.Home_Page;

import pageObjects.LogIn_Page;

public class PageObjectModel {

private static WebDriver driver = null;


public static void main(String[] args) {

//System.setProperty("webdriver.chrome.driver", "C:/Users/mislam/eclipse-workspace/all_jar/chromedriver_win32/chromedriver.exe");
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();

driver.get("https://ceweb.azqa1.ahmcert.com:8443/ce2web/validate.do");

// Use page Object library now


LogIn_Page.txtbx_UserName(driver).sendKeys("role_operator");

LogIn_Page.txtbx_Password(driver).sendKeys("welcome");

LogIn_Page.btn_LogIn(driver).click();

System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

Home_Page.lnk_LogOut(driver).click(); 

System.out.println(" Logout Successfully, now it is the time to Log Off buddy.");


driver.quit();

}
}
