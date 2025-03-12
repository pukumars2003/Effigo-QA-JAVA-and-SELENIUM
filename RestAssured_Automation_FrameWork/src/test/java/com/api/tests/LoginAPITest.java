package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import static io.restassured.RestAssured.*;//improves readability

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {

	@Test(description="Testing the login")
	public void Login() {
		//baseURI="http://64.227.160.186:8080";
		RequestSpecification x=given();
		RequestSpecification y=x.header("Content-Type","application/json");
		RequestSpecification z=y.body("{\"username\":\"aJay\",\"password\":\"Ok1234@\"}");
		Response response=given()
				.baseUri("http://64.227.160.186:8080")
				.header("Content-Type","application/json")
				.body("{\"username\":\"aJay\",\"password\":\"Ok1234@\"}")
				.post("/api/auth/login");
		
		
		/*LoginRequest loginrequest=new LoginRequest("aJay","Ok1234@");
		
		AuthService auth=new AuthService();
		
		Response response=auth.login(loginrequest);
		LoginResponse loginresponse=response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());//Entire Json Object we desearlized this 
		System.out.println(loginresponse.getToken()); //and prinitng get me the token*/
		
	}
}
