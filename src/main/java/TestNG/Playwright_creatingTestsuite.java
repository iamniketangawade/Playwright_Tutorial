package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

// Link the listener to this class
public class Playwright_creatingTestsuite extends Playwright_beforeAfterSuite {

	@Test
	public void Login() {
		System.out.println("login");
	}

	@Test
	public void setupField() {
		//Assert.fail("Failing the testcase if button not show on webpage");

	}
	
	public void setupFiles() {
			throw new SkipException("Skipping test case");
	}

	@Test
	public void Logout() {
		System.out.println("Logout");
	}
}
