package automationFramework;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModule.SignIn_Action;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class UDF_TC {
	
	public WebDriver driver;
	 
    private String sTestCaseName;
 
    private int iTestCaseRow;
 
    @BeforeMethod
 
  public void beforeMethod() throws Exception {
 
         DOMConfigurator.configure("log4j.xml");
 
         sTestCaseName = this.toString();
 
         sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
 
        Log.startTestCase(sTestCaseName);
 
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
 
        iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
 
        driver = Utils.openBrowser(iTestCaseRow);
 
        }
 
    @Test
 
  public void main() throws Exception {
 
        SignIn_Action.Execute_3(driver);
 
        System.out.println("Login Successfully, SignIn_Action.Execute_3.");
		
 
        }
 
   @AfterMethod
 
  public void afterMethod() {
 
        driver.quit();
        
		Log.info("Browser closed");
 
        }

}
