Feature: Free CRM deals page test 

Scenario: Free CRM create a new deal 

	Given user already on login page 
	When user enter username and password 
		| username | password  |
		|bharath526| marchipoya|
	Then click on login button 
	Then mouse hover on deals link 
	Then click on new deal link 
	Then Enter deal details 
		|title|amount|probability|commission|
		|test deal1|1000|50|10|
		|test deal2|2000|60|20|
		|test deal3|3000|70|30|
		|test deal4|4000|80|40|
	Then user close the browser 
