package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	WebDriver driver;

	@Test

	public void invokebrowser() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}

	@Test(priority = 1, dataProvider = "dataprovider1", dataProviderClass = DataproviderClass.class)
	public void gotofacebook(String username, String password) {
		try {
			driver.get("http://www.facebook.com");
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.id("loginbutton")).submit();
			
				Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	/*@Test(dataProvider = "dataprovider1",dataProviderClass = DataproviderClass.class)
	public void printname(String name) {
		System.out.println("Email id is"+name);
	}*/

@AfterClass
public void quitbrowser() {
	driver.close();
}
}