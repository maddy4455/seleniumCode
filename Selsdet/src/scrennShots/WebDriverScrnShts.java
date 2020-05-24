package scrennShots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebDriverScrnShts {
   static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		List<WebElement> links = driver.findElements(By.linkText("Rajinikanth"));
		System.out.println(links.size());
		if(links.size()==0)
		{
		 
		 
		 
	        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(srcFile, new File("C:\\Users\\yavyo\\Desktop\\img2.png"));
	       // FileUtils.copyFile(srcFile, new File("C:\\Users\\yavyo\\Desktop\\amazon.png"));
	        
	        driver.close();
		}

	}

}
