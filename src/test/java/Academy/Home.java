package Academy;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;

//17/6/2019
public class Home  extends Base
{

	 public static Logger log = LogManager.getLogger(Home.class.getName());
	

	@BeforeClass
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		//log.info("Driver initialized successfully");			
	}
	
	
	
	@Test(dataProvider = "getData")
	public void basepageNavigation(String username, String password,String text) throws IOException
	
	{
		driver.get(prop.getProperty("url"));
		log.info(" Navigated to the URL");
		
		LandingPage l=new LandingPage(driver);
		l.GotoLogin().click();
		log.info("Loginpage opened successfully");
		
		LoginPage lp=new LoginPage(driver);
		lp.Email().sendKeys(username);
		log.info("Entered email address");
		
		lp.Pass().sendKeys(password);
		log.info("Entered password ");
		
		lp.login().click();
		log.info("Try to login into the application");
		
		//System.out.println(text);
		log.info(text);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
		}

	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[2][3];
		
		data[0][0]="mounisha2893@gmail.com";
		data[0][1]="test2128";
		data[0][2]="Non restricetduser";
		
		data[1][0]="jeelamounisha2893@gmail.com";
		data[1][1]="test2128@";
		data[1][2]="Restricted user";
		
		return data;
		
	}
}
