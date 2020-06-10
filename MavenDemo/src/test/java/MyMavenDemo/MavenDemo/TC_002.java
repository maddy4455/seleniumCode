package MyMavenDemo.MavenDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TC_002 extends BaseTest{
	
	 @BeforeMethod(groups = {"Regression","sanity"})
	 @Parameters("browser")
 
  public void Demo_Test(String bType) throws IOException {
	  init();
	  
	  htmlReporter = new ExtentHtmlReporter("./Reports/extent9.html");
	  report = new ExtentReports(); // this class generate the reports
	  report.attachReporter(htmlReporter);
      
      ExtentTest logger = report.createTest("TC_002", "Demo Extent Report Test");
      
       openBrowser(bType);
		logger.log(Status.INFO, "launching firefox");
	 }
		
 @Test (groups = {"Regression","sanity"})
  public void Demo_Test()
		 {
		
      driver.get("https://www.amazon.in/");
      logger.log(Status.INFO, "navigate to amazon url");
      
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
      logger.log(Status.INFO, "find the element and enterd the text in text box");
      
      driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
      logger.log(Status.INFO, "find the serch button and clicked");
      
    //  ExtentTest logger2 = report.createTest("logoff Test");
      
      //logger2.log(Status.FAIL, "titel verified");
      
      //logger2.addScreenCaptureFromPath("C:/Users/yavyo/Desktop/amazon.png"); // to add screen shot manually
      
       // logger2.fail("failed bcoz of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/yavyo/Desktop/amazon.png").build());
      
       // logger2.pass(" passed successfully", MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/yavyo/Desktop/amazon.png").build());
		 }
 
      @AfterMethod (groups = {"Regression","sanity"})
      public void endProcess() {
      
      report.flush();
      driver.quit();
      
	    System.out.println("this is TestNg Reprt with maven");
	    
      
	    
	    
  }
}
