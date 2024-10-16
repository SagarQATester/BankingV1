package com.banking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

	@Test
	void opn()
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
	}
}
