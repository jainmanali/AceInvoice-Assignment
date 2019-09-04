/**
 * 
 */
package com.AceInvoice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author manali
 * This class contains all locators and methods of create first client page
 */
public class CreateFirstClient 
{

	WebDriver driver;
	
	By SkipButton = By.xpath("//a[@class='skip-step']");
	
	public CreateFirstClient(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void skipButton()
	{
		driver.findElement(SkipButton).click();
	}
}
