package tests;

import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
import POJO.Location;
import POJO.Place_API;
import Specifications.Spec;

public class Test4 {
	Place_API api;
	@Test(priority=0)
	public void display() {
		api = new Place_API();
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
	}

	@Test(dependsOnMethods="display")
	public void verify() {
		String response = given().spec(Spec.request()).body(api).when().
				post("/maps/api/place/add/json").
				then().log().all().spec(Spec.response()).extract().response().asString();
		System.out.println("Response is:"+response);
	}
}
