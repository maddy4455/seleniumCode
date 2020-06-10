package robotApi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RobotApiDemo {

	public static void main(String[] args) throws AWTException {
	
System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
       
		driver.findElement(By.id("firstName")).sendKeys("ramm");
		driver.findElement(By.id("lastName")).sendKeys("rads");
		driver.findElement(By.xpath("//*[@id=\"employeeId\"]")).sendKeys("0015");
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		 
	}

}
