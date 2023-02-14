package com.webpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.WebBase;

public class SearchSuggestion extends WebBase {

	private By searchBox = By.cssSelector("#autocomplete-0-input");

	public void findSearchBox() {

		try {
			
			driver.findElement(searchBox);

		} catch (Exception e) {

			Assert.fail("fail to find  search box ");

		}

	}

	public void enterValueInSearchBox(String searchText) {

		try {
			WebElement elemnt = driver.findElement(searchBox);
			elemnt.click();
			elemnt.clear();
			elemnt.sendKeys(searchText);
			elemnt.submit();

		} catch (Exception e) {

			Assert.fail("fail to enter value ");

		}

	}
	
	public void verifiedSearchResultPage() {

		try {
			
			driver.getTitle();

		} catch (Exception e) {

			Assert.assertEquals("Search Results",driver.getTitle());
		}

	}
	

}
