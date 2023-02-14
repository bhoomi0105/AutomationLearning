Feature: signin 

	
		@smoke01	
		Scenario: verified sign in page 
		Given I opened "chrome" Browser and enter "https://www.jiomart.com/" URL
		When I clicked on Signin link
		Then verified that signin page is open 
 
		
		@regression 
		Scenario: verified validation message while user enter incorrect mobil number 
		Given I opened "chrome" Browser and enter "https://www.jiomart.com/" URL
		When I clicked on Signin link
		Then verified that signin page is open 
		When I eneter "abc" in mobile number textbox
		Then I click on send button 
		Then Verified that validation message is displayed 
		
		
		#hw- create new featcher file - search suggestion page verified :".submit"