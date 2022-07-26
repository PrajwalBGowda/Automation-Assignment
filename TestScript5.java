package MobileWorld;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObject.Pom5;

public class TestScript5 {
	
	@SuppressWarnings("deprecation")
	@Test(priority=1,dataProvider="data")//ALL MOBILES
	public void allmobilesApple(String FN,String LN,String Email,String Passkey,String Phno,String add1,String add2,String city,String zip) throws Exception//ORDER APPLE IPHONE XS
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.azurewebsites.net/");
		Pom5 p5=new Pom5(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		p5.allmobile().click();
		Thread.sleep(2000);
		p5.search().sendKeys("Apple");
		Thread.sleep(2000);
		p5.order().click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String p=it.next();
		String c=it.next();
		driver.switchTo().window(c);
		p5.firstname().sendKeys(FN);
		Thread.sleep(2000);
		p5.lastname().sendKeys(LN);
		Thread.sleep(2000);
		p5.email().sendKeys(Email);
		Thread.sleep(2000);
		p5.pass().sendKeys(Passkey);
		Thread.sleep(2000);
		p5.mradio().click();
		p5.phno().sendKeys(Phno);
		Thread.sleep(2000);
		p5.add1().sendKeys(add1);
		Thread.sleep(2000);
		p5.add2().sendKeys(add2);
		Thread.sleep(2000);
		p5.city().sendKeys(city);
		Thread.sleep(2000);
		p5.state().click();
		Select s = new Select(p5.state());
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		p5.zip().sendKeys(zip);
		p5.sam().click();
		p5.apple().click();
		
	     p5.model().click();
		
		p5.count().sendKeys("2");
		p5.ba().click();
		Select r = new Select(p5.ba());
		r.selectByIndex(1);
		p5.check1().click();
		p5.button().click();
		p5.close().click();
		driver.close();
		driver.quit();
		
		
	}
	@SuppressWarnings("deprecation")
	@Test(priority=2,dataProvider="data")
	public void allmobilesSamsung(String FN,String LN,String Email,String Passkey,String Phno,String add1,String add2,String city,String zip) throws Exception//ORDER SAMSUNG S 21
	{

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://mobileworld.azurewebsites.net/");
		Pom5 p5=new Pom5(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		p5.allmobile().click();
		p5.search().sendKeys("Samsung");
		Thread.sleep(2000);
		p5.order2().click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String p=it.next();
		String c=it.next();
		driver.switchTo().window(c);
		Thread.sleep(2000);
		p5.firstname().sendKeys(FN);
		Thread.sleep(2000);
		p5.lastname().sendKeys(LN);
		Thread.sleep(2000);
		p5.email().sendKeys(Email);
		Thread.sleep(2000);
		p5.pass().sendKeys(Passkey);
		Thread.sleep(2000);
		p5.mradio().click();
		p5.phno().sendKeys(Phno);
		Thread.sleep(2000);
		p5.add1().sendKeys(add1);
		Thread.sleep(2000);
		p5.add2().sendKeys(add2);
		Thread.sleep(2000);
		p5.city().sendKeys(city);
		Thread.sleep(2000);
		p5.state().click();
		Select s = new Select(p5.state());
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		p5.zip().sendKeys(zip);
		p5.model2().click();
		p5.count().sendKeys("2");
		p5.ba().click();
		Select r = new Select(p5.ba());
		r.selectByIndex(0);
		p5.check1().click();
		p5.button().click();
		p5.close().click();
		driver.close();
		driver.quit();
	}
	
	@DataProvider(name="data")
	public Object[][] getData()
	{
		Object[][] arr=new Object[3][9];
		arr[0][0]="Pra";
		arr[0][1]="Gow ";
		arr[0][2]="ManualTester@gmail.com";
		arr[0][3]=" 123";
		arr[0][4]="2227690835";
		arr[0][5]=" 12a";
		arr[0][6]="se1";
		arr[0][7]="Ban ";
		arr[0][8]=" 40092";
		
		arr[1][0]="Tester 1";
		arr[1][1]="Manual Tester";
		arr[1][2]="tester1@yahoo.com";
		arr[1][3]=" 123tester";
		arr[1][4]="0112622890";
		arr[1][5]="No 46 PNivas VV Layout,Siriyappa Layout";
		arr[1][6]="Urban Bangalore ,State PO";
		arr[1][7]="State Resident";
		arr[1][8]="600028";
		
		arr[2][0]="example firstname tester1";
		arr[2][1]="example last name tester2 ";
		arr[2][2]="tester2@example.com";
		arr[2][3]=" 123@password1";
		arr[2][4]="";
		arr[2][5]="No 46 Pnivas VV Layout,Siriyappa Layout";
		arr[2][6]="Urban Bangalore ,State PO";
		arr[2][7]="State Resident1";
		arr[2][8]="11048";
		return arr;
		
				
	}

}
