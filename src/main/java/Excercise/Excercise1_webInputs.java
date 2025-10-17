package Excercise;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Excercise1_webInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome").setArgs(java.util.Arrays.asList("--start-maximized")));
		BrowserContext browserContext=browser.newContext();
		Page page =browserContext.newPage();
		
		page.navigate("https://practice.expandtesting.com/inputs");
		
		//Exercise :: 1 
		page.locator("//input[@id=\"input-number\"]").fill("978978");
		page.locator("//input[@id=\"input-text\"]").fill("Hello");
		page.locator("//input[@id=\"input-password\"]").fill("!QAZxsw2");
		
		 // Wait for input to be visible
        page.waitForSelector("input[type='date']");
        // Set the date value (format must be yyyy-MM-dd)
        page.locator("input[type='date']").fill("2025-10-14");
		
		page.click("//button[@id=\"btn-display-inputs\"]");
		
	}

}
