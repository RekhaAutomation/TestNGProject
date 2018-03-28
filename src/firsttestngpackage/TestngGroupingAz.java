package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestngGroupingAz {
	WebDriver driver;
  @Test(groups= {"LoginGroup"})
  public void logintoAmazon() {
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      driver.get("http://www.amazon.com");
     // driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[1]"));
       
  }
  @Test(groups= {"SearchGroup"})
  public void serchitem() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Non-Fictionbooks");
  }
 // @AfterClass
 // public void quitbrowser() {
	//  driver.close();
 // }
}
