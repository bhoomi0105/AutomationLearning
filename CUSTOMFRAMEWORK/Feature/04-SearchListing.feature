Feature: Productdetail page 

@smoke	
		Scenario: verified productdetail page 
		Given I opened "chrome" Browser and enter "https://www.jiomart.com/" URL
		When I clicked on Searchbox
		Then I Enter "Shampoo" in search box and enter
		Then I verified the result page 
		When I click on "Tresemme Hair Fall Defense Keratin Protein Shampoo 340 ml"
		Then I verified that product detail page is open
		When I clicked on add to cart button
		Then I clicked on cart icone
		Then I verified cart page 		
