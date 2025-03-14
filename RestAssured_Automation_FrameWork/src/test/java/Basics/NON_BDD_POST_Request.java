package Basics;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NON_BDD_POST_Request {
 @Test
 public void OK() {
		
		
		String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		
		// Create a request specification 
		RequestSpecification request= RestAssured.given();
		
		// ContentType is an ENUM. 
		request.contentType(ContentType.JSON);
		//Adding URI
		request.baseUri("https://restful-booker.herokuapp.com/auth");
		// Adding body as string
		request.body(jsonString);
		
		// Calling POST method on URI. After hitting we get Response
		Response response = request.post();
		
		// Printing Response as string
		System.out.println(response.asString());
		
		// Get Validatable response to perform validation
		ValidatableResponse validatableResponse = response.then();
		
		// Validate status code as 200
		validatableResponse.statusCode(200);
		
		
		validatableResponse.body("token", Matchers.notNullValue());
		
		// Validate token length is 15
		validatableResponse.body("token.length()", Matchers.is(15));
		
		// Validate token is an alphanumeric value
		validatableResponse.body("token", Matchers.matchesRegex("^[a-z0-9]+$"));
 }
}
