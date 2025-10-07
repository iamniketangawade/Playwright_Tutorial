package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_applicationSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Default  :: Chromium browser 
		Playwright playwright =Playwright.create();  //Create Playwright interface
		
		//Maximize browser::
		Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext= browser.newContext(new Browser.NewContextOptions().setViewportSize(200,100)); //Minimize the screen window
		Page page =browserContext.newPage();
		
		page.navigate("https://testautomationpractice.blogspot.com/?"); //Navigate URL
		System.out.println(page.title());  //Return : Page title
		
		  //Close the session.
	}

}
