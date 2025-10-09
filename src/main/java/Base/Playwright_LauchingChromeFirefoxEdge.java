package Base;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_LauchingChromeFirefoxEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		
		//Chromium supports :: msedge ,chrome 
		//msedge browser launch 
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false));  //Launch msedge browser
	  //Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false)); // Launch chrome browser

		BrowserContext browsercontext =browser.newContext();
		Page page = browsercontext.newPage();
		
		page.navigate("https://testautomationpractice.blogspot.com/?");
		
		playwright.close();
		
		
	}

}
