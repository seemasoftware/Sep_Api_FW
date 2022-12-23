package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleProperties;
import org.testng.annotations.Test;

public class TC8_GetParticularRecord2 {
	
	@Test
	public void testcase8() throws IOException {
		Properties probject=HandleProperties.LoadPropertiesFile("../API_SEP_FW/URI.properties");
		
		HTTPMethods http = new HTTPMethods(probject);
		http.getParticularRecord("QA_URI2", TC6_PostRequest2.residvalue2);
	}

}
