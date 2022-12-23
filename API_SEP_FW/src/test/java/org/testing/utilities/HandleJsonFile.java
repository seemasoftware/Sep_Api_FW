package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;


/*input------------jsonfilepath
purpose--------to read the json file
output----------json data in string format
*/

public class HandleJsonFile {
	
	public static String readJson(String JsonFilePath) throws FileNotFoundException {
		File f = new File(JsonFilePath);
		FileReader fr=new FileReader(f);
		JSONTokener js= new JSONTokener(fr);
		JSONObject j = new JSONObject(js);
		return j.toString();
	}

}
