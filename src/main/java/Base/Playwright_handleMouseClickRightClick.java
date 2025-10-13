package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.MouseButton;

public class Playwright_handleMouseClickRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/");
		
		//click mouse on specific element.
		Locator button =page.locator("//button[normalize-space()=\"START\"]");
		//Click:: page +locator
		//button.click();
		
		//Right click:: page +mouse +click
		button.click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));
		
		
	}

}
