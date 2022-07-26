package MobileWorld;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Pom3;

public class TestScript3 {
	
	@Test(priority=1,dataProvider="data")//ORDER
	public void orderIphone(String FN,String LN,String Email,String Passkey,String Phno,String add1,String add2,String city,String zip) 
	{
		
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(" https://mobileworld.azurewebsites.net/");
			Pom3 p3=new Pom3(driver);
			p3.dropdown().click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			p3.order().click();
			Set<String> windows = driver.getWindowHandles();
			Iterator <String> it = windows.iterator();
			String parent_id=it.next();
			String child_id=it.next();
			driver.switchTo().window(child_id);
		
			p3.firstname().sendKeys(FN);
			p3.lastname().sendKeys(LN);
			p3.email().sendKeys(Email);
			p3.pass().sendKeys(Passkey);
			p3.mradio().click();
			p3.phno().sendKeys(Phno);
			p3.add1().sendKeys(add1);
			p3.add2().sendKeys(add2);
			p3.city().sendKeys(city);
			p3.state().click();
			Select s = new Select(p3.state());
			s.selectByIndex(2);
			
			p3.zip().sendKeys(zip);
			p3.sam().click();
			p3.apple().click();
			
		     p3.model().click();
			
			p3.count().sendKeys("2");
			p3.ba().click();
			Select r = new Select(p3.ba());
			r.selectByIndex(0);
			p3.check1().click();
			p3.button().click();
			p3.close().click();
			driver.close();
			driver.quit();
			
	}
		@Test(priority=2,dataProvider="data")
		public void orderSamsung(String FN,String LN,String Email,String Passkey,String Phno,String add1,String add2,String city,String zip) throws Exception
		{  
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(" https://mobileworld.azurewebsites.net/");
			Pom3 p3=new Pom3(driver);
			p3.dropdown().click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			p3.order().click();
			Set<String> windows = driver.getWindowHandles();
			Iterator <String> it = windows.iterator();
			String parent_id=it.next();
			String child_id=it.next();
			driver.switchTo().window(child_id);
		
			p3.firstname().sendKeys(FN);
			p3.lastname().sendKeys(LN);
			p3.email().sendKeys(Email);
			p3.pass().sendKeys(Passkey);
			p3.mradio().click();
			p3.phno().sendKeys(Phno);
			p3.add1().sendKeys(add1);
			p3.add2().sendKeys(add2);
			p3.city().sendKeys(city);
			p3.state().click();
			Select s = new Select(p3.state());
			s.selectByIndex(2);
			
			p3.zip().sendKeys(zip);
			
			
			
		    p3.model1().click();
			
			p3.count().sendKeys("2");
			p3.ba().click();
			Select r = new Select(p3.ba());
			r.selectByIndex(0);
			p3.check1().click();
			p3.button().click();
			p3.close().click();
			driver.close();
			driver.quit();
			
		}
		
		@Test(priority=3,dataProvider="data")
		public void orderLenovo(String FN,String LN,String Email,String Passkey,String Phno,String add1,String add2,String city,String zip) throws Exception
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(" https://mobileworld.azurewebsites.net/");
			Pom3 p3=new Pom3(driver);
			p3.dropdown().click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			p3.order().click();
			Set<String> windows = driver.getWindowHandles();
			Iterator <String> it = windows.iterator();
			String parent_id=it.next();
			String child_id=it.next();
			driver.switchTo().window(child_id);
		
			p3.firstname().sendKeys(FN);
			Thread.sleep(2000);
			p3.lastname().sendKeys(LN);
			Thread.sleep(2000);
			p3.email().sendKeys(Email);
			Thread.sleep(2000);
			p3.pass().sendKeys(Passkey);
			Thread.sleep(2000);
			p3.mradio().click();
			Thread.sleep(2000);
			p3.phno().sendKeys(Phno);
			Thread.sleep(2000);
			p3.add1().sendKeys(add1);
			Thread.sleep(2000);
			p3.add2().sendKeys(add2);
			Thread.sleep(2000);
			p3.city().sendKeys(city);
			Thread.sleep(2000);
			p3.state().click();
			Select s = new Select(p3.state());
			s.selectByIndex(2);
			Thread.sleep(2000);
			
			p3.zip().sendKeys(zip);
			Thread.sleep(2000);
			p3.sam().click();
			Thread.sleep(2000);
			p3.lenovo().click();
			Thread.sleep(2000);
		     p3.model2().click();
		     Thread.sleep(2000);
			p3.count().sendKeys("2");
			p3.ba().click();
			Select r = new Select(p3.ba());
			r.selectByIndex(0);
			Thread.sleep(2000);
			p3.check1().click();
			Thread.sleep(2000);
			p3.check2().click();
			Thread.sleep(2000);
			p3.button().click();
			Thread.sleep(2000);
			p3.close().click();
			driver.close();
			driver.quit();
			
		}
		@DataProvider(name ="data")
		public Object[][] getData()
		{
			Object [][] arr =new Object[2][9];
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
			
			arr[1][0]="example firstname tester1";
			arr[1][1]="example last name tester2 ";
			arr[1][2]="tester2@example.com";
			arr[1][3]=" 123@password1";
			arr[1][4]="";
			arr[1][5]="No 46 Pnivas VV Layout,Siriyappa Layout";
			arr[1][6]="Urban Bangalore ,State PO";
			arr[1][7]="State Resident1";
			arr[1][8]="11048";
			return arr;
			
		}

}
