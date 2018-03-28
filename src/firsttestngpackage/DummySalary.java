package firsttestngpackage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DummySalary {
	
	static Xls_Reader reader;
	@DataProvider(name="LC")
  @Test(priority=1)
	public static ArrayList<Object[]> getdatafrmExcel() {
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();

	reader=new Xls_Reader("C:\\Users\\ganib\\OneDrive\\Documents\\assignmentdp.xlsx");
	 
	  return mydata;
	  
	  
  }
  @Test(dataProvider="LC")
  public void caliculate(String salary,String bonus ) {
	 long lsal=Long.parseLong(salary);
	 long lbonus=Long.parseLong(bonus);
	 long nsal=lsal+lbonus;
	 // return newsal;
	//  System.out.println("Newsalary is:"+newsal);
	 System.out.println("the new salary of emplyee is::"+nsal);
	
	  
  }
}
