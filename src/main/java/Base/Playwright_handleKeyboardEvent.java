package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator.TypeOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_handleKeyboardEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Playwright playwright =Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/");
		
		page.locator("//input[@id=\"name\"]").type("Niketan");
		//page.keyboard().press("Control+A");
		//page.keyboard().press("Enter");
		//page.keyboard().press("Tab");
	   //page.keyboard().press("Space");
		
		 page.keyboard().down("Shift");
		 
		 for(int i=0;i<3;i++) {
			 page.keyboard().press("Arr.owLeft");
			 
		 }

			page.locator("//input[@id=\"name\"]").type("Annu", new TypeOptions().setDelay(2000));
			


	
	}

}
