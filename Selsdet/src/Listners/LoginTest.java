package Listners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
@Test//(enabled=false)
  public void loginbyEmail() {
	  
	  System.out.println("Login by Email");
	  Assert.assertEquals("pavan", "pavan");
}
   @Test
    public void loginbyFacebook() {
	   
	   System.out.println("login by facebook");
	   
	   Assert.assertEquals("pavan", "kumar");

  }
}
