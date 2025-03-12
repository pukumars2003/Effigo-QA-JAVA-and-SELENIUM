package Basics;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
public class GetMethod {
@Test(description="NON-BDD Style")
public void Testing() {
	RequestSpecification request=RestAssured.given();
	request.baseUri("https://restful-booker.herokuapp.com/booking");
	
	Response response =request.get();
	String reString=response.asString();
	System.out.println("Respones Details : "+reString);
	
	ValidatableResponse valres=response.then();
	//valres.statusCode(200);
	valres.statusCode(201); //Expected status code <201> but was <200>.
	valres.statusLine("HTTP/1.1 200 OK");
}

@Test(description="BDD Style")
public void Running() {
	// Given
			RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com")
			// When
			.when()
				.get("/booking")
			// Then
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK");
				// To verify booking count
				//.body("bookingid.sum()", Matchers.hasSize(6374222))
				// To verify booking id at index 3
				//.body("bookingid[3]", Matchers.equalTo(1));			
			

		}

}
