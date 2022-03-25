Feature: Todos Page Tests

  @RegressionTest
  Scenario: Delete Item
    Given I am on the home page
    When I click on what needs to be done
    And Add an Item to the list
    And Cross Item Off
    Then Delete Item