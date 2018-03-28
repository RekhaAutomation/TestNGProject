package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;
import org.testng.annotations.Parameters;


public class ParameterXml {
	WebDriver driver;
	
 @Test
  @Parameters({"url","email","pass"})
  public void longintoFacebook(String url,String email,String pass) {
	driver=new ChromeDriver();  
  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
  driver.get(url);
  driver.findElement(By.id("email")).sendKeys(email);
  driver.findElement(By.id("pass")).sendKeys(pass);
  driver.findElement(By.id("loginbutton")).click();
  
  }
}
 