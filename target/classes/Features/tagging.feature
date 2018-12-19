Feature: Free CRM application testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a deal test case

@RegressionTest
Scenario: Create a tasks
Given This is a tasks test case

@SmokeTest
Scenario: Search a task
Given This is a Search task test case

@RegressionTest
Scenario: Search a deal
Given This is a Search deal test case

@SmokeTest @RegressionTest
Scenario: Search a email
Given This is a Search email test case

@SmokeTest @End2End
Scenario: validate a report
Given This is a report test case
