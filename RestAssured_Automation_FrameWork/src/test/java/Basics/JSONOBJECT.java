package Basics;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

public class JSONOBJECT {
	@Test
	public void hello() 
	{	
		
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		JSONObject booking=new JSONObject();
		JSONObject bookingDates=new JSONObject();
		
		booking.put("firstname","okdf");
		booking.put("lastname","sda");
		booking.put("totalprice",42445);
		booking.put("depositpaid",true);
		booking.put("additionalneeds","vdsfd");
		booking.put("bookingdates", bookingDates);
		
		bookingDates.put("checkin", "2025-03-13");
		bookingDates.put("checkout", "20255-03-30");
		
				RestAssured.given()
				
				.baseUri("https://restful-booker.herokuapp.com")
				.contentType(ContentType.JSON)
				.body(booking.toString())
				//.log().body()
				//.log().all()
			// When
			.when()
				.post("/booking")
			// Then
			.then()
				.assertThat()
				//.log().ifValidationFails()
				.statusCode(201)
				.body("booking.firstname",Matchers.equalTo("okdf"));
			
				
	}
}
