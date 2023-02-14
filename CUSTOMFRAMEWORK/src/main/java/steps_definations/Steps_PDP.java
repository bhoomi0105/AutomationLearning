package steps_definations;

import com.webpages.PDP;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_PDP {

	PDP pdp = new PDP();

	@When("I click on {string}")
	public void i_click_on(String string) {
		pdp.clickOnProduct(string);
	}

	@Then("I verified that product detail page is open")
	public void i_verified_that_product_detail_page_is_open() throws InterruptedException {
		pdp.verifiedDetailPage();

	}

	@When("I clicked on add to cart button")
	public void i_clicked_on_add_to_cart_button() {
		pdp.clickOnAddToCartButton();
	}

	@Then("I clicked on cart icone")
	public void i_clicked_on_cart_icone() {
		pdp.clickOnCartIcone();
	}

	@Then("I verified cart page")
	public void i_verified_cart_page() {
		pdp.verifiedCartpage();
		
	}
}
