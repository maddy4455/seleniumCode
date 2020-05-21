package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtest {
	public static  WebDriver driver;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 driver=new ChromeDriver();
		 
		 driver.get("http://facebook.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("email")).sendKeys("maddyrr.qa@gmail.com");
		 driver.findElement(By.name("pass")).sendKeys("Maddy098@");
		 driver.findElement(By.id("u_0_4")).click();

	}

}
