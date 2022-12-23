package org.testing.utilities;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath {
	
	public static String jsonParse(Response res,String jsonPath) 
	{
		String extractedValue = res.jsonPath().get(jsonPath);
		return extractedValue;
	}
}
