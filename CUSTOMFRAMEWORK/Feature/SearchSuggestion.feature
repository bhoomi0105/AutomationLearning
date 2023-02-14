Feature: SearchSuggestion 

@smoke01	
		#Scenario: verified SearchBox page 
		Scenario Outline: verified that Search suggestion page is open for multiple search values  
		Given I opened "chrome" Browser and enter "https://www.jiomart.com/" URL
		When I clicked on Searchbox
		Then I Enter "<Search>" in search box and enter
		Then I verified the result page 
	
		
		Examples:	
				| Search |            #lable represent
				| shampoo |           #value represent
				| Mobile |
		
		