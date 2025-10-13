package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page =browser.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/");
		
		//Row count ::
		Locator rows =page.locator("//table[@name=\"BookTable\"]//tr");
		int totalRows =rows.count();
		System.out.println("total column : "+ totalRows);
		
		//Col count ::
		Locator column =page.locator("//table[@name=\"BookTable\"]//tr[1]/th");
		int totalColumn =column.count();
		System.out.println("total row : "+ totalColumn);
		
		//print all table value on console
		//Note ::Header contain th not td values so,everytime check table element in DOM  start index with 1.
		for(int i=1;i<totalRows;i++) {
			Locator colLocator=rows.nth(i).locator("td");
			
			for(int j=0;j<totalColumn;j++) {
				String celltext =colLocator.nth(j).innerText();
				
			System.out.print(celltext + "\t");
			}
			System.out.println();
			
		}
		
		//get specific cell data/value ::
		String getSpecificCel=page.locator("//table[@name=\"BookTable\"]//tr[1]/th[1]").innerText();
		System.out.println("cell value :" +getSpecificCel);
		
		
		
	}

}
