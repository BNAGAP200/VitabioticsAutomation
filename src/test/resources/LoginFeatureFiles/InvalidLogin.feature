Feature: Invalid Login Functionality
  @sanity
  Scenario: Successful InvalidLogin with Incorrect details
    Given I am on the Login page
    And I enter reg button
    When  I enter Invalid username and Invalid Password
    Then I click sign-in button

