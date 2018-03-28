package firsttestngpackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListnerClass implements ITestListener{

 
@Override
public void onTestStart(ITestResult result) {
	System.out.println("The name of the test:"+result.getName()+"started");
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("The name of the test:"+result.getName()+"is passed");
	
}

@Override
public void onTestFailure(ITestResult result) {
	
	System.out.println("This test case is failed"+result.getName());
}

@Override
public void onTestSkipped(ITestResult result) {
	System.out.println("No method has skipped");
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	System.out.println("*********START*********");
	System.out.println("test method"+context.getName()+"started");
}

@Override
public void onFinish(ITestContext context) {
	System.out.println("*********FINISH*********");
	
}
}
