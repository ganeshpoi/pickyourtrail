package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Initializer {

	public static String getData(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream(new File("src/main/java/Testdata.properties"));
		Properties prop=new Properties();
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
		
	}
}
