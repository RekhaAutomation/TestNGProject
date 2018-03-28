package firsttestngpackage;

import org.testng.annotations.Test;

public class ExceptiomTimeoutTest {
 /* @Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
  public void infiniteloop() {
	 int i=1;
	  while(i==1) {
		  
	  
	 System.out.println(i);
	  }	  
 }*/
	
	
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void exctest() {
		String x="100a";
				
		
		Integer.parseInt(x);
		
				
	}
}

/* handling errors without try/catch in TestNG is possible with
expectedExceptions=Exceptionname.class*/