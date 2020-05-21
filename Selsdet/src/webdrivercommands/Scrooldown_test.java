package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrooldown_test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.countries-ofthe-world.com/all-countries.html");
		  
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 
		// js.executeScript("window.scrollBy(0,1000)","");// 1. scroll down by using pixel
		 
		 // 2. scrolling page till we find the element
		 
		// WebElement flag=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/ul[1]/li[71]"));
		 
		// js.executeScript("arguments[0].scrollIntoView();", flag);

		 // 3. scroll page till bottom
		
		 
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)" );
		 
	}

}
