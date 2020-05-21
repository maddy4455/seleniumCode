package sel.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebktest {
	public static WebDriver driver;

	public static void main(String[] args) {
      
		//System.setProperty("webdriver.gecko.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe\\");
	  System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
		
	     driver=new ChromeDriver();
	    // driver=new FirefoxDriver();
	     driver.get("http://facebook.com");
	     
	     driver.manage().window().maximize();
	     
	     String exp_title="Facebook - Log In or Sign Up";
	     
	     String act_title=driver.getTitle();
	     if(exp_title.equals(act_title)==true)
	     {
	    	 System.out.println("test is passed");
	     }
	     else
	     {
	    	 System.out.println("test is failed");
	     }
	     
	     
	    		 
		
		
		
	}

}
