
Feature: Error Handling Functionality
  Scenario: Successful Verification of Error Handling Functionality
    Given the User navigates to the Home Page
    When the User clicks on the Search icon
    And the Web page allows the user to input invalid characters
    Then the system displays the appropriate error message
