package firsttestngpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AssignmentSkip1 {
	WebDriver driver;
	String actualttl;
	String expttl;
	TakesScreenshot screenshot;

	@Test
	public void invokebrowser() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}

	/*
	 * @Test(expectedExceptions=
	 * {SkipException.class},expectedExceptionsMessageRegExp="verification failed")
	 * public void testfacebook() throws IOException { actualttl=driver.getTitle();
	 * expttl="1Facebook - Log In or Sign Up"; if(actualttl!=(expttl)) {
	 * screenshot=((TakesScreenshot) driver); File scrfile =
	 * screenshot.getScreenshotAs(OutputType.FILE); File DestFile = new
	 * File("D://screenshot1.png"); FileUtils.copyFile(scrfile, DestFile); throw new
	 * SkipException("verification failed");
	 * 
	 * 
	 * }else {
	 * 
	 * System.out.println("titles are same"); }
	 * 
	 * }
	 */
	@Test
	public void testfacebook() throws SkipException{
			
			actualttl = driver.getTitle();
			System.out.println("page tiltle is" +driver.getTitle());
													
			expttl = "Facebook - Log In or Sign Up";
			
			if (actualttl.equals(expttl)) {
				
				System.out.println("titles are same,test case passed");
				}
			else {				
				
			/*	screenshot=((TakesScreenshot) driver);
			File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("D://screenshot1.png");
			FileUtils.copyFile(scrfile, DestFile);*/
			throw new SkipException("pass");
				
			}
	
	}
	@Test
	public void quitbrowser() {
	
		driver.close();
	}
}
