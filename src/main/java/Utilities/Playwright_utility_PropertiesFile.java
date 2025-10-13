package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Playwright_utility_PropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//How to read properties files
		Properties prop=new Properties();
		String filename ="C:\\Users\\Niketan Gawade\\eclipse-workspace\\Playwright-Java\\src\\main\\resources\\cofig.properties";
		FileInputStream file =new FileInputStream(filename);
		prop.load(file);
		
		System.out.println(prop.get("url"));
				
	}

}
