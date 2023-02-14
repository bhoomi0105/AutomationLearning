package com.testng.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.WebBase;
import com.webpages.SignInPage;

public class tc01_login {
	
	SignInPage signInPage= new SignInPage();
	WebBase webBase = new WebBase();
	
	String browserName = "chrome";
	String url = "https://www.jiomart.com/";
	String mobileNumber="ajslk";
	
	@BeforeMethod
	public void setup() {
		webBase.openBrowser(browserName);
		webBase.openWebsite(url);
	}
	
	@Test(description = "verified login page ", priority = 1)
	public void verifiedLoginPage() {
		signInPage.clickOnSignInLink();
		signInPage.veriFiveSignInPage();
		
	}
	
	@Test(description = "verified mobile number",priority = 2)
	public void verifiedMobileNumber() {
		signInPage.enterMobileNumber(mobileNumber);
		signInPage.clickOnSendButton();
		signInPage.verifiedValidationMessage();
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		webBase.closeBrowse();
	}
}
// always use explicit wait