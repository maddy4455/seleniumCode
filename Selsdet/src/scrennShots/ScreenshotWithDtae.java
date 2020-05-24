package scrennShots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWithDtae {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
	    WebDriver	 driver=new ChromeDriver();
		 
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 
		 List<WebElement> links=driver.findElements(By.tagName("a"));
			for(int i=0;i<links.size();i++)
			{
				
				if(!links.get(i).getText().isEmpty())
				{
					String linkname = links.get(i).getText();
					links.get(i).click();
		 
		 Date dt=new Date();
		 System.out.println(dt);
		 String dateFormat = dt.toString().replace(":", "_").replace(" ", "_")+".jpg";
		 
		 if(driver.getTitle().equals("Welcome: Mercury Tours"))
		 {
		 
		 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(srcFile, new File("C:\\Users\\yavyo\\Desktop\\screenshots\\"+linkname+"_"+dateFormat));
		 
		 }
		 links=driver.findElements(By.tagName("a"));
		 
			}
		}
	}
}
			


