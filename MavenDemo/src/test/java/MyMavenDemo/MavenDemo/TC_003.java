package MyMavenDemo.MavenDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TC_003 extends BaseTest{
	
	
	 @BeforeMethod(groups = {"Regression","sanity"})
	 @Parameters("browser")
	  public void beforeMethod(String bType) throws FileNotFoundException {
		 init();
		 
		
		  htmlReporter = new ExtentHtmlReporter("./Reports/extent9.html");
		  report = new ExtentReports(); // this class generate the reports
		  report.attachReporter(htmlReporter);
		  logger = report.createTest("TC_003", "LinkTextFB");
		  
		  openBrowser(bType);
			logger.log(Status.INFO, "launching firefox");
	    
		  System.out.println("beforeMethod");
			
	  }
	 
  @Test (groups = {"Regression","sanity"})
  public void LinkTextFB() {
	  
		
		driver.get("https://www.facebook.com/");
		logger.log(Status.INFO, "Navigate to facebook url");
		
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
	  logger.log(Status.INFO, "clicked the linkt text login and enterd into login page");
	  
	  System.out.println("LinkTextFB");
  }
 

  @AfterMethod (groups = {"Regression","sanity"})
  public void endProcess() {
	  
	  report.flush();
	  driver.quit();
	  
	  System.out.println("afterMethod");
  }

}
