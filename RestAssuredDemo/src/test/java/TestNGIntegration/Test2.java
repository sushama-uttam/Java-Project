package TestNGIntegration;

import static io.restassured.RestAssured.given;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void test2() {

		JSONObject request = new JSONObject();
		request.put("name", "Sushama");
		request.put("job", "QA");

		System.out.println(request);
		System.out.println(request.toString());

		given().
		body(request.toString()).
		when().
		post("https://reqres.in/api/users").
		then().statusCode(201 );

	}

}