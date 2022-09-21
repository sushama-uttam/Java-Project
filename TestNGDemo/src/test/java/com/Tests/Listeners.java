package com.Tests;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.Utils.extentDemo;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		PreRequest.demo.AssignTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
//		String	respo=null;
//		try {
//			respo =(String) result.getTestClass().getRealClass().getDeclaredField(("respo_"+result.getMethod().getMethodName())).get(result.getInstance());
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
		extentDemo.Pass("Test case pass");
	}

	public void onTestFailure(ITestResult result) {
		extentDemo.Fail(result.getTestName()+result.getThrowable());			
	}

	public void onTestSkipped(ITestResult result) {


	}


}
