package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
	
	public static WebDriver driver = null;
	 
    public static WebDriver openBrowser(int iTestCaseRow) throws Exception{
 
        String sBrowserName;
 
        try{
 
        sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
 
        if(sBrowserName.equals("Chrome")){
 
        	System.setProperty("webdriver.chrome.driver", "C:/Users/mislam/eclipse-workspace/all_jar/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
 
            Log.info("New driver instantiated");
 
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
            Log.info("Implicit wait applied on the driver for 10 seconds");
 
            driver.get(Constant.URL);
 
            Log.info("Web application launched successfully");
 
            }
 
        }catch (Exception e){
 
            Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
 
        }
 
        return driver;
 
    }
    
    

    
    

}
