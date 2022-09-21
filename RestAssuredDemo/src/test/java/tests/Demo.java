package tests;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class Demo {
	public static void main(String args[]) throws FileNotFoundException {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		PrintStream fileOutPutStream = new PrintStream(new File("C:\\Users\\Sushama Chavan\\Workspace\\a.txt"));
		RestAssured.config = config().logConfig(new LogConfig().defaultStream(fileOutPutStream)); 
		
		//POST API
		
		String response = given().log().all().
				queryParam("key", "qaclick123").body("{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Frontline house\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n"
				+ "").when().post("/maps/api/place/add/json").
				then().log().all().assertThat().
				statusCode(200).extract().response().asString();
		//System.out.println("Response is:"+response);
		JsonPath js = new JsonPath(response);
		System.out.println(js.get("place_id"));	
		
		String place_id=js.get("place_id");
		System.out.println("ID:"+place_id);
		
		//GET API
		String getRes = given().log().all().queryParam("key", "qaclick123").queryParam("place_id",place_id).
				when().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200).
				extract().response().asString();
		System.out.println("Using get request"+getRes);
		
		//DELETE API
		String deleteAPI=given().log().all().queryParam("key", "qaclick123").body("{\r\n"+ "	\"place_id\":\""+place_id+"\"\r\n"+"}\r\n").
				when().delete("/maps/api/placde/delete/json").then().log().all().assertThat().statusCode(404).
				extract().asString();		
		System.out.println("Satus using delete API is:"+deleteAPI);
	}

}
