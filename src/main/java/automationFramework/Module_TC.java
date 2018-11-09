package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModule.SignIn_Action;

public class Module_TC {
	
	private static WebDriver driver = null;
	 
    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.chrome.driver", "C:/Users/mislam/eclipse-workspace/all_jar/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://ceweb.azqa1.ahmcert.com:8443/ce2web/validate.do");

        SignIn_Action.Execute_1 (driver);


    }

}
