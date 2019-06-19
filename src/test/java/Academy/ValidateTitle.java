package Academy;

import java.io.IOException;
import java.util.Properties;

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
public class ValidateTitle  extends Base
{
	@BeforeClass
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		
		
	}
	
	/* @BeforeTest
	 public void beforetest() throws IOException { driver=
	 initializeDriver();
	 
	  }*/
	 
	@AfterClass
	public void teardown()
	{
		driver.close();
		//driver=null;
	}
	
	
	@Test
	public void basepageNavigation() throws IOException
	
	{
		System.out.println("driver: "+driver);
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		//LoginPage lp=new LoginPage(driver);
		Assert.assertEquals(l.Getdata().getText(), "FEATURED COURSES");  //validating the text by using assertion
		System.out.println("completed basepagenavigation test"+l.Getdata().getText());
	
	
	}
	
	/*@AfterTest
	public void teardown()
	{
		driver.close();
		//driver=null;
	}*/
}
