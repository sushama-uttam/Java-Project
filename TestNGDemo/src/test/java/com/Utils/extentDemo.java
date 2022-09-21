package com.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentDemo {
	
	 public ExtentSparkReporter spark;
	 public static ExtentReports extent;
	 public static ExtentTest test;
	
	public extentDemo() {	
		spark=new ExtentSparkReporter("Result/ExtentReport.html");
		extent=new ExtentReports();
		extent.attachReporter(spark); 
		spark.config().setTheme(Theme.DARK);		
	}
	public void setDocument(String Doc_title, String Report_name) {
		spark.config().setDocumentTitle(Doc_title);
		spark.config().setReportName(Report_name);	
	}
	public void AssignTest(String name) {
		test=extent.createTest(name).assignAuthor("Sushama Chavan");
	}
	public static void info(String testname,String data) {
		System.out.println("TESTNAME:"+testname);
		test.log(Status.INFO, testname);
		test.log(Status.INFO, MarkupHelper.createCodeBlock(data, CodeLanguage.JSON));
	}
	public static void Pass(String pass){
		test.log(Status.PASS, pass);
	}
	public static void Fail(String fail){
		test.log(Status.FAIL, fail);
	}
	public static void flush() {
		extent.flush();
	}
}
