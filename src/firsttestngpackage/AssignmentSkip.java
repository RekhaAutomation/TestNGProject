package firsttestngpackage;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AssignmentSkip {
	WebDriver driver;
	String actualttl;
	String expttl;
		
	@Test
	public void invokebrowser() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		actualttl=driver.getTitle();
		expttl="1Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		//Assert.assertEquals(actualttl,expttl);
		if(actualttl.equals(expttl)) {	
		
	}
		else {
			throw new SkipException("Titles are not same");
		}
			driver.findElement(By.linkText("Your amazon.in")).click();
		
	}
  @AfterTest
  public void quitbrowsre() {
	  driver.close();
  }

}