/**
 * 
 */
package com.AceInvoice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author manali
 * This class contain all the locators and method of create your organization page
 */
public class CreateYourOrganization 
{

	WebDriver driver;
	
	By OrganizationName = By.name("name");
	By OrganizationEmail = By.name("email");
	By ContinueButton = By.name("commit");
	
	public CreateYourOrganization(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void orgDetail(String orgname, String orgemail)
	{
		driver.findElement(OrganizationName).sendKeys(orgname);
		driver.findElement(OrganizationEmail).sendKeys(orgemail);
		driver.findElement(ContinueButton).click();
	}
	
}
