package MobileWorld;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Pom2;

public class TestScript2 {
	
     @Test(dataProvider="Signup")//SIGN UP
	public void signUp(String FN,String LN,String Email,String pass,String dob,String mobile,String bio) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://mobileworld.azurewebsites.net/");
	Pom2 p2=new Pom2(driver);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	p2.signin().click();
	Thread.sleep(2000);
	p2.signup().click();
	Thread.sleep(2000);
	p2.firstname().sendKeys(FN);
	Thread.sleep(2000);
	p2.lastname().sendKeys(LN);
	Thread.sleep(2000);
	p2.email().sendKeys(Email);
	Thread.sleep(2000);
	p2.password().sendKeys(pass);
	Thread.sleep(2000);
	p2.calendar().sendKeys(dob);
	Thread.sleep(2000);
	p2.male().click();
	Thread.sleep(2000);
	p2.mobileno().sendKeys(mobile);
	Thread.sleep(2000);
	p2.shortbio().sendKeys(bio);

	p2.register().click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	p2.signIn().click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	driver.close();
	}
	 
	@DataProvider(name = "Signup")
	public Object[][] getData()
	{
		Object[][] data=new Object[3][7];
		data[0][0]="tes";
		data[0][1]="man";
		data[0][2]="tester1manual@test.com";
		data[0][3]="1amn";
		data[0][4]="24-08-1998 ";
		data[0][5]="9343787254";
		data[0][6]="I am a  API tester";
		
		data[1][0]="tester";
		data[1][1]="manual";
		data[1][2]="Tester@test.com";
		data[1][3]="Tester1998";
		data[1][4]="14-09-1999";
		data[1][5]="123456789";
		data[1][6]="I am a Manual Tester";
	
		data[2][0]="ABCDEFGHIJKLMNOPQRST";
		data[2][1]=" TSRQPONMLKJIHGFEDCBA";
		data[2][2]="tester@yahoo.com";
		data[2][3]="qwertyke23";
		data[2][4]="14-09-1990";
		data[2][5]="08861015459";
		data[2][6]="I am a Automation Tester @Qualitest";
		return data;
		
		
	}

}