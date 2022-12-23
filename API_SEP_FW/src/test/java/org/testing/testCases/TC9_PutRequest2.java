package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.HandleProperties;
import org.testing.utilities.JsonReplacement;
import org.testng.annotations.Test;

public class TC9_PutRequest2 {
	
	@Test
	public void testcase9() throws IOException {
		Properties probject=HandleProperties.LoadPropertiesFile("../API_SEP_FW/URI.properties");
		
		String inputbodydata = HandleJsonFile.readJson("../API_SEP_FW/src/test/java/org/testing/resources/RequestBodyForUpdate2.json");
		
		String updatesbodydata = JsonReplacement.jasonDataVariableValue(inputbodydata, "id", TC6_PostRequest2.residvalue2);
		HTTPMethods http = new HTTPMethods(probject);
		http.updateRequest("QA_URI2",TC6_PostRequest2.residvalue2, updatesbodydata);
		
	}
}
