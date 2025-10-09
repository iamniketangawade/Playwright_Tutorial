package Base;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class Playwright_handlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Playwright playwright =Playwright.create();
	Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page =browser.newPage();
	
	page.navigate("https://www.wikipedia.org/");
	//drop down ::
	
	//select by value ::
	page.selectOption("select", "az");
	
	//select by Text ::
	page.selectOption("select", new SelectOption().setLabel("Беларуская"));
	
	//Select by Index ::
	page.selectOption("select", new SelectOption().setIndex(3));
	
	//Select by Size of drop-down ::
		Locator  values = page.locator("select > option");
		System.out.println(values.count());
		
		//How to print all values
		for(int i=0;i<values.count();i++) {
			System.out.println(values.nth(i).innerText());;
		}
		
//Another simple way ::		
		//Return list of webelement handle
				List<ElementHandle> dropdownlist =page.querySelectorAll("select > option");
				System.out.println(dropdownlist.size());
				
				for(ElementHandle i:dropdownlist) {
					System.out.println(i.innerText());
				}

	}

}
