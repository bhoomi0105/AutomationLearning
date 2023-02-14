package steps_definations;

import com.webpages.CartPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Cart {
	
	CartPage cartPage= new CartPage();
	
	@When("I clicked on cart icon")
	public void i_clicked_on_cart_icon() {
	   
		cartPage.clickedOnSearchIcon();
		
	}

	@Then("I verified {string} message should be display")
	public void i_verified_message_should_be_display(String string) throws InterruptedException {
	   
		cartPage.verifiedEmptyCartMEssage(string);
		
	}
}
