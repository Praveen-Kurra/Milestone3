Feature: to test

  @tag1
  Scenario: to take coverage
    Given i am an user
    When enter username
    Then it should display homePage

  @tag2
  Scenario Outline: to testing integrate
    Given entering pass <myname> here
    When declare somthing <last> name
    Then show output <user> enters
    

    Examples: 
      | myname  | last  | user | where |
      | praveen | Kurra | Mind | Tuni  |
