package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Playwright_beforeAfterSuite {

		@BeforeSuite
		public void setup(){
			System.out.println("setup browser");
		}
		
		@AfterSuite
		public void tearDown(){
			System.out.println("close browser");
		}

}
