package com.banking.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CommonMethods {

	WebDriver driver;
	
	public CommonMethods(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	public static void sendKey_Custom(WebElement element,String fieldName,String valueToBeSent)
	{
		try 
		{
			element.sendKeys(valueToBeSent);
		} catch (Exception e) 
		{
			e.printStackTrace();
			Assert.fail("Not Able to enter text "+valueToBeSent + " in " + fieldName);
		}
	}
	public static void click_Custom(WebElement element,String fieldName)
	{
		try 
		{
			element.click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Assert.fail("Not able to click on the "+fieldName);
		}
	}
	
}
