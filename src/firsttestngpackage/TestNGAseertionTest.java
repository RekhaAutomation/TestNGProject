package firsttestngpackage;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNGAseertionTest {
	SoftAssert softassr=new SoftAssert();
	@Test
	public void softAssertions() {
		
		
		System.out.println("SoftAssert method has started");
		softassr.assertTrue(false);
		System.out.println("softAssert method failed");
		softassr.assertAll();
		
	}
  @Test
  public void hardAssertions() {
	  System.out.println("HardAssert method has started");
	 Assert.assertTrue(false);
	 System.out.println("HardAssertion metod has failed");
	 
  }
  

}