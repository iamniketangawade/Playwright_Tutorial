package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_handlinglocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		
		page.navigate("https://testautomationpractice.blogspot.com/?");
		
		//Handling locators 
		//page.locator("#name").type("Niketan");       //Using id locator 
		//page.type("#name", "Niketan");                //Using id locator  ::type() method
		
		//page.type("#name", "Niketan", new TypeOptions().setDelay(100)); //type slowly as per delay(means Playwright will type one character every 100 ms)
		//page.type("[id=\"name\"]", "Niketan");  //css Selctor
		
		//page.type("//input[@id=\"Wikipedia1_wikipedia-search-input\"]", "Selenium");
		page.click("//input[@type=\"submit\"]");
		System.out.println(page.locator("//a[normalize-space()=\"Selenium\"]").innerText());
	    System.out.println(page.locator("//a[normalize-space()=\"Selenium in biology\"]").innerText());

		
		
	}

}
