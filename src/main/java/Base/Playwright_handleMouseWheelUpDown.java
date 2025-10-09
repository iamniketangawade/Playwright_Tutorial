package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_handleMouseWheelUpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/");
		
		//Move mouse wheel downward direction::
		page.mouse().wheel(0,500);        //(x axis , y axis)
		//Move mouse wheel downward direction::
		page.mouse().wheel(500,0); 

	}

}
