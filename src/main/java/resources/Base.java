package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//17/6/2019
public class Base {
	public  static WebDriver driver;
	public static Properties prop=new Properties();
	
	public  WebDriver initializeDriver() throws IOException
	{
		
		FileInputStream fis=new FileInputStream("F:\\Automation-Selenium\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		 
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F://Web Drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "F://Web Drivers/MicrosoftWebDriver.exe");
			 driver=new InternetExplorerDriver();
		}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}

}
