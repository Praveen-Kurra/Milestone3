
@tag
Feature: Title of your feature


  @tag1
  Scenario: I want to test login scenario
    Given I am an user and opens the browser
    And enters the "https://www.saucedemo.com/"
    When I enter the "standard_user" and "secret_sauce" then
    And click on enters
    Then it should navigating to Homepage
    And  close the browser

    @tag2
    Scenario: I want to click products
    Given I am an user and opens the browser
    And enters the "https://www.saucedemo.com/"
    When I enter the "standard_user" and "secret_sauce" 
    And click on enters
    Then it should navigating to Homepage
    And  click on products and navigates to product discription
    And close the browser
    And get the extent report
    
    @tag3
    Scenario Outline: login validation with differnt sets of data
    Given I am an user and opens the browser
    And enters the "https://www.saucedemo.com/"
    When I enter <username> and <password>
    And click on enters
    Then it should navigating to Homepage
    And  close the browser
    
    Examples:
|username     |password    |
|standard_user|secret_sauce|
|standard_user|wrongpass   |
|wronguser    |secret_sauce|
|wronguser    |wrongpass   |
