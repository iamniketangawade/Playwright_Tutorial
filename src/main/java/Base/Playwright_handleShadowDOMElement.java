package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_handleShadowDOMElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Playwright playwright =Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		page.navigate("chrome://downloads/");
		
		page.locator("#searchInput").type("serach for variable");
		
		       
	}

}
