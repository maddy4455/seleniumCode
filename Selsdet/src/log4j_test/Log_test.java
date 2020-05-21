package log4j_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log_test {
	
   
	public static void main(String[] args)  {
		
		Logger log=Logger.getLogger("Log_test");
		
		PropertyConfigurator.configure("log4j.properties");
		

       System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");
       System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "false"); // remove unwanted logs in console
       WebDriver driver=new FirefoxDriver();
		
		log.info("browser opened");
		
		driver.get("http://newtours.demoaut.com/");
		
		log.info("window maximised");
		
		driver.manage().window().maximize();
		
		log.info("Clicked on Register");
		driver.findElement(By.linkText("REGISTER")).click();
		
		 
		 
		
		
		
		

	}

}
