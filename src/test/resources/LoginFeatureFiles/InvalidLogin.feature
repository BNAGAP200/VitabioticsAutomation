Feature: Invalid Login Functionality


  Background:
    Given I am on the Login page
    And I enter reg button

  Scenario: Successful InvalidLogin with Incorrect details

    When  I enter Invalid username and Invalid Password
    Then I click sign-in button

