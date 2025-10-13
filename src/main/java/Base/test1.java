package Base;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;
import com.microsoft.playwright.options.SelectOption;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser  browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(java.util.Arrays.asList("--start-maximized")));
        BrowserContext browsercontext =browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page page =browsercontext.newPage();
		page.navigate("https://the-internet.herokuapp.com/horizontal_slider");
			
		
		Locator sliderPoint= page.locator("//input[@value=\"0\"]");
		
		BoundingBox sliderbox =sliderPoint.boundingBox();
		
		double x=sliderbox.x+sliderbox.width/2;
		double y=sliderbox.y+sliderbox.height/2;
		
		page.mouse().move(x, y);
		page.mouse().down();
		page.mouse().move(x +100, y);
		page.mouse().up();
		

		}
}
