package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlayWright_handleBasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		//Handle basic Authencation:
		BrowserContext browserContext =browser.newContext(new Browser.NewContextOptions().setHttpCredentials("admin", "admin"));
		
		Page page =browserContext.newPage();
		page.navigate("http://the-internet.herokuapp.com/basic_auth");
	}

}
