package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleProperties;
import org.testng.annotations.Test;

public class TC3_GetParticularRecord {
	
	@Test
	public void testcase3() throws IOException {
		Properties probject=HandleProperties.LoadPropertiesFile("../API_SEP_FW/URI.properties");
		
		HTTPMethods http = new HTTPMethods(probject);
		http.getParticularRecord("QA_URI", TC1_PostRequest.residvalue);
	}

}
