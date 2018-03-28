package firsttestngpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.test.utility.TestUtil2;

public class HalfEbayTest {
	WebDriver driver;
  @BeforeTest
  public void setUp() {
	  
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");	
		
  }
  
  @DataProvider
  public Iterator<Object[]> getTestData() {
	 ArrayList<Object[]> testdata=TestUtil2.getdatafromExcel();
	 return testdata.iterator();
	  
  }
  
  
  @Test(dataProvider="getTestData")
  public void halfEbayRegpageTest(String firstName,String lastName,String mailid,String password) {
	  driver.findElement(By.id("firstname")).clear();
      driver.findElement(By.id("firstname")).sendKeys(firstName);
      driver.findElement(By.id("lastname")).clear();
      driver.findElement(By.id("lastname")).sendKeys(lastName);
      driver.findElement(By.id("email")).clear();
      driver.findElement(By.id("email")).sendKeys(mailid);
      driver.findElement(By.id("PASSWORD")).clear();
      driver.findElement(By.id("PASSWORD")).sendKeys(password);
	  
	  
  }
  
  @AfterTest
  public void teardown() {
	  driver.close();
  }
}
