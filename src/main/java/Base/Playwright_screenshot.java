package Base;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;

public class Playwright_screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page =browser.newPage();
		page.navigate("https://testautomationpractice.blogspot.com");
		
		//Capturing page screeshot::
		String screenshot= "C:\\Users\\Niketan Gawade\\Documents\\AutomationTesting\\selenium\\Screenshots\\test1.png";
		page.screenshot(new ScreenshotOptions().setPath(Paths.get(screenshot)));
		
		
		//Capturing specific webelement screenshot ::
		page.locator("//button[normalize-space()=\"START\"]").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("C:\\Users\\Niketan Gawade\\Documents\\AutomationTesting\\selenium\\Screenshots\\test2.png")));
		
	}

}
