package webdrivercommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Switchingwindows {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");	   
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile profile = p.getProfile("Marchsel");
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		driver=new FirefoxDriver(option);
		
		 
		 driver.get("http://demo.automationtesting.in/Windows.html");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		//System.out.println(driver.getTitle());
		
		Set <String> s = driver.getWindowHandles();
		
		for(String i:s)
		{
		
			String t=driver.switchTo().window(i).getTitle();
			
			if(t.contains("Sakinalium | Home"))
				driver.close();
		}
		 

	}

}
