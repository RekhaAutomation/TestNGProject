package com.test.utility;

import java.util.ArrayList;

import firsttestngpackage.Xls_Reader;

public class TestUtil2 {
	static Xls_Reader reader;
	
	

	 public static ArrayList<Object[]> getdatafromExcel() {
		 ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		 try {
			
			 reader=new Xls_Reader("C:\\Users\\ganib\\Documents\\Ebaytestdata.xlsx");
			 
			
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		for(int rowNum=2;rowNum<=reader.getRowCount("RegTestData");rowNum++) {
			 
			 String firstname=reader.getCellData("RegTestData", "Firstname", rowNum);
			 String lastname=reader.getCellData("RegTestData", "Lastname", rowNum);
			 String email=reader.getCellData("RegTestData", "Emailaddres", rowNum);
			 String password=reader.getCellData("RegTestData", "password", rowNum);
			 
		 
		
		 Object ob[]= {firstname,lastname,email,password};
			mydata.add(ob);
		 }
		 return mydata;
	}
}

