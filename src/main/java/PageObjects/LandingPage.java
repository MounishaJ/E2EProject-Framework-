package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;


//17/6/2019

public class LandingPage extends Base {
	
	//WebDriver driver;
	
	
	By loginbtn=By.linkText("Login");
	By Registerbtn=By.linkText("Register");
	By text=By.xpath("//div[@class='text-center'][h2]");
	By navbar=By.cssSelector("ul[class='nav navbar-nav navbar-right']");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	    this.driver=driver;
	}

	public WebElement GotoLogin()
	{
		return driver.findElement(loginbtn);
	}
	
	public WebElement GotoRegister()
	{
		return driver.findElement(Registerbtn);
	}
	
public WebElement Getdata()
{
	return driver.findElement(text);
}

public WebElement NavBar()
{
	return driver.findElement(navbar);
}

}
