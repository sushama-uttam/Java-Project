package com.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import com.Utils.extentDemo;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PreRequest {
	public static extentDemo demo;
	public static RequestSpecification req;
	public static ResponseSpecification resp;
	@BeforeSuite(alwaysRun=true,enabled=true)
	public void SparkLoad() {
		demo=new extentDemo();
		demo.setDocument("MAP_API", "Sushama Chavan");
	}

	@AfterMethod(alwaysRun=true)
	public void flush() {
		demo.flush();
	}
}
