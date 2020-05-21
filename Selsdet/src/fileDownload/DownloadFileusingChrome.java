package fileDownload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DownloadFileusingChrome {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");	 
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
	    
		driver.findElement(By.id("textbox")).sendKeys("testing");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		//driver.switchTo().alert().accept();
		//driver.quit();
		if(isFileExist("C://Users/yavyo/Downloads/info.txt"))
		{
			System.out.println("file exists");
		}
		else
		{
			System.out.println("file not exists");
		}
		
		
		driver.findElement(By.id("pdfbox")).sendKeys("download");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		if(isFileExist("C://Users/yavyo/Downloads/info.pdf"))
		{
			System.out.println("file exist");
		}
		else
		{
			System.out.println("file is not exist");
		}
		

	}
	static boolean isFileExist(String path)
	{
		File f=new File(path);
		if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
