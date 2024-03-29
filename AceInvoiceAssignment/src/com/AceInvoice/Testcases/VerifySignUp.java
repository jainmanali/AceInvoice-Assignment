/**
 * 
 */
package com.AceInvoice.Testcases;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.AceInvoice.Pages.BasicDetail;
import com.AceInvoice.Pages.CreateAccount;
import com.AceInvoice.Pages.CreateFirstClient;
import com.AceInvoice.Pages.CreateYourOrganization;
import com.AceInvoice.Pages.HomePage;
import com.AceInvoice.Pages.VerifyUserEmail;

/**
 * @author manali
 *  This class calls all the functions which used for verify sign up process
 */
public class VerifySignUp 
{
	
	@Test
	public void verifyValidSignUp()
	{
		System.setProperty("webdriver.chrome.driver", "C://Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.aceinvoice.com/sign_in");
		
		//Home Page
		HomePage signup = new HomePage(driver);
		signup.clickSignUpButton();
		
		//Create Account
		Random r = new Random();
		int a = r.nextInt(1000);
		String email = "randomtest"+a+"@gmail.com";
		String password = "123456";
		String confirmpassword = "123456";
		CreateAccount account = new CreateAccount(driver);
		account.createAccount(email, password, confirmpassword);
	
		//Basic Detail
		String fname = "Test";
		String lname = "1";
		BasicDetail detail = new BasicDetail(driver);
		detail.basicDetail(fname, lname);
		
		//Organization Details
		String orgname = "Test Organization";
		String orgemail = "testorg@gmail.com";
		CreateYourOrganization createOrg = new CreateYourOrganization(driver);
		createOrg.orgDetail(orgname, orgemail);
		
		//Create First Client
		CreateFirstClient client = new CreateFirstClient(driver);
		client.skipButton();
		
		// COntinue to the app button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		// Verify user name and email
		VerifyUserEmail useremail = new VerifyUserEmail(driver);
		String getemail = useremail.verifyEmail();
		String getname = useremail.verifyName();
		if(getemail.contains(email) & getname.contains("Test 1"))
		{
			System.out.println("Correct User");
		}else {
			System.out.println("Invalid user");
		}
		driver.quit();
	}
	
}
