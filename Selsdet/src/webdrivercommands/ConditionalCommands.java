package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
	public static  WebDriver driver;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 driver=new ChromeDriver();
		
		 //driver.get("http://newtours.demoaut.com/");
		 
		 driver.navigate().to("http://facebook.com");
		 driver.manage().window().maximize();
		 
		 WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		  
		 if(email.isDisplayed()&& email.isEnabled())
		 {
		
			 email.sendKeys("maddyrav.qa@gmail.com");
			 
		 }
		 if(pass.isDisplayed()&& pass.isEnabled())
		 {
			 pass.sendKeys("Maddy098@");
		 
		/* System.out.println(driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).isSelected());
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).isSelected());
		 
		 if(driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).isSelected()==false)
		 {
			 driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();*/
		 
			 driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
			
		 }
		 
	}

}
