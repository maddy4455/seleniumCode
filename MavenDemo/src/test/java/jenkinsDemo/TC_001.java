package jenkinsDemo;

import java.io.FileNotFoundException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import MyMavenDemo.MavenDemo.BaseTest;


public class TC_001 extends BaseTest{
		
  @Test
  public void FBLogin() throws FileNotFoundException {
	  
	  init();
	  
	 
	  
	  openBrowser("chrome");
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.id("email")).sendKeys("krnmai312@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("maddy678");
	  driver.findElement(By.id("u_0_b")).click();
	  
	  
	  driver.quit();
  }
}
