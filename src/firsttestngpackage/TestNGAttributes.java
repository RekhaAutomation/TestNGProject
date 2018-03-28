package firsttestngpackage;

import org.testng.annotations.Test;

public class TestNGAttributes {
	

  @Test(priority=0)
  public void d() {
  }
  @Test(dependsOnMethods= {"h"})
  public void e() {
  
}
  @Test(priority=89)
  public void o() {
	  
  }
  @Test(priority=47)
  public void h() {
	  
  }
  @Test(enabled=false)
public void f() {
	  
  }
  @Test(priority=3)
public void m() {
	  
}
}
//priority attribute of TestNg defines the sequence of executing test cases.
//For ex.value 0 has high priority and value 10 has low priority.lower the value higher the priority.