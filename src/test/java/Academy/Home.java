package Academy;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;
//17/6/2019
public class Home  extends Base
{
	public static Properties prop=new Properties();
	
	@Test(dataProvider = "getData")
	public void basepageNavigation(String username, String password,String text) throws IOException
	
	{
		driver= initializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		l.GotoLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.Email().sendKeys(username);
		lp.Pass().sendKeys(password);
		lp.login().click();
		System.out.println(text);

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
