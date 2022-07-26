package MobileWorld;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Pom4;

public class TestScript4 {
	
	@Test(dataProvider="data")//CONTACT US
	public void contact(String FN,String Email,String Phno,String msg) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.azurewebsites.net/");
		Pom4 p4=new Pom4(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		p4.support().click();
		
		p4.contactus().click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String p=it.next();
		String c=it.next();
	
		driver.switchTo().window(c);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		p4.usn().sendKeys(FN);
		Thread.sleep(2000);
		p4.email().sendKeys(Email);
		Thread.sleep(2000);
		p4.phn().sendKeys(Phno);
		Thread.sleep(2000);
		p4.msg().sendKeys(msg);
		Thread.sleep(2000);
		p4.send().click();
		driver.quit();
		
		
	}
	@DataProvider(name="data")
	public Object[][] getData()
	{
		Object [][] arr=new Object[3][4];
		arr[0][0]="Tes";
		arr[0][1]="tester1@example.com";
		arr[0][2]="2227690835";
		arr[0][3]="I am an Automation engineer";
		
		arr[1][0]="Tester";
		arr[1][1]="tester2@example2.com";
		arr[1][2]="2256292066";
		arr[1][3]="I am an SDET1 who is willing to gain more expertise on testing";
		 
		arr[2][0]=" ";
		arr[2][1]="abc ";
		arr[2][2]=" ";
		arr[2][3]="a";
		return arr;
	}
	
	
	
 
	
	
}
