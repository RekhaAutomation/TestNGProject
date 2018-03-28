package firsttestngpackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureFailedTestcase {
	WebDriver driver;

	@Test
	public void loginyahoomail() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			driver.get("https://login.yahoo.com");

			driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("rekha123@yahoo.com");
			driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
			Thread.sleep(2000);
			// driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]")).submit();
			// Thread.sleep(2000);
			//driver.findElement(By.xpath("//*[@id=\"recaptcha-submit\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys("rekhanag1234");
			driver.findElement(By.xpath("//*[@id=\"login-signin1\"]")).click();
			
		} catch (Exception e) {
			TakesScreenshot screenshot = ((TakesScreenshot) driver);
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("D://failedtestscr.png"));

			e.printStackTrace();

		}
		driver.close(); //// *[@id="login-signin"]
		//// *[@id="login-passwd"]
	}

}
