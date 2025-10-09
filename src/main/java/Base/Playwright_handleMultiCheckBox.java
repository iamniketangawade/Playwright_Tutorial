package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_handleMultiCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/?");
		
		//Check multiple checkboxes::
		Locator checkbox =page.locator("//div[@class='form-group']//input[@type='checkbox']");
		System.out.println("How many check box are in Days ::" +checkbox.count());
		
		for(int i=0;i<checkbox.count();i++) {
			checkbox.nth(i).click();   //Click all checkbox one by one (looping)
			System.out.println(checkbox.nth(i).innerText());
		}

		
	}

}
