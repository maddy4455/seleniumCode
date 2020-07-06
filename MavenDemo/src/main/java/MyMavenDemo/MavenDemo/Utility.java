package MyMavenDemo.MavenDemo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static String getScreenshot(WebDriver driver) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		Date dt=new Date();
		System.out.println(dt);
		String dateFormat=dt.toString().replace(":", "_").replace(" ", "_");
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path= System.getProperty("user.dir") +"/screenshots/"+dateFormat + System.currentTimeMillis()+".png";
		File destination = new File(path);
		
		try
		{
			FileUtils.copyFile(src, destination);
			System.out.println("Screenshot captured");
			
		} catch(IOException e)
		{
			System.out.println("Unable to capture screenshot " + e.getMessage());
		}
		return path;
	}

}
