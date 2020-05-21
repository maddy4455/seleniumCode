package Handlingwebelements;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Calendertest {
	public static WebDriver driver;

	public static void main(String[] args) {
	
		 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 driver=new ChromeDriver();
		 
		 driver.get("https://facebook.com");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.name("firstname")).sendKeys("maddy");
		 driver.findElement(By.name("lastname")).sendKeys("rav");
		 driver.findElement(By.name("reg_email__")).sendKeys("maddyra.qa@gamil.com");
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("maddyra.qa@gamil.com");
		 
		 driver.findElement(By.name("reg_passwd__")).sendKeys("Maggy678#");
		 
		 driver.findElement(By.id("month")).click();
		 Select x=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		 x.selectByVisibleText("Jul");
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"day\"]" )).click();
		 Select y=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		 y.selectByVisibleText("18");
		 
		 driver.findElement(By.id("year")).click();
		 Select z=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		 z.selectByVisibleText("1987");
		 
		 driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
		 
		driver.navigate().back();
		driver.navigate().forward();
	
		 
		
		 
		

	}

}
