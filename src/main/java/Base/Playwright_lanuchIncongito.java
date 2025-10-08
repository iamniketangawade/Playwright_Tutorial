package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_lanuchIncongito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext browserContext =browser.newContext();
		Page page =browserContext.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/?");
		
	}

}
