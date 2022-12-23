package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.HandleProperties;
import org.testing.utilities.JsonReplacement;
import org.testng.annotations.Test;

public class TC4_PutRequest {

	@Test
	public void testcase4() throws IOException {
		Properties probject=HandleProperties.LoadPropertiesFile("../API_SEP_FW/URI.properties");
		
		String inputbodydata = HandleJsonFile.readJson("../API_SEP_FW/src/test/java/org/testing/resources/RequestBodyForUpdate.json");
		
		String updatesbodydata = JsonReplacement.jasonDataVariableValue(inputbodydata, "id", TC1_PostRequest.residvalue);
		HTTPMethods http = new HTTPMethods(probject);
		http.updateRequest("QA_URI",TC1_PostRequest.residvalue, updatesbodydata);
		
	}
}
