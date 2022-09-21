package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AddPlace.payload;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
public class Data_Provider {

	@Test(dataProvider="Title")
	   void dataProvPayLoad(String title, String body) {

	      //base URL
	      RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

	      //input details
	      given().header("Content-type", "application/json")

	      //adding post method with parameterization from data provider
	      .body(payload.postBody(title,body)).
	      when().post("/posts").then()
    
	      .assertThat().statusCode(201);
	   }

	   //data provider method
	   @DataProvider(name="Title")
	   public Object[][] getData() {
	     return new Object[][]
	      {{"Cypress","JavaScript"},{"Selenium","Python"}};
	   }
	}
