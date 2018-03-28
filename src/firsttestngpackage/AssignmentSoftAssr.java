package firsttestngpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssignmentSoftAssr {
	WebDriver driver;
	String expectedtitle = "Facebook1 - Log In or Sign Up";
	String actualtitle;
	SoftAssert s_assert;
	TakesScreenshot screenshot;

	@Test
	public void invokebrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		actualtitle = driver.getTitle();
		System.out.println("Page title is "+actualtitle);
		//Assert.assertEquals(actualtitle, expectedtitle);
	s_assert=new SoftAssert();
		s_assert.assertEquals(actualtitle,expectedtitle);
		System.out.println("test case passed");
		screenshot = ((TakesScreenshot) driver);
		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("D://screenshot1.png");
		FileUtils.copyFile(scrfile, DestFile);
		s_assert.assertAll();
		
	}

	@Test
	public void quitbrowser() {
		driver.close();
		System.out.println("browser is closed");
		//s_assert.assertAll();
	}

}
