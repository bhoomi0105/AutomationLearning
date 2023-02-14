package com.webpages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.framework.WebBase;

public class CartPage extends WebBase {

	private By cartIcon= By.cssSelector(".cart_text");
	private By emptyText= By.xpath("//*[@class='cart-empty']//h3");
	
	public void clickedOnSearchIcon() {
		
		try {
			
			driver.findElement(cartIcon).click();
			
		} catch (Exception e) {
			
			Assert.fail("cart icone can't found");
			
		}
		
	}
	
	public void verifiedEmptyCartMEssage(String emptycartmesage) throws InterruptedException {
		
		Thread.sleep(6000);
		Assert.assertEquals(driver.findElement(emptyText).getText(),emptycartmesage);
		
	}
	
}
