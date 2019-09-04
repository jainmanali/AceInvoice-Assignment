/**
 * 
 */
package com.AceInvoice.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author manali
 * This class have all the locators of home page
 */
public class HomePage 
{

	WebDriver driver;
	
	By SignUpButton = By.xpath("//strong[contains(text(),'Sign Up')]");
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickSignUpButton()
	{
		driver.findElement(SignUpButton).click();
	}
	
}
