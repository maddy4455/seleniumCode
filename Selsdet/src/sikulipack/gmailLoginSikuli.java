package sikulipack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class gmailLoginSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		

        System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
        
        String filepath = "C:\\Images\\";
        String inputFilePath = "D:\\Images\\";
        Screen s = new Screen();
        Pattern fileInputTextBox = new Pattern(filepath + "gmail.PNG");
        Pattern openButton = new Pattern(filepath + "signButton.PNG");
        WebDriver driver;

        // Open Chrome browser    
        driver = new ChromeDriver();
        driver.get("https://www.google.com//");
        
       
        
        Thread.sleep(5000);
	       
	       s.wait(fileInputTextBox, 20);
	       //s.type(fileInputTextBox,inputFilePath+"eye.jpg");
	       s.click(fileInputTextBox);
	       s.click(openButton);

        

	}

}
