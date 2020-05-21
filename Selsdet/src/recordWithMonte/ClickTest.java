package recordWithMonte;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testNG.Utility;

public class ClickTest {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;

@BeforeClass
void setup() {
	 
	 ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/extent3.html");
	 extent = new ExtentReports();
	 extent.attachReporter(reporter);
	 test=extent.createTest("ClickTest");
	 
	System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
	  driver=new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/login");
	  driver.manage().window().maximize();
   }
  @Test
  void verifyLinks() {
	    
	  driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[5]/a[1]")).click();
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.xpath("//li[@class='inactive']//a[contains(text(),'Electronics')]")).click();
	  System.out.println(driver.getTitle());
	  
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