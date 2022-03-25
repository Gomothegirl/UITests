Feature: Todos Page Tests

  @RegressionTest
  Scenario: Cross Item Off The LIst
    Given I am on the home page
    When I click on what needs to be done
    And Add an Item to the list
    Then Cross Item Off


