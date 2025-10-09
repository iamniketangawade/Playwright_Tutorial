package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_handleMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		
		page.navigate("https://practice.expandtesting.com/hovers");
		
		String img1="img[alt=\"User Avatar\"][data-testid=\"img-user-1\"]";
		page.locator(img1).hover();          //hover mouse action/handles house cursor

	}

}
