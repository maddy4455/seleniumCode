package sikulipack;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadpracticeSikuli {

	public static void main(String[] args) throws AWTException, InterruptedException, FindFailed {
		 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 WebDriver driver=new ChromeDriver();
		
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
		
		   String imagesFilepath="C:\\Users\\yavyo\\Desktop\\music\\screenshots\\";
		   
	       String inputFilepath="C:\\Users\\yavyo\\Desktop\\music\\screenshots\\";
	        
	       Screen s=new Screen();
	       
	       Pattern fileInputTextbox=new Pattern(imagesFilepath+"FileTextBox.PNG");
	       Pattern openButton=new Pattern(imagesFilepath+"OpenButton.PNG");
	       
	       Thread.sleep(5000);
	       
	       s.wait(fileInputTextbox, 20);
	       s.type(fileInputTextbox,inputFilepath+"eye.jpg");
	       s.click(openButton);
		
	}

}
