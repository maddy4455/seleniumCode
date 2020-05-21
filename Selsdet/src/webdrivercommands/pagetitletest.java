package webdrivercommands;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class pagetitletest {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		   System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
	      WebDriver  	driver= new ChromeDriver(); 
	      
	      driver.get("http://demo.nopcommerce.com/");
	    System.out.println(driver.getTitle()); 
	
	
		/*Screen screen=new Screen();
		
		Pattern p = new Pattern ("C:\\Users\\yavyo\\Desktop\\sikuliImages\\image.PNG");
		
		screen.click(p);*/
		
		
		
	
		
		
	}

}
