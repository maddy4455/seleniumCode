package MyMavenDemo.MavenDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
	
	public static WebDriver driver;
	public static String filePath;
	public static FileInputStream fis;
	public static String projectpath=System.getProperty("user.dir");
	public static ExtentTest logger;
	 ExtentReports report;
	 ExtentHtmlReporter htmlReporter;
	
	static
	{
		Date dt=new Date();
		filePath = dt.toString().replace(' ', '_').replace(':', '_');
	}
	

	public static void init() throws FileNotFoundException {
	
	
	fis=new FileInputStream(projectpath+"//log4jconfig.properties");
	PropertyConfigurator.configure(fis);
	
	}
		public static void openBrowser(String browser)
		{
			if(browser.equals("chrome"))
			{
	System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\yavyo\\Desktop\\seleniumproject\\chromedriver.exe\\");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "false");
		
	ChromeOptions option=new ChromeOptions();
	option.addArguments("user-data-dir=C:\\Users\\yavyo\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
	option.addArguments("--disable-notifications");
	
	driver = new ChromeDriver(option);
}
			else if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\yavyo\\Desktop\\seleniumproject\\geckodriver.exe");
				
				ProfilesIni p = new ProfilesIni();
				FirefoxProfile profile = p.getProfile("Marchsel");
				profile.setPreference("dom.webnotifications.enabled", false);
				
				FirefoxOptions option = new FirefoxOptions();
				option.setProfile(profile);
				
				driver=new FirefoxDriver(option);
			}
			driver.manage().window().maximize();
		}
			public static void takesScreenShot() throws Exception
			{
				Date dt=new Date();
				System.out.println(dt);
				String dateFormat=dt.toString().replace(":", "_").replace(" ", "_")+".png";		
				File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrFile, new File(projectpath+"\\failurescreenshots\\"+dateFormat));
				
		logger.log(Status.INFO, "Screenshot --->" +logger.addScreenCaptureFromPath(projectpath+"\\failurescreenshots\\"+dateFormat));
				
			}
			
			
	}


