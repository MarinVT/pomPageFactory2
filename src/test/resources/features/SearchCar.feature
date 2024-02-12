@functional
Feature: Search functionality

  Scenario: Verify that the user can search for a specific article
    Given User is on the homepage "https://ecometal.bg/"
    And User select region "51" Sofia Town from dropdown
    And User selects BMW "86" from dropdown BRAND
    And User selects model X3 "953" from dropdown MODEL
    And User selects modification "3 Series Convertible (E46) 323Ci (170 кс) (2000 г.)" from dropdown
    And User clicks on yellow submit button
    Then User is navigated to search page with listed result for "BMW"