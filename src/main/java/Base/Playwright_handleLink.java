package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_handleLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		page.navigate("https://www.wikipedia.org/");
		
		//Handling Link
		Locator links=page.locator("a");   
		System.out.println("Link count  :: " +links.count());   //get count of link
		
		//Handling link :: printing inner text and href(link)
		for(int i=0;i<links.count();i++) {
			System.out.println(links.nth(i).innerText() +" -> "+links.nth(i).getAttribute("href"));
		}
		
	}

}
