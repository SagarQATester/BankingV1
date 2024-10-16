package com.banking.testcases;

import org.testng.annotations.Test;

import com.banking.pageobject.LoginPage;

public class TC_LoginPage extends BaseClass{

	@Test
	public void validateWetherUserAbleToLogin()
	{
		LoginPage loginPage= new LoginPage(driver);
		loginPage.enterUserID("mngr525961");
		loginPage.enterUserPassword("EnygenU");
		loginPage.clickOnLoginButoon();
		loginPage.verifyUserNavigateOnHomePage();
	}
}
