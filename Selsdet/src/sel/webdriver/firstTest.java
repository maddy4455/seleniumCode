package sel.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest {
	public static WebDriver driver;
	
	

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe\\");
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
		
		//FirefoxDriver driver=new FirefoxDriver();//
                  //driver=new FirefoxDriver();//
		          driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("mercury");//  enter username
		driver.findElement(By.name("password")).sendKeys("mercury");// password
		driver.findElement(By.name("login")).click();
		//String exptitle="Find a Flight: Mercury Tours:";
	//	String acttitle=driver.getTitle();// returns the title of the page
		
		
		/*if(exptitle.equals(acttitle))
			
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		driver.close();*/
		

	}

}
