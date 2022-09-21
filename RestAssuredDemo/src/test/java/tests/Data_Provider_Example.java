package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Data_Provider_Example {
	@DataProvider(name = "md5hashes")
	public String[][] createMD5TestData() {
			
		return new String[][] {
				{"One", "111"},
				{"Two", "222"},
				{"Three", "333"}
		};
	}
	
	@Test(dataProvider = "md5hashes")
	public void md5JsonTest(String originalText, String md5Hash) {
			
		given().
			queryParam("text", originalText).
		when().
			get("http://md5.jsontest.com").
		then().
			assertThat().
			body("md5", equalTo(md5Hash));
	}
}
