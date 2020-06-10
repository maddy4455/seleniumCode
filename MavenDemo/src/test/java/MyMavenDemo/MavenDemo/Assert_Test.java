package MyMavenDemo.MavenDemo;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Test extends BaseTest{
  @Test
  public void Assert_Test() throws FileNotFoundException {
	  
	  init();
	  
	  openBrowser("chrome");
		
		driver.get("https://www.amazon.in/");
		
		//String actLink = driver.findElement(By.linkText("Books")).getText();
	String actLink = driver.findElement(By.linkText("Books")).getAttribute("innerHTML");
	String expLink = "Book";
	
	System.out.println("actual link :" +actLink);
	System.out.println("expexted link :"+ expLink);
	
	//Assert.assertEquals(actLink, expLink);
	
	//Assert.assertTrue(actLink.equals(expLink), "both links are not equal");
	
	SoftAssert s=new SoftAssert();
	
	s.assertTrue(actLink.equals(expLink), "both links are not equal");
	s.assertTrue(false, "err1");
	s.assertTrue(true, "err2");
	s.assertTrue(false, "err23");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("twotabsearchtextbox");
	
	s.assertAll();
	driver.quit();
	  
  }
}
