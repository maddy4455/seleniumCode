package fileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Downloadusingfirefox {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");	
		
		
		//creating browser profile	to avoid popups	
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain"); // set MIME types
		profile.setPreference("browser.download.manager.showwhenstarting", false);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("testing");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
	}

}
