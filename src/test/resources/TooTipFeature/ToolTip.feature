Feature: Tooltip verify
  Scenario: Verify the tool tip functionality

    Given User on the Home page
    When User hover the mouse into element
    And List of product should show
    And User hover the mouse to Women Section will show the list of products
    And User hover the mouse to men Section will show the list of products
    And User hover the mouse to kids Section will show the list of products
    Then User hover the mouse to older people Section will show the list of products

