package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	

	WebDriver driver;
	
	
	By email=By.id("user_email");
	By pass=By.id("user_password");
	By loginbtn=By.xpath("//input[@value=\"Log In\"]");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	    this.driver=driver;
	}

	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	public WebElement Pass()
	{
		return driver.findElement(pass);
	}
	
	public WebElement login() 
	{
		return driver.findElement(loginbtn);
	}
	
}
