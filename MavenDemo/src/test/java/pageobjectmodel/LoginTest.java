package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import MyMavenDemo.MavenDemo.BaseTest;

public class LoginTest extends BaseTest 
{
	
	 @Test
	  public void RegistrationTest() throws Exception 
	  {
		  openBrowser("chrome");
		  test.log(Status.INFO, "initializing chrome browser");
		  
			driver.get("http://automationpractice.com/index.php");
			test.log(Status.INFO, "Launching the website :- " + "http://automationpractice.com/index.php");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			CustomerRegistration c=new CustomerRegistration(driver);
			c.CustomerRegistrationPage();
			
			String actTitle = driver.getTitle();
			String expTitle = "My account - My Store";
			
			Assert.assertEquals(actTitle,expTitle );
			
			System.out.println("The actual page title is :- " + actTitle);
		  test.log(Status.PASS, "verified the page title :-" + actTitle);
		  
		  //driver.quit();
	  }


	@Test (enabled=false)
	public void Logintest() throws Exception {

		openBrowser("chrome");
		 test.log(Status.INFO, "initializing chrome browser");
		 
		driver.get("http://automationpractice.com/index.php");
		test.log(Status.INFO, "Launching the website :- " + "http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		LoginPage p = new LoginPage(driver);
		p.customerLogin();
		
		String expMsg = "Authentication failed.";
		Assert.assertEquals(p.verifyError(), expMsg);
		test.log(Status.PASS, "Verified error message :- "+ expMsg);
		
		driver.quit();
	}
}
