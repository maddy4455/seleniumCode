package sikulipack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class atb_testfirefox {

	public static void main(String[] args) {
	
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");
	              WebDriver driver=new FirefoxDriver();
	              
	              driver.get("http://www.google.com"); 
	              WebElement element=driver.findElement(By.name("q"));
	              
	              element.sendKeys("ATB Home");
	              element.submit();
	              
	              
	              
	}

}
