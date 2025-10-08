package Base;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_maximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Playwright playwright =Playwright.create();  //Create Playwright interface
		
		//minimize browser::
/*
		Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext= browser.newContext(new Browser.NewContextOptions().setViewportSize(200,100)); //Minimize the screen window
		Page page =browserContext.newPage();
		
		page.navigate("https://testautomationpractice.blogspot.com/?"); //Navigate URL
		System.out.println(page.title());  //Return : Page title
		
		  //Close the session.
	
*/

/*
	  //maximize browser::
	Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(java.util.Arrays.asList("--start-maximized")));
	BrowserContext browserContext= browser.newContext(new Browser.NewContextOptions().setViewportSize(null)); //Minimize the screen window
	Page page =browserContext.newPage();

	page.navigate("https://testautomationpractice.blogspot.com/?"); //Navigate URL
	System.out.println(page.title());  //Return : Page title

  //Close the session.
*/

	//Another simple way of Maximizing the window - Code
	ArrayList<String> arguments =new ArrayList<String>();
	arguments.add("--start-maximized");
	Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments));
	BrowserContext browserContext= browser.newContext(new Browser.NewContextOptions().setViewportSize(null)); //Minimize the screen window
	Page page =browserContext.newPage();

	page.navigate("https://testautomationpractice.blogspot.com/?"); //Navigate URL
	System.out.println(page.title());  //Return : Page title
	}

}
