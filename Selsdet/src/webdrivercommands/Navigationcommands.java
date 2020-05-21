package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 driver=new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/");
		
		 System.out.println(driver.getTitle());
		 driver.navigate().to("http://facebook.com");
		
		 System.out.println(driver.getTitle());
		 driver.manage().window().maximize();
		
		 driver.navigate().back();
		 System.out.println(driver.getTitle());
		
		 driver.navigate().forward();
		 System.out.println(driver.getTitle());
		
		 driver.navigate().refresh();
		 
		

	}

}
