/*////////////////////////////////////////////////////*
 * 
 */
package com.AceInvoice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author manali
 * This class contains all the locators of basic detail page
 */
public class BasicDetail 
{

	WebDriver driver;
	
	By FirstName = By.name("user[first_name]");
	By LastName = By.name("user[last_name]");
	By ContinueButton = By.name("commit");
	
	public BasicDetail(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void basicDetail(String fname, String lname)
	{
		driver.findElement(FirstName).sendKeys(fname);
		driver.findElement(LastName).sendKeys(lname);
		driver.findElement(ContinueButton).click();
	}
	
}
