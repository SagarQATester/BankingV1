package com.banking.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.banking.testcases.BaseClass;
import com.banking.utilities.CommonMethods;



public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (name="uid")
	WebElement uId;
	
	@FindBy (name="password")
	WebElement pass;
	
	@FindBy (name="btnLogin")
	WebElement loginButton;
	
	@FindBy (name="btnReset")
	WebElement resetButton;
	
	public void enterUserID(String id)
	{
		try 
		{
			CommonMethods.sendKey_Custom(uId, "User ID", id);
						
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail("Not able to enter text in User Id field ");
		}
	}
	public void enterUserPassword(String passWord)
	{
		try 
		{
			CommonMethods.sendKey_Custom(pass, "User Password", passWord);
						
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void clickOnLoginButoon()
	{
		try 
		{
			CommonMethods.click_Custom(loginButton, "Login");
						
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void verifyUserNavigateOnHomePage() 
	{
		try
		{
		String pageTitle=driver.getTitle();
		String actualtitle="Guru99 Bank Manager HomePage";
		if(pageTitle.equals(actualtitle))
		{
			Assert.assertTrue(true);
			BaseClass.captureScreen(driver, "verifyUserNavigateOnHomePage");
		}
		else
		{
			Assert.assertTrue(false);
		}
			
		}
		catch (Exception e) {
			
			Assert.fail("User not landing on Home Page");
			BaseClass.captureScreen(driver, "verifyUserNavigateOnHomePage");
		}
	}
	
	public void loginIntoApplication(String cid,String cpass)
	{
		enterUserID(cid);
		enterUserPassword(cpass);
		clickOnLoginButoon();
	}
	
	
	
}
