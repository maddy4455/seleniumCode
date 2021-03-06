package testNG;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeClass;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class chromeExtentScrensht {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	
	 @BeforeClass
	  public void setup() {
		 
		 ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/extent6.html");
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 test=extent.createTest("loginTest");
		 
	  }

  @Test
  public void loginTest() {
	  
	  System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.nopcommerce.com/");
	  System.out.println("title is "+ driver.getTitle());
	  Assert.assertTrue(driver.getTitle().contains("maddy"));
	  
  }
 
  @AfterMethod
  public void tearDown(ITestResult result) throws IOException {
	  
	  if(result.getStatus()==ITestResult.FAILURE) {
		  
		  String temp=Utility.getScreenshot(driver);
		  
  test.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		  
	  }
	  extent.flush();
	  driver.close();
	
	  
  }

}
