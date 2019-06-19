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
public class aValidateNavigatioonbar  extends Base
{
	

	@BeforeClass
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		
		
	}
	/*  @BeforeTest 
	  public void beforetest() throws IOException 
	  {
		  driver= initializeDriver();
	 
	  
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
		Assert.assertTrue(l.NavBar().isDisplayed());
		System.out.println("completed avalidatenaviga test"+l.NavBar().getText());
	
	
	}
	
	/*@AfterTest
	public void teardown()
	{
		driver.close();
		//driver=null;
		
	}*/
}
