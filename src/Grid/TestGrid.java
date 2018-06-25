package Grid;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class TestGrid {
	static WebDriver driver;
	 static String hubUrl; 
	public static void main(String[] args) {
	try {
		hubUrl="http://192.168.1.140:4441/wd/hub";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		driver=new RemoteWebDriver(new URL(hubUrl),cap);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		driver.findElement(By.linkText("Today's Deals")).click();
	} catch (MalformedURLException e) {
			e.printStackTrace();
	}
	}
}