Feature: Free CRM login feature
Scenario: Free CRM login page scenario
Given user is already on login page
When verify title of the login page
Then enter username and password
Then user clicks on login button


Scenario: Free CRM contacts page test
Given user already on login page
When user enter username and password
Then click on login button
Then mouse hover on contacts link
Then click on new contact link
Then Enter firstname and lastname
Then user click on save button