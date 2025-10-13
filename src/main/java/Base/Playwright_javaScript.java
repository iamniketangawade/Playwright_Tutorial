package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_javaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/");
		
		System.out.println(page.evaluate("document.location.href"));  //Return websit url
		
		page.evaluate("() => {"
				+ "const textarea = document.createElement('textarea');"
				+ "document.body.append(textarea);"
				+ "textarea.focus();"
				+"}");
		
		String text = "Hello World !!";
		page.keyboard().type(text);
	}

}
