package sikulipack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class UploadfileUsingSikuli {

	public static void main(String[] args) throws InterruptedException, SikuliException  {
		
		 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 WebDriver driver=new ChromeDriver();
			
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
		
       String  imagesFilepath="C:\\Users\\yavyo\\Desktop\\screenshots\\";
       String inputFilepath="C:\\Users\\yavyo\\Desktop\\screenshots\\";
       Screen s=new Screen();
       
       Pattern fileInputTextbox=new Pattern(imagesFilepath+"openfile.PNG");
       Pattern open=new Pattern(imagesFilepath+"open.PNG");
       
       Thread.sleep(5000);
       
       s.wait(fileInputTextbox, 20);
       s.type(fileInputTextbox,inputFilepath+"eye.jpg");
       s.click(open);
       
       
       
       
	}

}
