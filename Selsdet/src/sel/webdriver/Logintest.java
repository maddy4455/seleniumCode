package sel.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintest
{

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe\\");
		//System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
		
	  //  driver=new ChromeDriver();
	     driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
	
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		String exp_title="Find a Flight: Mercury Tours:";
		
		String act_title=driver.getTitle();
		
		System.out.println(act_title);
		
		if(exp_title.equals(act_title)==true)
{
	   System.out.println("test is passed");
	   
			
}
		else
		{
			System.out.println("test is failed");
		}
		//driver.close();
		
		
		
		
		

	}

}
