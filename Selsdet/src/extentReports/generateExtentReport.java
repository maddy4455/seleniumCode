package extentReports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

public class generateExtentReport {
	
	ExtentReports extent;
	ExtentTest test;
 
	  @BeforeTest
	  public void beforeTest() {
		  
		extent = new  ExtentReports (System.getProperty("user.dir")+"/test-output/extent.html", true);
		extent.addSystemInfo("Host Name", "LocalHost");
		extent.addSystemInfo("Environment","QA");
		extent.addSystemInfo("User Name", "Maddy");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	  }
	  
	  
	@Test
  public void DemoReportPass() {
		
		test=extent.startTest("DemoReportPass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condition is true");
  }

	@Test
	  public void DemoReportfail() 
	{
		test=extent.startTest("DemoReportfail");
		Assert.assertTrue(false);	
		test.log(LogStatus.FAIL, "Assert fail as condition is false");
		
	}

  @AfterTest
  public void getResult(ITestResult result) {
	  
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  test.log(LogStatus.FAIL, result.getThrowable());
	  }
	  extent.endTest(test);
	  
  }
  @AfterTest
  public void endreport(){
	  extent.flush();
  }

}
