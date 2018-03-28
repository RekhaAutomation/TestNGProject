package firsttestngpackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UsingITestResult {
	WebDriver driver;
	
	
	 
	
  @Test
  public void invokebrowser()throws Exception {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.softwaretestingmaterial.com");
	 driver.navigate().refresh();
	 //making testcase fail by giving wrong xpath
	 driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile");
	  	  
  }
  @AfterMethod
  public void screenshot( ITestResult result) throws Exception {
	 
	  
	  if(ITestResult.FAILURE==result.getStatus()) {
		  try {
			  TakesScreenshot scrshot=(TakesScreenshot)driver;
			  
			File source=  scrshot.getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(source, new File("D://"+result.getName()+".png"));
			  System.out.println("Successfully captured a screenshot");
			  
			 
		} catch (Exception e) {
			 System.out.println("Exception while taking screenshot"+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
  }
	  driver.quit();
}}