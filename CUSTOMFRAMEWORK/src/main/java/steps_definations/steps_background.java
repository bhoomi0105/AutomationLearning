package steps_definations;

import com.framework.WebBase;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;

public class steps_background {
	
	WebBase webBase = new WebBase();

	@Given("I opened {string} Browser and enter {string} URL")
	public void i_opened_browser_and_enter_url(String browser, String url) {

		webBase.openBrowser(browser);
		webBase.openWebsite(url);

	}
	
	@After
	public void closeBrowser() {
		
		webBase.closeBrowse();
		
	}
}
