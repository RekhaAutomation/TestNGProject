package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class YahoologinTest {
	WebDriver driver;

	@BeforeTest
		public void invokebrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	@Test
	@Parameters({"emailid","password"})
	public void yahoo1(String emailid,String password) {
		driver.get("https://login.yahoo.com");
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		driver.findElement(By.id("login-passwd")).sendKeys(password);
		driver.findElement(By.id("login-signin")).click();
		
	}
	@AfterClass
	public void quitbrowser() {
		driver.close();
	}
}


// *[@id="login-username"]
// *[@id="login-signin"]
// https://login.yahoo.com/
//login-passwd