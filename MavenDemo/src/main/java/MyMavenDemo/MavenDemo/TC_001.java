package MyMavenDemo.MavenDemo;

import java.awt.AWTException;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_001 extends BaseTest {

	public static void main(String[] args) throws AWTException, FileNotFoundException {
    
		init();
		
		openBrowser("chrome");
		
		 driver.get("https://www.amazon.in/");
	}

}
