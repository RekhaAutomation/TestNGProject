package firsttestngpackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(firsttestngpackage.ListnerClass.class)
public class TestListner1 {
	WebDriver driver;

	@Test
	public void invokebrowser() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Test
	public void logintoGoogle() {

		driver.get("https://www.google.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google123");
		
	}

	@Test
	// created to call onTestFail listener
	public void testtofail() {
		Assert.assertEquals(false, true);
		System.out.println("test case has failed");
	}
}
