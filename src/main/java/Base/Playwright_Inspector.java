package Base;

import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.util.regex.Pattern;


public class Playwright_Inspector {
	
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();

      page.navigate("https://testautomationpractice.blogspot.com/");
      
      assertThat(page).hasTitle(Pattern.compile("Automation Testing Practice"));

  
    }
  }
}