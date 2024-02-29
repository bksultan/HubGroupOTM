Feature: End-to-End Workflow for PICKLOAD-ODR Order Processing

  I want to ensure that orders can be processed using "PICKLOAD-DROPLOAD-ODR" orders
  So that the orders are efficiently managed and tracked within the OTM system

  Background:
    Given I am logged in to the Order Tracking Management system

  @1-4
  Scenario: PICKLOAD-ODR E2E flow
    When I am on the "Order Release" search page
    And I enter the order type "PICKLOAD/DROPLOAD/ODR" into the search field
    And I click on the Search button