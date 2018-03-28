package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestNGdependency {
	WebDriver driver;
  @Test()
  public void openbrowser() {
	 try {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.get("http://www.facebook.com");
	} catch (Exception e) {
				e.printStackTrace();
	}
  }
	  @Test(dependsOnMethods= {"openbrowser"})
	  public void logintofacebook() {
		  driver.findElement(By.id("email")).sendKeys("rekha.pasunoori");
		  driver.findElement(By.id("pass")).sendKeys("password");
		  driver.findElement(By.id("loginbutton")).click();
		 
		  
		  
	  }
	  @AfterClass
	public void  xitbrowser(){
		  System.out.println("executing method exit browser");
		  driver.close();
		  
	  }
  }
//if @Test--openbroser() testcase fails it will not execute @test--logintofacebook()-testcase
//dependable method should be enabled.should not mark (enable=flase).


