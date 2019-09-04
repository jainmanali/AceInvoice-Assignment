/**
 * 
 */
package com.AceInvoice.Pages;

import org.apache.regexp.recompile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author manali
 * This class have locators which used for verifying user name and email address
 */
public class VerifyUserEmail 
{

	WebDriver driver;
	
	By CatchName = By.cssSelector("[role = \"row\"] td:nth-child(2)");
	By CatchEmail = By.cssSelector("[role = \"row\"] td:nth-child(3)");
	
	public VerifyUserEmail(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String verifyName()
	{
		String getname = driver.findElement(CatchName).getText();
		System.out.println(getname);
		return getname;
	}
	public String verifyEmail()
	{
		String getemail = driver.findElement(CatchEmail).getText();
		System.out.println(getemail);
		return getemail;
	}
}
