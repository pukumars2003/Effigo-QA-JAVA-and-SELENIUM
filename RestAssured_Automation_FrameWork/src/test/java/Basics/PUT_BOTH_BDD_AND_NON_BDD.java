package Basics;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class PUT_BOTH_BDD_AND_NON_BDD {
/*@Test
public void OOK() {
	// There is no need to add escape character manually. Just paste string within
	// double
	// quotes. It will automatically add escape sequence as required.
	String jsonString = "{\r\n" + "    \"firstname\" : \"Amod\",\r\n" + "    \"lastname\" : \"Mahajan\",\r\n"
			+ "    \"totalprice\" : 111,\r\n" + "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n"
			+ "        \"checkin\" : \"2018-01-01\",\r\n" + "        \"checkout\" : \"2019-01-01\"\r\n"
			+ "    },\r\n" + "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}";

	//GIVEN
	RestAssured
		.given()
				.baseUri("https://restful-booker.herokuapp.com/booking/1")
				.cookie("token", "e88375c0fde687a")
				.contentType(ContentType.JSON)
				.body(jsonString)
		// WHEN
		.when()
				.put()
		// THEN
		.then()
				.assertThat()
				.statusCode(200)
				.body("firstname", Matchers.equalTo("Amod"))
				.body("lastname", Matchers.equalTo("Mahajan"));
}*/

@Test
public void OK() {
	
	
	RequestSpecification rs=RestAssured.given();
	RequestSpecification x=rs.baseUri("https://restful-booker.herokuapp.com/auth");
	RequestSpecification y=x.header("Content-Type","application/json");
	RequestSpecification z=y.body("{\"username\" : \"admin\",\"password\" : \"password123\"}");
	Response response=z.post();
	System.out.println(response.getStatusCode());
	System.out.println(response.asPrettyString());
	ValidatableResponse validatableResponse = response.then();
	//validatableResponse.assertThat().body(Matcher, null)
				
				
}

}
