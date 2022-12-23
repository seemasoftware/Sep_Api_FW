package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
	
	Properties pr;
	public HTTPMethods (Properties pr){
		this.pr=pr;
	}
	/*
 	input----------uriKey,request body data
	purpose-----hit the post request
	output------void
	 */
	public Response postRequest(String uriKey,String bodyData) {
		String urivalue = pr.getProperty(uriKey);
		
		Response res = given()
				.contentType(ContentType.JSON)
				.body(bodyData)
				.when()
				.post(urivalue);
		
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response is ");
		System.out.println(res.asString());	
		
		return res;
	}

	public void getAllRequest(String uriKey) {
		
		Response res = given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(uriKey));
		
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response is ");
		System.out.println(res.asString());	
	}
	
	public void getParticularRecord(String uriKey,String idValue) {
		String uri = pr.getProperty(uriKey)+"/"+idValue;
		Response res = given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
		
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response is ");
		System.out.println(res.asString());	
}
	
	public void updateRequest(String uriKey,String idValue, String bodyData) {
		
		String uri = pr.getProperty(uriKey)+"/"+idValue;
		Response res = given()
				.contentType(ContentType.JSON)
				.body(bodyData)
				.when()
				.put(uri);
		
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response is ");
		System.out.println(res.asString());	

	}
	
	public void deleteRequest(String uriKey,String idValue) {
		String uri = pr.getProperty(uriKey)+"/"+idValue;
		Response res = given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		
	}
}
