package firsttestngpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	public String baseUrl = "http://demo.guru99.com/selenium/newtours/";
    String driverPath = "C:\\chromedriver.exe";
    public WebDriver driver ; 
	
 
  @BeforeSuite//executes first
  public void beforesuite() {
	  System.out.println("Before suite test annotation executed");
  }
  @Test(priority=0)
  public void verifyHomepageTitle() {
	  
      
      System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
     
  
  }
  @Test(priority=2)
  public void verifytitle() {
	  driver.manage().deleteAllCookies();
String burl="https://www.google.com";
	driver.get(burl);
	String attl=driver.getTitle();
	Assert.assertEquals(attl, "Google");
System.out.println("second test case executed");	
  }
  
  @AfterClass //executed 5th
  public void xitbrowser() {
	  driver.close();
	  System.out.println("executed after class annotation");
	  
  }
  
  @BeforeMethod//executed 4th
  public void beforemethod()
  {
	  System.out.println("before every test method"); 
  }
  @AfterMethod
  public void aftermethod() {
	  System.out.println("executed after every test method");
	  
  }
  @BeforeClass//executed 3rd
  public void beforeclass() {
	  System.out.println("executed before class"); 
  }
 

@BeforeTest//executed 2nd
public void beforetest() {
	System.out.println("executed before  test");
}
@AfterTest//executed 6th
public void aftertest() {
	System.out.println("executed after test");
}
}
//creates pair for each testcase
//@beforeMethod
//@Test
//@AfterMethod
//All other annotated methods are executed only once.
