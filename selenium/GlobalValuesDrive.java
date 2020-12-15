package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {
	public static void main(String[] args) throws IOException {

		// create properties
		Properties prop = new Properties();
		
		// create input stream
		FileInputStream fis = new FileInputStream("/Users/hamzaalicetin/Desktop/java/Selenium/src/data.properties");

		//load inputStream to created properties
		prop.load(fis);
		String dataBrowser = prop.getProperty("browser");
		System.out.println(dataBrowser);

		String dataURL = prop.getProperty("URL");
		System.out.println(dataURL);

		// setting new data

		prop.setProperty("URL", "https://www.youtube.com/");
		dataURL = prop.getProperty("URL");
		System.out.println(dataURL);

		prop.setProperty("name", "Hamza");
		String name = prop.getProperty("name");
		System.out.println(name);

		// To save a new creation date in the file

		FileOutputStream fos = new FileOutputStream("/Users/hamzaalicetin/Desktop/java/Selenium/src/data.properties");
		
		// load to properties 
		prop.store(fos, "New data");

	}

}
