package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source=driver.findElement(By.id("box2"));
		WebElement target=driver.findElement(By.id("box102"));
		
		Actions act=new Actions(driver);
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
		act.dragAndDrop(source, target).build().perform();
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
