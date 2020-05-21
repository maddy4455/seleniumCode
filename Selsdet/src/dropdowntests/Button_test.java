package dropdowntests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Button_test {
	public static WebDriver driver;
	public static void main(String[] args) {
		
    Logger log=Logger.getLogger("Button_test");
		
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "false"); // remove unwanted logs in console
		driver=new ChromeDriver();
		
		log.info("browser opened");
		
		 driver.get("https://facebook.com");
		 log.info("webpage opened");
		 
		 driver.manage().window().maximize();
		 log.info("window maximized");
		 
		 driver.findElement(By.id("email")).sendKeys("maddyrr.qa@gmail.com");
		 log.info("id  enterd");
		 
		 driver.findElement(By.id("pass")).sendKeys("maddy098");
		 log.info("pw opened");
		 driver.findElement(By.id("u_0_b")).click();
		 log.info("submit button clicked");
		 
		 System.out.println("test is passed");
		 
		 
	}

}
