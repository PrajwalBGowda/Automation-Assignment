package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	
	WebDriver driver;
	public Pom2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[.='SIGN IN']")
	WebElement button;
	@FindBy(xpath=" //a[.='Sign up']")
	WebElement link;
	@FindBy(xpath=" //input[@id='myName']")
	WebElement fn;
	@FindBy(xpath=" //input[@placeholder='Last Name']")
	WebElement ln;
	@FindBy(xpath="//input[@type='Email']")
	WebElement email;
	@FindBy(xpath=" //input[@type='Password']")
	WebElement password;
	@FindBy(xpath=" //input[@type='date']")
	WebElement cal;
	@FindBy(xpath="//label[.='Male']/following-sibling::input[1]")
	WebElement mradio;
	@FindBy(xpath="//input[@type='number']")
	WebElement mno;
	@FindBy(xpath="//textarea[@placeholder='Short Bio']")
	WebElement sbio;
	@FindBy(xpath="//button[.='Register']")
	WebElement rbutt;
	@FindBy(xpath="//button[.='Sign In']")
	WebElement sbutt;
	
	public WebElement signin()
	{
		return button;
	}
	public WebElement signup()
	{
		return link;
	}
	public WebElement firstname()
	{
		return fn;
		
	}
	public WebElement lastname()
	{
		return ln;
	}
	public WebElement email()
	{
		return email;
	}  
	public WebElement password()
	{
		return password;
	}
	public WebElement calendar()
	{
		return cal;
	}
	public WebElement male()
	{
		return mradio;
	}
	public WebElement mobileno()
	{
		return mno;
	}
	public WebElement shortbio()
	{
		return sbio;
	}
	public WebElement register()
	{
		return rbutt;
	}
	public WebElement signIn()
	{
		return sbutt;
	}

}
