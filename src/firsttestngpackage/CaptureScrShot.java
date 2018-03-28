package firsttestngpackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScrShot {
	WebDriver driver;
	
  @Test
  public void captureScreenShot() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
	  TakesScreenshot scrshot=((TakesScreenshot)driver);
	File source=  scrshot.getScreenshotAs(OutputType.FILE);
	//OR
	//FileUtils.copyFile(source,new File("D://testscrshot.png"));
	File destn= new File("D://testscrshot.png");
	FileUtils.copyFile(source,destn);
	
	  driver.close();
	  driver.quit();
	  
  }
}
