package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Playwright_creatingTestDepedencies {
	
		@BeforeMethod  //Every method before execute this method 
		public void lauchBrowser() {
		System.out.println("lauchBrowser");
		}
	
		@Test(priority = 1) //execute test case method
		public void Login() {
			System.out.println("login");
			Assert.fail("user not registered successfully");
		}
		
		@Test(priority = 2,dependsOnMethods ="Login",alwaysRun = true)        //setup the priority for testcase method which will execute first
		public void setupField() {
			System.out.println("setupfield");
		}
		
		@AfterMethod   //Every method after execute this method 
		public void CloseBrowser() {
			System.out.println("Close browser");
		}	
	
}
