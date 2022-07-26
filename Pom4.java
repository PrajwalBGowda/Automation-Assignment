package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 {
	
	WebDriver driver;
	 public Pom4(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="(//a[@id='navbarDropdown'])[2]")
	 WebElement support;
	 @FindBy(xpath="//a[.='Order']/following-sibling::a[.='Contact Us']")
	 WebElement contactus;
	 @FindBy(xpath="//input[@placeholder=\"Username\"]")
	 WebElement Usn;
	 @FindBy(xpath="//input[@placeholder='Email']")
	 WebElement email;
	 @FindBy(xpath="//input[@placeholder='Phone']")
	 WebElement phn;
	 @FindBy(xpath="//textarea[@placeholder='Message']")
	 WebElement msg;
	 @FindBy(xpath="//input[@value='Send']")
	 WebElement send;
	 
	 public WebElement support()
	 {
		 return support;
	 }
	 public WebElement contactus()
	 {
		 return contactus;
		 
	 }
	 public WebElement usn()
	 {
		 return Usn;
	 }
     public WebElement email()
     {
    	 return email;
     }
     public WebElement phn()
     {
    	 return phn;
     }
     public WebElement msg()
     {
    	 return msg;
     }
     public WebElement send()
     {
    	 return send;
     }
}
