package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_handleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page page =browser.newPage();
		page.navigate("https://practice.expandtesting.com/login");
		
		page.fill("//input[@id='username']","practice");
		page.fill("//input[@id='password']","SuperSecretPassword!");
		page.click("//button[@type='submit']");
	
		page.onDialog(dialog ->{
			dialog.accept();  //accept dialog
			dialog.dismiss(); //dismiss dialog 
			System.out.println(dialog.message()); //Capturing message popup print on console.
		});
		
		}

}
