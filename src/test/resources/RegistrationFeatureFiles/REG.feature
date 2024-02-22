Feature: Registration Feature

  Scenario: User registration with valid data
    Given User navigates to registration page
    When User enters valid registration details
    Then User should be successfully registered
  Scenario: User registration with synthetic data from Excel
    Given User navigates to Registration page
    When User enters synthetic registration details from Excel "C:\Users\balaj\Downloads\AutomationWorkbook" at "Sheetx"
    Then User should get successfully registered
