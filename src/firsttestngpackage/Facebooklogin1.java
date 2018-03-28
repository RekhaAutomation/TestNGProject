package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebooklogin1 {
	WebDriver driver;
	
  @Test
  public void loginfacebook()
  {
	  driver.get("https://www.facebook.com");
  }
  @BeforeTest
  public void invokebrowser() {
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
  
}
  @AfterTest
  public void closebrowser() {
	  driver.close();
	  
  }
}