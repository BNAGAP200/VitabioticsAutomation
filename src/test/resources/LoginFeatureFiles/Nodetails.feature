Feature: Login Functionality
  Scenario: Verify Login Functionality With No details
    Given  User On the Home Page
    And  User Click on the RegButton
    And User click on the Login Button
    When  User Enter No username and No Password
    Then  User click on the Signin Button