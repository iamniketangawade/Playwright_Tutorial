package Base;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_fileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Playwright playwright =Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page =browser.newPage();
		/*
		//single file upload 
		page.navigate("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		page.locator("input[type=\"file\"]").setInputFiles(Paths.get("C:\\Users\\Niketan Gawade\\Documents\\AutomationTesting\\selenium\\test1.txt"));
	*/
		
		//Multiple file upload ::
		page.navigate("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		page.locator("//input[@id=\"filesToUpload\"]").setInputFiles(
				new Path[] {
				Paths.get("C:\\Users\\Niketan Gawade\\Documents\\AutomationTesting\\selenium\\test1.txt"),
				Paths.get("C:\\Users\\Niketan Gawade\\Documents\\AutomationTesting\\selenium\\test2.txt")			
				});
	
	}

}
