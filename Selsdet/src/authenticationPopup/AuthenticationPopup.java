package authenticationPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	public static WebDriver driver;
	public static void main(String[] args) {
		
 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 driver=new ChromeDriver();
		 
		 //driver.get("http://the-internet.herokuapp.com/basic_auth");
		 
		 driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		 
		String text= driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println(text);
		 
  
	}

}
