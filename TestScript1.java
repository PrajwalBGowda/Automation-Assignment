package MobileWorld;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Pom1;

public class TestScript1 {
	
	
	
		
		@Test(dataProvider="login")//LOGIN
		public void sign(String username,String Password) throws Exception
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(" https://mobileworld.azurewebsites.net/");
			Pom1 p3=new Pom1(driver);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			p3.s().click();
			Thread.sleep(2000);
			p3.u().sendKeys(username);
			Thread.sleep(2000);
			p3.p().sendKeys(Password);
			Thread.sleep(2000);
			p3.l().click();
			driver.close();
		}
		
		@DataProvider(name="login")
		public Object[][] getdata()
		{
			Object [][] data=new Object[4][2];
		  data [0][0]="Tester1";
		  data [0][1]="ABC";
		  data [1][0]="Tes";
		  data [1][1]="93434";
		  data [2][0]="Tester1Automatio@1234 $";
		  data[2][1]="ABCD9880";
		  data[3][0]="@#$Tester";
		  data[3][1]="A123456789";
		  
		  return data;
			
		}
		

	}



