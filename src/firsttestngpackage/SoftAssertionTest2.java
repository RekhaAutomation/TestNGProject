package firsttestngpackage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class SoftAssertionTest2 {
	SoftAssert softobj=new SoftAssert();
  @Test
  public void openbrowser() {
	  System.out.println("executiong open browser method");
	  softobj.assertEquals(true, false);
	  System.out.println("its failed");
  	  System.out.println("login page test mehod executed");
	  Assert.assertEquals(true, true);
	  System.out.println("its passed");
 
	  System.out.println("advertisetest is executed");
	  softobj.assertEquals(true, false);
	  System.out.println("its failed");

 
	  System.out.println("showdeals is executed");
	  softobj.assertEquals(true, false);
	  System.out.println("its failed");
	  softobj.assertAll();
  }
	  @Test
	  public void logout() {
		  System.out.println("executing logout method");
		  softobj.assertEquals(true, false);
		  softobj.assertAll();
	  }
	  
  }
/*hard assertion ::if hard assertion is getting failed immediately test case is marked as failed and test case is 
terminated
soft assertion::if a soft assertion is getting failed test case is marked as passed as well as next lines will be
executed.But it has to mark the test case as failed.To solve this problem use assertAll().*/

