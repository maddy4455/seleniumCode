package pageobjectmodel;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyMavenDemo.MavenDemo.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void Logintest() throws Exception {

		openBrowser("chrome");
		driver.get("http://automationpractice.com/index.php");

		LoginPage p = new LoginPage(driver);
		p.customerLogin();
		
		String expMsg = "Authentication failed.";
		Assert.assertEquals(p.verifyError(), expMsg);

		/*
		 * driver.findElement(By.linkText("Sign in")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.id("email")).sendKeys("madd567b@gmail.com");
		 * driver.findElement(By.id("passwd")).sendKeys("passwrd");
		 * driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		 * 
		 * String actualMsg =
		 * driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]"
		 * )).getText(); String expMsg = "Authentication failed.";
		 * 
		 * Assert.assertEquals(actualMsg, expMsg);
		 * 
		 * System.out.println("Error Message is : " + actualMsg);
		 */

		driver.quit();
	}
}
