package com.banking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.utilities.CommonMethods;

public class NewCustomer 
{

	WebDriver driver;
	
	@FindBy (xpath="//a[text()='New Customer']")
	WebElement newCustomer;	
	@FindBy (name="name")
	WebElement customerName;
	@FindBy (xpath="//input[@value='m']")
	WebElement male;
	@FindBy (xpath="//input[@value='f']")
	WebElement female;
	@FindBy (name="dob")
	WebElement birthDate;
	@FindBy (name="addr")
	WebElement address;
	@FindBy (name="city")
	WebElement city;
	@FindBy (name="state")
	WebElement state;	
	@FindBy (name="pinno")
	WebElement pinNo;
	@FindBy (name="telephoneno")
	WebElement mobileNo;	
	@FindBy (name="emailid")
	WebElement email;
	@FindBy (name="password")
	WebElement pass;
	@FindBy (name="sub")
	WebElement submit;
	@FindBy (name="res")
	WebElement reset;
	
	public NewCustomer(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickToNewCutomerTab()
	{
		try 
		{
			CommonMethods.click_Custom(newCustomer, "New Customer");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void enterCutomerName(String custName)
	{
		try 
		{
			CommonMethods.sendKey_Custom(customerName, "Cutomer Name", custName);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void selectGender(String gender)
	{
		try 
		{
			if(gender.equalsIgnoreCase("male")) 
			{
			CommonMethods.click_Custom(male, "Gender");;
			}
			else
			{
				CommonMethods.click_Custom(female, "Gender");;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void enterDateOfBirth(String dob)
	{
		try 
		{
			CommonMethods.sendKey_Custom(birthDate, "DOB", dob);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void enterCutomerAddress(String custAddress)
	{
		try 
		{
			CommonMethods.sendKey_Custom(address, "Address", custAddress);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void enterCutomerCity(String custCity)
	{
		try 
		{
			CommonMethods.sendKey_Custom(city, "City", custCity);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void enterCutomerState(String custState)
	{
		try 
		{
			CommonMethods.sendKey_Custom(state, "State", custState);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
	public void enterCutomerPIN(String pin)
	{
		try 
		{
			CommonMethods.sendKey_Custom(pinNo, "PinCode", pin);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void enterCutomerMobileNumber(String mobNo)
	{
		try 
		{
			CommonMethods.sendKey_Custom(mobileNo, "MobileNo", mobNo);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void enterCutomerEmailID(String eid)
	{
		try 
		{
			CommonMethods.sendKey_Custom(email, "Email ID", eid);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void enterEmailPassword(String epass)
	{
		try 
		{
			CommonMethods.sendKey_Custom(pass, "Email ID", epass);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void clickToSubmit()
	{
		try 
		{
			CommonMethods.click_Custom(submit, "Submit");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void clickToResetButton()
	{
		try 
		{
			CommonMethods.click_Custom(reset, "Reset");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
