package firsttestngpackage;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
  @Test(invocationCount=10)
  public void add()
  {
	  int a,b,c;
	  a=10;
	  b=10;
			  c=a+b;
	  System.out.println("the sum is =="+c);
			  
	  
  }
}
