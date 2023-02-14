package com.webpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.WebBase;

public class SignInPage extends WebBase {

	//Locaters should be top of the page 
	//Locaters should be private 
	//need to store element use 'BY' data type 
	
	private By signInLink=By.partialLinkText("Sign in");
	
	private By SignInLable=By.xpath("//*[@class='ac-title']"); 
	
	private By mobileNumberTextbox = By.cssSelector("#loginfirst_mobileno");
	
	private By sendButton=By.xpath("//*[@class='btn-signpass arrowbtn']");
	
	private By varificationMessage= By.xpath("//*[@class='error-msg ng-star-inserted']");
	
	
	public void clickOnSignInLink() {
		
		try {
			
			driver.findElement(signInLink).click();
			
		} catch (Exception e) {
			
			Assert.fail("failed to click on signin link");
			
		}
		
	}
	
	public void veriFiveSignInPage() {
		
		Assert.assertEquals(driver.findElement(SignInLable).getText(),"Sign in"); //Lable verification 
	//	Assert.assertTrue(driver.findElement(SignInLable).isDisplayed());
		
	}
	
	public void enterMobileNumber (String mobileNumber) {
	
		try {
						
			WebElement element =driver.findElement(mobileNumberTextbox);
			element.click();
			element.sendKeys(mobileNumber);
			
		} catch (Exception e) {
			
			Assert.fail("fail to enter text in mobile number text box");
		
		}
		
	}
	
	public void clickOnSendButton() {
		
		try {
			
			WebElement element=driver.findElement(sendButton);
			element.click();
			
		} catch (Exception e) {
			
			Assert.fail("failed to click on send button");
		}
		
	}
	
	public void verifiedValidationMessage() {
		
		Assert.assertTrue(driver.findElement(varificationMessage).isDisplayed());
		
	}
	
}
//hw page verified 

