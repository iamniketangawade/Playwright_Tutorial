package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Playwright_testsGroups {

	@Test(groups = "smoke")
	public void lauchBrowser() {
		System.out.println("lauchBrowser");
	}

	@Test(groups = {"smoke" ,"sanity"})
	public void Login() {
		System.out.println("login");
	}

	@Test(groups = {"regression","sanity"})
	public void setupField() {
		System.out.println("setupfield");
	}
	
	@Test(groups = {"regression","sanity"})
	public void CloseBrowser() {
		System.out.println("Close browser");
	}
}
