package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;
//17/6/2019
public class Home  extends Base
{
	
	@Test
	public void basepageNavigation() throws IOException
	
	{
		driver= initializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		l.GotoLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.Email().sendKeys("mounisha2893@gmail.com");
		lp.Pass().sendKeys("um");
		lp.login().click();

	}

}
