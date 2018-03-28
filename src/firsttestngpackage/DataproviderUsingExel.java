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

//import com.excel.utility.Xls_Reader;
import com.test.utility.TestUtil;

public class DataproviderUsingExel {

	WebDriver driver;
	Xls_Reader reader;

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testdata = TestUtil.getdatafrmExcel();
		return testdata.iterator();
	}

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://mail.google.com");

	}

	@Test(dataProvider = "getTestData")
	public void testlogin(String Username, String Password) {

		try {
			driver.findElement(By.id("identifierId")).sendKeys(Username);
			Thread.sleep(2000);
			driver.findElement(By.className("CwaK9")).click();

			driver.findElement(By.name("password")).sendKeys(Password);
			Thread.sleep(2000);
			driver.findElement(By.className("CwaK9")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
