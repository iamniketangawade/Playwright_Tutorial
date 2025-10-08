package Base;

import java.nio.file.Paths;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_LaunchSpecificUserInBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright =Playwright.create();
		String userInfo= "C:\\Users\\Niketan Gawade\\AppData\\Local\\Google\\Chrome\\User Data\\Default";
		
		BrowserContext browsercontext = playwright.chromium().launchPersistentContext(Paths.get(userInfo),new BrowserType.LaunchPersistentContextOptions().setChannel("chrome").setHeadless(false).setArgs(java.util.Arrays.asList("--start-maximized")));
		Page page =browsercontext.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/?");
	}

}
