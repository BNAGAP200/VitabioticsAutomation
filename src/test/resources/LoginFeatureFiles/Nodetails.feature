Feature: Login Functionality

  Background: Given I am on the Login page
    And  User Click on the RegButton

  Scenario: Verify Login Functionality With No details



    When  User Enter No username and No Password
    Then  User click on the Signin Button