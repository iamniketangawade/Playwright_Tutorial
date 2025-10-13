package Base;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_captureVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		//caputring video of test ::
		String video="C:\\Users\\Niketan Gawade\\Documents\\AutomationTesting\\selenium\\Videos\\test1.mp4";
		BrowserContext browsercontext =browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get(video)));
		Page page =browsercontext.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/");
		
		page.locator("//input[@id=\"name\"]").fill("Niketan video is started.");
		
		playwright.close();
		
	}

}
