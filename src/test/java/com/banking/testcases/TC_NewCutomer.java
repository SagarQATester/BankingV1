package com.banking.testcases;

import org.testng.annotations.Test;

import com.banking.pageobject.LoginPage;
import com.banking.pageobject.NewCustomer;

public class TC_NewCutomer extends BaseClass
{
	@Test
 public void verifyWhetherTheMangerAbleToAddNewCustomer() throws InterruptedException
 
 {
	 LoginPage loginPage= new LoginPage(driver);
	 NewCustomer newCust= new NewCustomer(driver);
	 
	 loginPage.loginIntoApplication("mngr525961", "EnygenU");
	 newCust.clickToNewCutomerTab();
	 Thread.sleep(5000);
	 newCust.enterCutomerName("Sagar");
	 newCust.selectGender("male");
	 newCust.enterDateOfBirth("02121995");
	 newCust.enterCutomerAddress("Navi mumbai");
	 newCust.enterCutomerCity("Navi Mumbai");
	 newCust.enterCutomerState("Maharastra");
	 newCust.enterCutomerPIN("414141");
	 newCust.enterCutomerMobileNumber("9898989898");
	 newCust.enterCutomerEmailID("sssk@gmail.com");
	 newCust.enterEmailPassword("scnxvdsgcv");
	 newCust.clickToSubmit();
		
		
		
 }
}
