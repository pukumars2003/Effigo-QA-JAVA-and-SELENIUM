package Basics;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class BDD {
	
	@Test
	public void test_Test() {
		given()
			.baseUri("https://restful-booker.herokuapp.com")
		.when()
			.get("/booking")
		.then()
			.statusCode(200);
	}
	
}
