package pageObjects;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import utility.Log;

public class LogIn_Page {

	private static WebElement element = null;

	public static WebElement txtbx_UserName(WebDriver driver){

		element = driver.findElement(By.id("j_username"));
		
		Log.info("Username text box found");

		return element;

	}

	public static WebElement txtbx_Password(WebDriver driver){

		element = driver.findElement(By.id("j_password"));
		
		Log.info("Password text box found");

		return element;

	}

	public static WebElement btn_LogIn(WebDriver driver){

		element = driver.findElement(By.name("save"));
		
		Log.info("Submit button found");

		return element;

}

}
