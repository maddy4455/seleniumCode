package MyMavenDemo.MavenDemo;


import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Robot_Test extends BaseTest{
	
  @Test
  public void Robot() throws FileNotFoundException  {
	  init();
	  
	  openBrowser("chrome");
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
     
		driver.findElement(By.id("firstName")).sendKeys("ramm");
		driver.findElement(By.id("lastName")).sendKeys("rads");
		driver.findElement(By.xpath("//*[@id=\"employeeId\"]")).sendKeys("0015");
		
		
		
		
		
  }
}
