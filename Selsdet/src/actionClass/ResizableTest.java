package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resizable/");
         driver.switchTo().frame(0);
         WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
         
         Actions act=new Actions(driver);       
         act.moveToElement(resize).dragAndDropBy(resize, 100, 150).build().perform();
         Thread.sleep(3000);
	}

}
