package batchTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginTest {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	
	
	@BeforeSuite
	public void setUp() {
		 extent=new ExtentReports();
		 htmlReporter = new ExtentHtmlReporter("./reports/extent2.html");
		extent.attachReporter(htmlReporter);
	}
		
	
	
  @Test
  public void LoginbyEmail() throws IOException {
	  ExtentTest test = extent.createTest("LoginTest", "Login to Gamil");
	  
	  test.log(Status.INFO, "This step shows usage of log(status, details)");
	  System.out.println("this is login by email");
	  
	  // info(details)
      test.info("This step shows usage of info(details)");
      
      // log with snapshot
      test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
      
      // test with snapshot
      test.addScreenCaptureFromPath("screenshot.png");
	  
  }
  @Test
  public void Loginbyfacebook() { 
	 
ExtentTest test = extent.createTest("LoginTest", "Login to facebook");
	  
	  test.log(Status.INFO, "This step shows usage of log(status, details)");
	  
	  
	  System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
     
	  WebDriver driver= new ChromeDriver();
	  test.info("This step shows usage of info(details)");
	  
	  
	  System.out.println("this is login by facebook"); 
  }
  @AfterSuite
	public void tesrDown () {
		
		extent.flush();
  }
}
