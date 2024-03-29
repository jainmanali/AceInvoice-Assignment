/**
 * 
 */
package com.AceInvoice.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author manali
 * This class contain all the locators and methods for create account 
 */
public class CreateAccount 
{
	WebDriver driver;
	
	By EmailAddress = By.name("email");
	By GetStartedButton = By.name("get_started");
	By Password = By.name("password");
	By PasswordConfirmation = By.name("password_confirmation");
	By ContinueButton = By.name("continue");
	
	public CreateAccount(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void createAccount(String uid, String pass, String confirmpass)
	{
		driver.findElement(EmailAddress).sendKeys(uid);
		driver.findElement(GetStartedButton).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(PasswordConfirmation).sendKeys(confirmpass);
		driver.findElement(ContinueButton).click();
	}
	
}
