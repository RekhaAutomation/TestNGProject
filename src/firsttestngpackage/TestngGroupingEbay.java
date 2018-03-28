package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngGroupingEbay {
	WebDriver driver;
  @Test(groups= {"LoginGroup"})
  public void gotoEbay(){
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.get("http://www.ebay.com");
	  
  }
  @Test(groups= {"SearchGroup"})
  public void searchitem() {
	  
	  driver.findElement(By.id("gh-ac")).sendKeys("sunglasses");
  }
  
}
