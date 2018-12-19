Feature: Free CRM contacts page test

Scenario Outline: Free CRM create a new contacts
Given user already on login page
When user enter "<username>" and "<password>"
Then click on login button
Then mouse hover on contacts link
Then click on new contact link
Then Enter "<firstname>" and "<lastname>"
Then user click on save button
Then close the browser

Examples:
|username| password | firstname | lastname |
|bharath526|marchipoya|Tom 		 | Peter    |
|bharath526|marchipoya|David     | Hollow   |
