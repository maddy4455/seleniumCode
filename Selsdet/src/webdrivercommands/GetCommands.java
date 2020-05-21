package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class GetCommands {
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent1.html");
		    
	        // create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);

	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("GetCommands", "Using get commands");


	     System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
		  
		  test.log(Status.INFO, "Starting the testcase");       
		 driver.get("http://demo.nopcommerce.com/");
		 driver.manage().window().maximize();
		 
		 System.out.println(driver.getTitle());
		 test.pass("Get the title");
		 
		 System.out.println(driver.getCurrentUrl());
		 test.pass("printed the current Url");
		 
		 driver.close();
		 test.pass("Closed the browser");
		 test.info("test is completed");
		 
		 extent.flush();
		
	}

}
