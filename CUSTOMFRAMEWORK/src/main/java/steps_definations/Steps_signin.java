package steps_definations;

import com.webpages.SignInPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_signin {
	
	SignInPage signInPage = new SignInPage();

	

	@When("I clicked on Signin link")
	public void i_clicked_on_signin_link() {

		signInPage.clickOnSignInLink();

	}

	@Then("verified that signin page is open")
	public void verified_that_signin_page_is_open() {
		signInPage.veriFiveSignInPage();
	}

	@When("I eneter {string} in mobile number textbox")
	public void i_eneter_in_mobile_number_textbox(String mobileNumber) {

		signInPage.enterMobileNumber(mobileNumber);
	}
	
	@Then("I click on send button")
	public void i_click_on_send_button() {
		signInPage.clickOnSendButton();
	    
	}


	@Then("Verified that validation message is displayed")
	public void verified_that_validation_message_is_displayed() {
		signInPage.verifiedValidationMessage();
	}

	
	
}

//jitni website pages = feature file 
// numbers of feature files = steps files 
// numbers of steps file = web page file 
//page object model rule 