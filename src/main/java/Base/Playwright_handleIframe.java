package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_handleIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		page.navigate("https://ui.vision/demo/webtest/frames/");
		
		Locator frames =page.locator("frame");
		System.out.println(frames.count());  //get count of all frame present on DOM.
		
		for(int i=0;i<frames.count();i++) {
			System.out.println(frames.nth(i).getAttribute("src"));   //Return all src text
		}

		
	}

}
