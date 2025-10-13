package Base;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class Playwright_traceViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext =browser.newContext();
		
		//TraceViewer  :: Tracing -start
		browsercontext.tracing().start(new Tracing.StartOptions()
				.setScreenshots(true)
				.setSnapshots(true)
				.setSources(false)
				);
		
		
		Page page =browsercontext.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/");
		
		page.locator("//input[@id=\"name\"]").fill("Niketan");
		page.locator("//input[@id=\"email\"]").fill("Niketan@email.com");
		page.locator("//input[@id=\"phone\"]").fill("844672060");

		//Tracing -stop
		browsercontext.tracing().stop(new Tracing.StopOptions()
				.setPath(Paths.get("trace.zip"))
				);
			
		
	//close
		page.close();
		browsercontext.close();
		playwright.close();
		
	}

}
