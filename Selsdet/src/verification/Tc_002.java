package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Tc_002 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
	    WebDriver	 driver=new ChromeDriver();
		 
	    driver.get("https://www.amazon.in/");
	    
	    String actualLink=driver.findElement(By.linkText("Computers")).getAttribute("innerHTML");
	    String expLink="computers";
	    
	    System.out.println("Actual Link :"+ actualLink);
	    System.out.println("Expected Link :"+ expLink);
	    
	    //Assert.assertEquals(actualLink, expLink);
	    
	   // Assert.assertTrue(actualLink.equals(expLink), "Both links are not equal ..."); 
 // Assert.assertTrue(actualLink.equalsIgnoreCase(expLink), "Both links are not equal ..."); //ignore the case sensitive
	
	    SoftAssert s=new SoftAssert();
	    //s.assertEquals(actualLink, expLink); // soft assert ignore the mynute verifications
	    
	    s.assertTrue(actualLink.equals(expLink), "Both links are not equal ...");
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
	    
	    s.assertAll(); // it will provide all the information
	
	}

}
