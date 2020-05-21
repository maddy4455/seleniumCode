package sel.webdriver;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestHashMap {
	
	
	 static HashMap <String, String> logindata()
	{
		
		HashMap <String, String> hm=new HashMap <String, String>();
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury1@mercury1");
		hm.put("z", "mercury2@mercury2");
		
		return hm;
				
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("http://newtours.demoaut.com/");
	     
	     //Login as x
	     
	    String credentials = logindata().get("x");
	   String arr[] = credentials.split("@");
	    
	    driver.findElement(By.name("userName")).sendKeys(arr[0]);
	    driver.findElement(By.name("password")).sendKeys(arr[1]);
	    driver.findElement(By.name("login")).click();
	    
	    
	    //validation
	   
	    
       if (driver.getTitle().equals("Find a Flight: Mercury Tours:")) {
    	   
       System.out.println("Test is passed");
       }
       
       else {
    	   System.out.println("Test is failed");
       }
       driver.findElement(By.partialLinkText("Home")).click();
	}

}
