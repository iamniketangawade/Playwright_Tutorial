package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;



public class Playwright_Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page =browser.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/");
		
		assertThat(page).hasURL("https://testautomationpractice.blogspot./");
		assertThat(page).hasTitle("Automation Testing Practice");
		
		page.close();
		browser.close();
		playwright.close();
		
	}

}
