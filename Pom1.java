package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	
	WebDriver driver;
	public Pom1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[.='SIGN IN']")
	WebElement sign;
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//a[.='Log In']")
	WebElement button;
	
	public WebElement s()
	{
		return sign;
	}
	public WebElement u()
	{
		return username;
	}
	public  WebElement p()
	{
		return password;
	}
	public WebElement l()
	{
		return button;
	}

}
