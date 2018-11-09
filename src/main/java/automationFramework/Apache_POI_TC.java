package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModule.SignIn_Action;
import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI_TC {

	private static WebDriver driver = null;

public static void main(String[] args) throws Exception {

//This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

System.setProperty("webdriver.chrome.driver", "C:/Users/mislam/eclipse-workspace/all_jar/chromedriver_win32/chromedriver.exe");
driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();

// Launch the Online Store Website using Constant Variable

driver.get(Constant.URL);

// Pass Constant Variables as arguments to Execute method

SignIn_Action.Execute_3(driver);

//This is to send the PASS value to the Excel sheet in the result column.

//ExcelUtils.setCellData("Pass", 1, 3);

}
}
