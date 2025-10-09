package Base;

import java.util.List;

import javax.naming.Context;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_handleMultiWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext =browser.newContext();
		Page page =browsercontext.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/");
		
		page.fill("//input[@id=\"Wikipedia1_wikipedia-search-input\"]", "selenium");
		page.click("//input[@type=\"submit\"]");
		
		Page childwindow =page.waitForPopup(() -> {
			page.click("//a[normalize-space()=\"Selenium\"]");
		});
		
		
		List<Page> allpages =browsercontext.pages();
		System.out.println( "List :: "  +allpages.size());
		System.out.println(page.title());

		
		
		
		Page childpage =allpages.get(1);
		System.out.println(childpage.title());



		

		
		
		
		
		
		
		
	}

}
