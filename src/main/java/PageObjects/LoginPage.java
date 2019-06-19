package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class LoginPage extends Base {

	

	//WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
/*	By email=By.id("user_email");
	By pass=By.id("user_password");
	By loginbtn=By.xpath("//input[@value=\"Log In\"]");
	*/
	
	@FindBy(id="user_email")
	WebElement useremail;
	
	@FindBy(id="user_password")
	WebElement userpassword;
	
	@FindBy(xpath="//input[@value=\"Log In\"]")
	WebElement loginbtn;
	

	public WebElement Email()
	{
		return useremail;
	}
	
	public WebElement Pass()
	{
		return userpassword;
	}
	
	public WebElement login() 
	{
		return loginbtn;
	}
	
}
