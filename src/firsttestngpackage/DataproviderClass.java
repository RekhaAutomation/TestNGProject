package firsttestngpackage;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataproviderClass {
	@DataProvider(name="dataprovider1",parallel=true)
	  public Object[][] valuesToTest(){
		  Object[][] values=null;
		  values= new Object[][]{{"rekha.ganib@gmail.com","password1234"},{"rekha.pasunoori@facebook.com","password2345"},{"nag1234@gmail.com","abcd1234"}};
		  return values;
	  }
  
/*	@DataProvider(name="dataprovider1",parallel=true)
	public Object[][] valuesToTest(Method m){
		Object[][] values=null;
		if(m.getName().equals("gotofacebook")) {
			values= new Object[][]{{"rekha.ganib@gmail.com","rekha@1234"},{"rekha.pasunoori@facebook.com","rekhanag@1234"},{"nag1234@gmail.com","abcd1234"}};
		}else if(m.getName().equals("printname")) {
				values=new Object[][] {{"rekha"},{"pasunoori"},{"nag"}};
			}
		
		return values;
		
	}*/
  }

