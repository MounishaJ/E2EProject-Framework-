package Academy;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;
//19/6/2019
public class aValidateNavigatioonbar  extends Base
{
	

	 public static Logger log = LogManager.getLogger(Home.class.getName());
	@BeforeClass
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		
		log.info("successfully intialize driver");
	}
	
	 
	@AfterClass
	public void teardown()
	{
		driver.close();
		//driver=null;
	}
	
	@Test
	public void ValidateNavigation() throws IOException
	
	{
		System.out.println("driver: "+driver);
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		Assert.assertTrue(l.NavBar().isDisplayed());
		System.out.println("completed avalidatenaviga test"+l.NavBar().getText());
		log.info("Navbar displayed");
	
	
	}
	
	
}
