package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseRightclick {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act.contextClick(button).build().perform(); //
		driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[3]/span[1]")).click();
		Thread.sleep(4000);
		
		// to click and get the alert box and text
		System.out.println(driver.switchTo().alert().getText()); // to print the text from alert
		driver.switchTo().alert().accept();


	}

}
