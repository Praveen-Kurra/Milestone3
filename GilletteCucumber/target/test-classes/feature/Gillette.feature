Feature: i want test Gillette website

  Background: 
    Given i am on Gillete website

  Scenario: Test the Search Functionality
    When i click on search icon
    And enter the text "Gillette"
    Then it should displays all the relevent results

  Scenario: Check products
    When i click on products
    Then it should display products
