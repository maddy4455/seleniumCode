package fileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadZipfile {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");	
		
		
		//creating browser profile		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip"); // set MIME types
		profile.setPreference("browser.download.manager.showwhenstarting", false);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		
		driver.get("http://testingmasters.com/student-corner/downloads/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")).click();
		
	}

}
