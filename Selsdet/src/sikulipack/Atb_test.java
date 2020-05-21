package sikulipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Atb_test {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "false"); // remove unwanted logs in console
	WebDriver 	driver=new ChromeDriver();
	
	 driver.get("http://www.google.com"); 
     WebElement element = driver.findElement(By.name("q"));
     element.sendKeys("ATB Home");
     element.submit();
		
		
		

	}

}
