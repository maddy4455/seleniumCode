package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyandGetScrnsht_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
	    WebDriver	 driver=new ChromeDriver();
		 
	    driver.get("https://www.amazon.in/");
	   // String actualLink=driver.findElement(By.linkText("Computers")).getText();
	   // String actualLink=driver.findElement(By.linkText("Computers")).getAttribute("tabindex");
	    String actualLink=driver.findElement(By.linkText("Computers")).getAttribute("innerHTML");
	   // String expLink="Computers";
	    
	    String expLink="Comput";
	    
	    System.out.println("Actual Link :"+ actualLink);
	    System.out.println("Expected Link :"+ expLink);
	    
	       //if(actualLink.equals(expLink))  // this will check the equality of the links
	       //if(actualLink.equalsIgnoreCase(expLink)) // this will ignore the case sensitive
	        if(actualLink.contains(expLink)) // it will work with partial link
	    	System.out.println("Both links are equal....");
	    else
	    	System.out.println("Both links are not equal..");

	}

}
