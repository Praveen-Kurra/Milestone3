@Smoke
Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is invoking the browser
	And enters the website url
	When User enters the "standard_user" and "secret_sauce"
	And User clicks on submit button
	Then products or cart icon is displayed there
	And Quitting the browser
	
	
	

	