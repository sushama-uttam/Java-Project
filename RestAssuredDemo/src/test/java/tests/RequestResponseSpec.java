package tests;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import POJO.Location;
import POJO.Place_API;
import Specifications.Spec;
import io.restassured.RestAssured;
import io.restassured.config.LogConfig;


public class RequestResponseSpec {
	public static void main(String args[]) throws FileNotFoundException {
		//RestAssured.baseURI="https://rahulshettyacademy.com";
		PrintStream fileOutPutStream = new PrintStream(new File("C:\\Users\\Sushama Chavan\\Workspace\\a.txt"));
		RestAssured.config = config().logConfig(new LogConfig().defaultStream(fileOutPutStream)); 
		
		Place_API api = new Place_API();
		api.setAccuracy(50);
		api.setName("Sushama");
		api.setPhone_number("+91-9623720652");
		api.setAddress("Aundh");
		api.setLanguage("English");
		api.setWebsite("http://google.com");
		
		Location l = new Location();
		l.setLat(12.3);
		l.setLng(23.4);
		api.setLoc(l);
		
		List<String> types = new ArrayList<String>();
		types.add("One");
		types.add("Two");
		api.setTypes(types);
		
		//POST API		
		String response = given().spec(Spec.request()).body(api).when().
				post("/maps/api/place/add/json").
				then().log().all().spec(Spec.response()).extract().response().asString();
		System.out.println("Response is:"+response);
//		JsonPath js = new JsonPath(response);
//		System.out.println(js.get("place_id"));		
		
	}
}
