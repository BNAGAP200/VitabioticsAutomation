Feature: Login Functionality

  Scenario: Successful Login with Valid Credentials
    Given I am on the login page
    When I enter valid username and password
    And I click the sign-in button
    Then I should be logged in
