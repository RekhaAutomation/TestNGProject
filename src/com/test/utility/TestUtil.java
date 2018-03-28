package com.test.utility;

import java.util.ArrayList;

import firsttestngpackage.Xls_Reader;

public class TestUtil {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getdatafrmExcel() {
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();

		try {
			reader = new Xls_Reader("C:\\Users\\ganib\\OneDrive\\Documents\\logindata.xlsx");

		} catch (Exception e) {

			e.printStackTrace();
		}
for(int rowNum=2;rowNum<=reader.getRowCount("logindata");rowNum++) {
	
	String Username=reader.getCellData("logindata", "Username", rowNum);
	String Password=reader.getCellData("logindata", "Password", rowNum);
	
	Object ob[]= {Username,Password};
	mydata.add(ob);
}
		return mydata;

	}
}
