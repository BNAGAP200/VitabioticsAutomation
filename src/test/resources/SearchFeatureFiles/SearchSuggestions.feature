
Feature: Search Suggestion feature

  Scenario Outline: successful verification on search suggestion feature
    Given The user navigates to the Home page
    When The user clicks on the Search icon
    And The web page allows the users to type "<product>"
    Then the system displays the suggested products based on the search query
    Examples:
      | product     |
      | Vitamins    |
      | Pregnancy   |
      | Supplements |
      | Skin Care   |
      | Dental care |