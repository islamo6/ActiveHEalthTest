package appModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.ExcelUtils;
import utility.Log;

public class SignIn_Action {
	
	private static WebDriver driver = null;
	
	public static void Execute_1 (WebDriver driver){
		 
		   LogIn_Page.txtbx_UserName(driver).sendKeys("role_operator");

		   LogIn_Page.txtbx_Password(driver).sendKeys("welcome");

		   LogIn_Page.btn_LogIn(driver).click();

		   System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		   Home_Page.lnk_LogOut(driver).click(); 

		   System.out.println(" Logout Successfully, now it is the time to Log Off buddy.");


		   driver.quit();
		   }
	
	public static void Execute_2 (WebDriver driver, String sUsername, String sPassword){
		 
		   LogIn_Page.txtbx_UserName(driver).sendKeys(sUsername);

		   LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

		   LogIn_Page.btn_LogIn(driver).click();

		   System.out.println(" Login Successfully, now it is the time to Log Off buddy : Passed");

		   Home_Page.lnk_LogOut(driver).click(); 

		   System.out.println(" Logout Successfully, now it is the time to Log Off buddy : Passed");

		   driver.quit();
		   }
	
		 
		public static void Execute_3(WebDriver driver) throws Exception{
 
			//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
 
			String sUserName = ExcelUtils.getCellData(1, 1);
			
			Log.info("Username picked from Excel is "+ sUserName );
 
			String sPassword = ExcelUtils.getCellData(1, 2);
			
			Log.info("Password picked from Excel is "+ sPassword );
 
			LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
			
			Log.info("Username entered in the Username text box");

			LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
			
			Log.info("Password entered in the Password text box");

			LogIn_Page.btn_LogIn(driver).click();
			
			Log.info("Click action performed on Submit button");

			System.out.println(" Login Successfully, now it is the time to Log Off buddy : Passed");
			
			Thread.sleep(300);
			
			Home_Page.lnk_LogOut(driver).click(); 
			
			Log.info("Click action performed on lnk_LogOut button");

			System.out.println(" Logout Successfully, now it is the time to Log Off buddy : Passed");

			
	}
 
        }
		 
