package autoIt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadAutoIT {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[18]/a")).click();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);

		Runtime.getRuntime().exec("C://Users/yavyo/Desktop/info.txt");
		
		driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
		

	}

}
