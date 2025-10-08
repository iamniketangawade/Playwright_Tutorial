package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GoBackOptions;
import com.microsoft.playwright.Page.NavigateOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.WaitUntilState;

public class Playwright_navigationMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext browserContext =browser.newContext();
		Page page =browserContext.newPage();
		
		//✅ 1.Basic navigation option
		page.navigate("https://testautomationpractice.blogspot.com/?");

		//✅ 2. Navigation with Wait Options
		page.navigate("https://testautomationpractice.blogspot.com/?",
				new NavigateOptions().setTimeout(5000)   //
				.setWaitUntil(WaitUntilState.NETWORKIDLE));
		
		/*
		//Wait states:
		LOAD → Waits for the load event.
		DOMCONTENTLOADED → Waits for DOM to be ready.
		NETWORKIDLE → Waits until no network requests for 500ms. */
		
		//✅ 3. Forward, Backward, and Refresh Navigation
		page.goBack();  //Going backward page;
		Thread.sleep(2000);
		
		page.goForward(); //Going forward page
		Thread.sleep(2000);
		
		page.reload();  //Page refresh
		

	} 

}
