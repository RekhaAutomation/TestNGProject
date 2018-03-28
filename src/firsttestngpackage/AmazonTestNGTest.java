package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTestNGTest {
	WebDriver driver;
	WebElement link;
	String url="http://www.amazon.com";
	
  @Test
  public void cliconlink()
  {
	link= driver.findElement(By.linkText("Your Amazon.com"));
	System.out.println("link title is"+link);
	link.click();
  }
  @BeforeClass
  public void invokebrowser() {
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);
   		System.out.println("Page title is:" + driver.getTitle());
     
  }
  @AfterClass
  public void closebrowser() {
	  driver.close();
}
}