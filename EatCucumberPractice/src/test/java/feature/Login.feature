Feature: Login Action
@Login
Scenario: Successful Login with Valid Credentials
	Given User is invoking the browser
	And enters the website url
	When User enters the "standard_user" and "secret_sauce"
	And User clicks on submit button
	Then products or cart icon is displayed there
	And Quitting the browser

	

@Smoke
Scenario: clicking on products after sucessful Login
  Given User is invoking the browser
	And enters the website url
	When User enters the "standard_user" and "secret_sauce"
	And User clicks on submit button
	Then user clicks on products
	And user navigates to products specification page
	And Quitting the browser