package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class HandleProperties {
/* purpose of this method - Load the properties file
 * Input - properties file path
 * output--------properties object
 */
	public static Properties LoadPropertiesFile(String filePath) throws IOException
	{
		File f = new File(filePath);
		FileReader fr = new FileReader(f);
		Properties pr = new Properties();
		pr.load(fr);
		return pr;
	}

}
