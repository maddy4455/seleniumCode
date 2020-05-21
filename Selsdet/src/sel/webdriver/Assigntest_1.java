package sel.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigntest_1 {
	public static WebDriver driver;

	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
		 
		 driver=new ChromeDriver();
		 
		 
		/*driver.get("http://kiji.ca");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign In")).click();*/
		 driver.get("https://facebook.com");
		
		
		 driver.manage().window().maximize();
		/* driver.findElement(By.linkText("Log In")).click();
		 driver.findElement(By.name("email")).sendKeys("madhavrr5@gmail.com");
		 driver.findElement(By.name("pass")).sendKeys("Maddy098@");
		 driver.findElement(By.name("login")).click();*/
		 
		driver.findElement(By.name("firstname")).sendKeys("ma");
		driver.findElement(By.name("lastname")).sendKeys("johnu");
		driver.findElement(By.name("reg_email__")).sendKeys("rddrala@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rddrala@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("maddy098");
		
	    WebElement drptime=driver.findElement(By.id("month"));// to select dropdown 
	    Select t=new Select(drptime);
	    t.selectByVisibleText("Sep");// to select text inside the dropdown box
	    
	    WebElement tgg=driver.findElement(By.id("day"));
	    Select n=new Select(tgg);
	    n.selectByIndex(10);
	    
	    WebElement rmr=driver.findElement(By.id("year"));
	    Select r=new Select(rmr);
	    r.selectByValue("1985");
	   System.out.println(r.getOptions().size()); // to get total numbers in drop down list
	   
	   //radio button selection
	 System.out.println(driver.findElement(By.id("u_0_6")).isSelected()); 
	 driver.findElement(By.id("u_0_6")).click();
	 driver.findElement(By.id("u_0_13")).click();
	 
	   
	    
	    
	  
	  
		
		
		
		
	
		
		

	}

}
