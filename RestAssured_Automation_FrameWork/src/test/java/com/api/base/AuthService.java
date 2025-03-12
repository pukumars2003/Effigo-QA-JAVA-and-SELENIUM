package com.api.base;

import com.api.models.request.LoginRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService{
	
	private static final String BASE_PATH="/api/auth/";
	
	
	public Response login(LoginRequest loginrequest) {
		return postRequest(loginrequest,BASE_PATH + "login");
	}
}
