package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class Playwright_Log4j {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//capturing detail logs::
		Logger log =Logger.getLogger(Playwright_Log4j.class);
		
		//How to read properties files
				Properties prop=new Properties();
				String filename ="C:\\Users\\Niketan Gawade\\eclipse-workspace\\Playwright-Java\\src\\main\\resources\\cofig.properties";
				FileInputStream file =new FileInputStream(filename);
				prop.load(file);
				
				Playwright playwright =Playwright.create();
				Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
				log.info("Chrome browser lauched");
				log.error("Error find..............");
				
				playwright.close();
	}

}
