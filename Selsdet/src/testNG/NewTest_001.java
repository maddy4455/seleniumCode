package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest_001 {
 
  @BeforeMethod
  public void beforeMethod() {
	
	  System.out.println("BeforeMethod");
	  
  }
  
  @Test(priority = 1)
  public void f() {
	  System.out.println("f");
  }



@Test(priority = 2)
public void a() {
	  System.out.println("a");
}



@Test(enabled = false) // this will pause the test
public void b() {
	  System.out.println("b");
}



@Test(priority = 3)
public void d() {
	  System.out.println("d");
}
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void c() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite");
  }

}
