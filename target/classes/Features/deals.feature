Feature: Free CRM deals page test

Scenario: Free CRM create a new deal

Given user already on login page
When user enter username and password
|bharath526| marchipoya|
Then click on login button
Then mouse hover on deals link
Then click on new deal link
Then Enter deal details
|test deal|1000|50|10|
#Then user click on save button
