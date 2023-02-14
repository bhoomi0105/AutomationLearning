Feature: Cart

		@smoke01	
		Scenario: verified empty cartpage
		Given I opened "chrome" Browser and enter "https://www.jiomart.com/" URL
		When I clicked on cart icon
		Then I verified "Your Cart is empty!" message should be display
		