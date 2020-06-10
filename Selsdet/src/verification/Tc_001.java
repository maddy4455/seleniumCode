package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_001 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
	    WebDriver	 driver=new ChromeDriver();
		 
	    driver.get("https://www.amazon.in/");
	    
	   WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
	   
	   loc.sendKeys("sony");
	    String val = loc.getAttribute("value"); // to capture the text in textbox whatever we enaterd
	    System.out.println("text is :- "+ val);

	}

}
