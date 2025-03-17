package Seventh_week;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
 
public class HamcrestString {
 
    public String endpoint = "https://restful-booker.herokuapp.com/booking/1";
 
    @Test
    public void stringAssertions() {
        RestAssured.given().contentType(ContentType.JSON)
                .when().get(endpoint)
                .then().body("firstname",equalTo("Mary"));
 
        RestAssured.given().contentType(ContentType.JSON)
                .when().get(endpoint)
                .then().body("firstname",equalToIgnoringCase("mary"));
 
        RestAssured.given().contentType(ContentType.JSON)
                .when().get(endpoint)
                .then().body("firstname",containsString("Mary"));
 
        RestAssured.given().contentType(ContentType.JSON)
                .when().get(endpoint)
                .then().body("firstname",startsWith("M"));
 
        RestAssured.given().contentType(ContentType.JSON)
                .when().get(endpoint)
                .then().body("firstname",endsWith("y"));
 
        RestAssured.given().contentType(ContentType.JSON)
                .when().get(endpoint)
                .then().body("firstname",equalToIgnoringWhiteSpace("   Mary "));
 
 
    }
}