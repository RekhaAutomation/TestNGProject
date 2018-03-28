package firsttestngpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshot {
	WebDriver driver;
  @Test
  public  void screenshot1() throws Exception{
  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/V4/");
	  this.takesnapshot(driver, "D://test.png") ;
	  driver.quit();
	  
	  
}
  public static void takesnapshot(WebDriver driver,String filewithpath) throws IOException {
	//Convert web driver object to TakeScreenshot
	  TakesScreenshot scr=((TakesScreenshot)driver);
	  //Call getScreenshotAs method to create image file
File scrfile= scr.getScreenshotAs(OutputType.FILE);

//Move image file to new destination
File DestFile=new File(filewithpath);
FileUtils.copyFile(scrfile, DestFile);


	  
	  

  }
}