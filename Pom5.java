package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom5 {
	
	WebDriver driver;
	public Pom5(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath="//a[.='All Mobiles']")
	WebElement allmobile;
	@FindBy(xpath="//input[@id='myInput']")
	WebElement search;
	@FindBy(xpath="//td[.='Rs.50,000']/following-sibling::td[1]/a[1]")
	WebElement order;
	@FindBy(xpath="//label[.='First Name']/following-sibling::input[1]")
	WebElement firstname;
	@FindBy(xpath="//label[.='Last Name']/following-sibling::input[1]")
	WebElement lastname;
	@FindBy(xpath="//label[.='Email']/following-sibling::input[1]")
	WebElement email;
	@FindBy(xpath="//label[.='Password']/following-sibling::input[1]")
	WebElement pass;
	@FindBy(xpath="//div[.='Gender']/following-sibling::div[1]/input[1]")
	WebElement mradio;
	@FindBy(xpath="//label[.='Mobile Number']/following-sibling::input[1]")
	WebElement phno;
	@FindBy(xpath="//label[.='Address 1']/following-sibling::input[1]")
	WebElement add1;
	@FindBy(xpath="//label[.='Address 2']/following-sibling::input[1]")
	WebElement add2;
	@FindBy(xpath="//label[.='City']/following-sibling::input[1]")
	WebElement city;
	@FindBy(xpath="//label[.='State']/following-sibling::select[1]")
	WebElement state;
	@FindBy(xpath="//label[.='Zip']/following-sibling::input[1]")
	WebElement zip;
	@FindBy(xpath="//input[@rel='samsung']")
	WebElement sam;
	@FindBy(xpath="//input[@rel='apple']")
	WebElement apple;
	@FindBy(xpath="//option[.='Apple XS ']")
	WebElement model;
	@FindBy(xpath="//input[@placeholder='no of mobiles']")
	WebElement count;
	@FindBy(xpath="//select[@id='bought']")
	WebElement ba;
	@FindBy(xpath="//input[@id='time']")
	WebElement Nft;
	@FindBy(xpath="(//input[@id='gridCheck1'])[1]")
	WebElement check1;
	@FindBy(xpath="(//input[@id=\"gridCheck1\"])[2]")
	WebElement check2;
	@FindBy(xpath="//button[@class=\"btn btn-primary\"]")
	WebElement button;
	@FindBy(xpath="//a[.='Close']")
	WebElement close;
	@FindBy(xpath="//option[.='Samsung Z Flip3']")
	WebElement model1;
	@FindBy(xpath="(//td[.='Rs.30,000']/following-sibling::td[1]/a[1])[1]")
	WebElement order2;
	@FindBy(xpath="//option[.='Samsung S21 FE ']")
	WebElement model2;
	
	public WebElement model2()
	{
		return model2;
	}
	
	public WebElement allmobile()
	{
		return allmobile;
	}
	public WebElement search()
	{
		return search;
	}
	public WebElement order()
	{
		return order;
	}
	public WebElement firstname()
	{
		return firstname;
	}
	public WebElement lastname()
	{
		return lastname;
	}
	public WebElement email()
	{
		return email;
	}
			
	public WebElement pass()
	{
		return pass;
	}
	public WebElement mradio()
	{
		return mradio;
		
	}
    public WebElement phno()
    {
    	 return phno;
    }
    public WebElement add1()
    {
    	return add1;
    }
    public WebElement add2()
    {
    	return add2;
    }
    public WebElement city()
    {
    	return city;
    }
    public WebElement state()
    {
    	return state;
    }
    public WebElement zip()
    {
    	return zip;
    }
    public WebElement sam() 
    {
    	return sam;
    	
    }
    public WebElement apple()
    {
    	return apple;
    }
     
    public WebElement model()
    {
    	return model;
    }
    public WebElement count()
    {
    	return count;
    }
    public WebElement ba()
    {
    	return ba;
    }
    public WebElement Nft()
    {
    	return Nft;
    }
    public WebElement check1()
    {
    	return check1;
    }
    public WebElement button()
    {
    	return button;
    }
    public WebElement close()
    {
    	return close;
    }
    public WebElement model1()
    {
    	return model1;
    }
    public WebElement order2()
    {
    	return order2;
    }

	
}
