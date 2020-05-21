package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseandQuitcommand {
	public static WebDriver driver;
	public static void main(String[] args) {
		
 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 driver=new ChromeDriver();
		
		 /* System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");	   
			 driver=new  FirefoxDriver();*/
			 
		// driver.get("http://www.popuptest.com/popuptest2.html");
		 driver.get("http://demo.automationtesting.in/Windows.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		// driver.close();
		 driver.quit();

	}

}
