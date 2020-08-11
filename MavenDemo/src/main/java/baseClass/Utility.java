package baseClass;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static String getScreenshot(WebDriver driver) throws InterruptedException, IOException
	   {
	        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File screenshotLocation = new File(".\\screenshots"+"png");
	     FileUtils.copyFile(screenshot, screenshotLocation);
	     Thread.sleep(2000);
	     InputStream is = new FileInputStream(screenshotLocation);
	     byte[] imageBytes = IOUtils.toByteArray(is);
	     Thread.sleep(2000);
	     String base64 = Base64.getEncoder().encodeToString(imageBytes);
		return base64;      
	   }


}