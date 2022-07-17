Feature: I want to sauce application featues

Background:
 Given navigating to the website
 
  Scenario Outline: login senario
    Given i am an user to go that website
    When i enter valid <username> and <password>
    Then it should navigate to homepage
Examples:
|username|password|
|standard_user|secret_sauce|
