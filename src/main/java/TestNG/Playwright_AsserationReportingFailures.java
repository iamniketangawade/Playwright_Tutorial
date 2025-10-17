package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Playwright_AsserationReportingFailures {

	@Test
	public void validateTitle() {
	
		String expected_title="gmail.com";
		String actual_title="yahoo.com";
		/*
		if (expected_title.equals(actual_title)) {
			System.out.println("Testcase Passed");
		}
		else {
			System.out.println("Testcase Failed");

		}
//Result :
		// result print :: Testcase Failed
		//PASSED: TestNG.Playwright_AsserationReportingFailures.validateTitle
		
//@testNG asseration ::
//1.compare to house content address
 
		//Assert.assertEquals(actual_title,expected_title);
		//FAILED: TestNG.Playwright_AsserationReportingFailures.validateTitle
		//java.lang.AssertionError: expected [gmail.com] but found [yahoo.com]
		
		
//2.Assertion :
		//Assert.assertTrue(false,"element not found"); //return boolean value : true or false.
		//Assert.fail("Failing the testcase if button not show on webpage");

//3. Failure :: break the testcase
		System.out.println("Start");
		Assert.fail("");
		System.out.println("End");

		//Result ::
		//Start
		//FAILED: TestNG.Playwright_AsserationReportingFailures.validateTitle
*/
		
//4.SoftAssert assertion ::
		
	 SoftAssert softassert =new SoftAssert();
	 System.out.println("Start");
		softassert.assertEquals(actual_title,expected_title);
	  System.out.println("End");

		softassert.assertAll();

	
	
	
	}
}
