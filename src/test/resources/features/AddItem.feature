Feature: Todos Page Tests

  @RegressionTest
  Scenario: Add An Item on the list
    Given I am on the home page
    When I click on what needs to be done
    And Add an Item to the list
    Then Item is visible



