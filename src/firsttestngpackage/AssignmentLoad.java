package firsttestngpackage;

import org.testng.Assert;
//import  static org.testng.Assert.assertEquals;
//import  static org.testng.Assert.assertTrue;
import org.testng.Assert.*;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentLoad {
	WebDriver driver;
	//WebElement ftext;
	String exptl;
String actualtl="Google";
	@Test(priority = 0)

	public void invokebrowser() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		exptl=driver.getTitle();
		System.out.println("page title is " + driver.getTitle());
	}

	@Test(priority = 1,invocationCount=10,threadPoolSize=5)
	public void invkten() {

		Assert.assertEquals(actualtl,exptl );
		System.out.println("page title is same");
	}
		/*if (exptl==actualtl) {

			System.out.println("test case passed");
		} else {
			System.out.println("test case failed");
		}
	}
*/
	@Test(priority = 2)
	public void quitbrowser() {
		driver.close();
	}

}
