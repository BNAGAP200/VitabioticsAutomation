Feature: Verify add product
  Background: Given The User landed on the home page
  Scenario: Verifying Add product through search bar Functionality

    And The user click on the search icon
    And Web page allow the user to type search bar
    And The Web page allows the users to click on desired product
    When The user clicks on the Add to Cart button
    Then A side window will appear on the right side
