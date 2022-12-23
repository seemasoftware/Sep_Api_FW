package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonReplacement {
	/* input- bodydata (that is containing variable also),varaiableName,variableValue
	 * purpose- it will replace varibleValue with variableValue in the bodydata string
	 * output- After replacement this method will replace the latest string that is containing variableValue
	*/
	public static String jasonDataVariableValue(String completebody, String variableName, String variableValue)
	{
	completebody=completebody.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
	return completebody;
}
}