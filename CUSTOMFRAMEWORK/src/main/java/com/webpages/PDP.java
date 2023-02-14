package com.webpages;

import java.time.Duration;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.WebBase;

public class PDP extends WebBase {



	private By lstProduct = By.cssSelector(".category_name.prod-name");
	private By productTitle = By.xpath("//*[@id=\"center_col\"]/div/h1");
	private By addToCartButton = By.xpath("//*[@class='product-add-form']//div");
	private By cartIcon = By.cssSelector("#minicart_btn");
	private By cartPagetitle = By.xpath("//*[@class='row']/span");

	
	public void clickOnProduct(String productName) {

		try {

			waitForPageloader(10);
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<WebElement> productCatagory = driver.findElements(lstProduct);
			for (WebElement webElement : productCatagory) {
				String getProductTitle = webElement.getAttribute("title");
				if (getProductTitle.equals(productName)) {
					webElement.click();
					// System.out.println(productName +" " + getProductTitle +"...");
					break;

				} else {

					System.out.println(productName + " not matched with " + getProductTitle + "...So, check it again");

				}
			}

		} catch (Exception e) {
			Assert.fail("unable to click on product " + productName);
		}

	}

	public void verifiedDetailPage() throws InterruptedException {
		Thread.sleep(6000);
		Assert.assertTrue(driver.findElement(productTitle).isDisplayed());

	}

	public void clickOnAddToCartButton() {

		try {
			waitForPageloader(20);
			driver.findElement(addToCartButton).click();

		} catch (Exception e) {

			Assert.fail("unable to click on add to cart button ");
		}

	}

	public void clickOnCartIcone() {
		try {
		waitForPageloader(20);
			driver.findElement(cartIcon).click();

		} catch (Exception e) {
			Assert.fail("unable to click on cartIcone");
		}

	}

	public void verifiedCartpage() {

		try {
			waitForPageloader(20);
			driver.findElement(cartPagetitle).getText();
		} catch (Exception e) {
			Assert.fail("not able to find cart page ");
		}

	}
}


//hw amazon or any other website need to use in custom frame work 