package Basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Extract_KeyWord {
	
	
	@Test
	public void hello() 
	{
		Response response=
		RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com")
	// When
	.when()
		.get("/booking")
	// Then
	.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		// To verify booking count
		//.body("bookingid.sum()", Matchers.hasSize(6374222))
		// To verify booking id at index 3
		//.body("bookingid[3]", Matchers.equalTo(1));			
	.extract()
		.response();
		
	Assert.assertTrue(response.body().asString().contains("bookingid"));
	}
}
