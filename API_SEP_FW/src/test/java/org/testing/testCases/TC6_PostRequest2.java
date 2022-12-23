package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.HandleProperties;
import org.testing.utilities.JsonParsingUsingJsonPath;
import org.testing.utilities.JsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_PostRequest2 {
static String residvalue2;
	
	@Test
	public void testcase6() throws IOException {
	Properties probject=HandleProperties.LoadPropertiesFile("../API_SEP_FW/URI.properties");
	String inputbodydata = HandleJsonFile.readJson("../API_SEP_FW/src/test/java/org/testing/resources/Request2.json");
	Random r= new Random();
	Integer idvalue = r.nextInt();
	
	String updatesbodydata = JsonReplacement.jasonDataVariableValue(inputbodydata, "id", idvalue.toString());
	HTTPMethods http = new HTTPMethods(probject);
	Response resObj =	http.postRequest("QA_URI2", updatesbodydata);
	residvalue2 =JsonParsingUsingJsonPath.jsonParse(resObj, "id");
	System.out.println("Response id value2 :"+residvalue2);
	
	
	}
}
