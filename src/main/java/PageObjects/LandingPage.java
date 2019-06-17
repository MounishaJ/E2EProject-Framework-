package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

//17/6/2019

public class LandingPage {
	
	WebDriver driver;
	
	
	By loginbtn=By.linkText("Login");
	By Registerbtn=By.linkText("Register");

	
	
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
	
	
}
