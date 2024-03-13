
Feature: Login Functionality

  Background: Given I am on the Login page
    And  User Click on the RegButton

  Scenario: Successful Login with Valid Credentials

    When I enter valid username and password
    And I click the sign-in button
    Then I should be logged in
