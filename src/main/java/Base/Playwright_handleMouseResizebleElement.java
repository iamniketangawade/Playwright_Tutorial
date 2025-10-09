package Base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;

public class Playwright_handleMouseResizebleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright =Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		
		page.navigate("https://the-internet.herokuapp.com/horizontal_slider");
		
		//locating silder
		Locator slider =page.locator("//input[@value=\"0\"]");
		
		//Get slider positon
		BoundingBox sliderBox =slider.boundingBox();
		
		//calculate start postion(x and y)
		double x= sliderBox.x +sliderBox.width/2;
		double y= sliderBox.y+ sliderBox.height/2;
		
		//Move mouse to slider adn drag slightly 
		page.mouse().move(x, y);   
		page.mouse().down(); //Press and hold (mouse.down())
		
		page.mouse().move(x + 7, y);  //move 50 pixel
		page.mouse().up();     //release mouse button
		
		
	}

}
