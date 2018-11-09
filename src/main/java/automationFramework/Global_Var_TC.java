package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import appModule.SignIn_Action;
import utility.Constant;

public class Global_Var_TC {
	
		private static WebDriver driver = null;
	 
		public static void main(String[] args) {

    	System.setProperty("webdriver.chrome.driver", "C:/Users/mislam/eclipse-workspace/all_jar/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

       // Launch the Online Store Website using Constant Variable

       driver.get(Constant.URL);

       // Pass Constant Variables as arguments to Execute method

       SignIn_Action.Execute_2(driver,Constant.Username,Constant.Password);



    }

}
