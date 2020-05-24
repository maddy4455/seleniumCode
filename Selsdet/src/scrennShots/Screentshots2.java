package scrennShots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screentshots2 {
	 static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 driver=new ChromeDriver();
		 
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			
			if(!links.get(i).getText().isEmpty())
			{
				String linkname = links.get(i).getText();
				links.get(i).click();
				
				 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			        FileHandler.copy(srcFile, new File("C:\\Users\\yavyo\\Desktop\\screenshots\\"+linkname+".jpg"));
			        links=driver.findElements(By.tagName("a"));
			}
		}
		 

	}

}
