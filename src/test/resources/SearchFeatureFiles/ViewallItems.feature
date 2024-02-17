
@Search
Feature: ViewAll Items Functionality

  Background:
    Given the user navigates to the Home page
    And the User clicks on the search icon

  Scenario: Successful Verification of Viewall Items Functionality
    When the Web page allows the user to type desired product
    Then the system should display the related results
