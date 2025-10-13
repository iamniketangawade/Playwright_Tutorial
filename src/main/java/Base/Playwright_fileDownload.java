package Base;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_fileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Playwright playwright =Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page =browser.newPage();
        page.navigate("https://demo.automationtesting.in/FileDownload.html");
        
        Download file =page.waitForDownload(() ->{
        	page.locator("//a[@type=\"button\"]").click();
        });
        
        file.saveAs(Paths.get("C:\\Users\\Niketan Gawade\\Documents\\AutomationTesting\\selenium\\sample.pdf"));
        
        

		
		
		
	}

}
