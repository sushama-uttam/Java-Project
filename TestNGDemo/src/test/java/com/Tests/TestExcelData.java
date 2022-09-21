package com.Tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.POJO.Place_API;
import com.POJO.PostData_TestNG;
import com.Utils.PropertiesFile;
import com.Utils.ReadExcelData;
import com.Utils.Spec;
import com.Utils.extentDemo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.given;

@Listeners(com.Tests.Listeners.class)

public class TestExcelData extends PreRequest{
	@DataProvider(name="Details")
	public Object[][] Credentials() throws IOException{
		String filePath = "./Data/TestData.xlsx";
		String sheetName = "Sheet1";
		ReadExcelData excelData = new ReadExcelData(filePath,sheetName);
		Object[][] data=null;
		data = excelData.readData(1, "post");
		return data;
	}
	@Test(priority=1,description="Post Data",dataProvider="Details")
	public void testRequest(String test,String path,double lat,double lng,double accuracy,String name,
			String phno,String addr,String type1,String type2,String web,String lang) throws FileNotFoundException, JsonProcessingException {
		PrintStream stream = PropertiesFile.response("Data/POST");
		Place_API place_API = PostData_TestNG.addAll(lat, lng, accuracy, name, phno, addr, type1, type2, web, lang);
		ObjectMapper objectMapper = new ObjectMapper();
		String payLoad= objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(place_API);
		String response = given().spec(Spec.request())
				.body(payLoad)
				.filter(ResponseLoggingFilter.logResponseTo(stream))
				.when()
				.post(path)
				.then().log().all().spec(Spec.response()).extract().response().asString();
		extentDemo.info("post", payLoad);
		System.out.println("Response"+response);
	}
}
