package steps_definations;

import com.framework.WebBase;
import com.webpages.SearchSuggestion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_SearchSugestions {
	
	WebBase webBase = new WebBase();
	SearchSuggestion searchSuggetio = new SearchSuggestion();

	@When("I clicked on Searchbox")
	public void i_clicked_on_searchbox() {
		searchSuggetio.findSearchBox();

	}

	@Then("I Enter {string} in search box and enter")
	public void i_enter_in_search_box_and_enter(String searchText) {
		searchSuggetio.enterValueInSearchBox(searchText);
	}

	@Then("I verified the result page")
	public void i_verified_the_result_page() {
		searchSuggetio.verifiedSearchResultPage();
	}
	
	

}
