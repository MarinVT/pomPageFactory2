@sudbi
Feature: Sudbi category
  Category Sudbi is activated from the CMS

  Scenario: User is able to open category Sudbi
    Given User opens url "https://hotnews.bg/" to open Sudbi category
    And User clicks on hamburger menu to open Sudbi category
    And User selects Sudbi from dropdown
    Then User is navigated to Sudbi page and sees title Sudbi "СЪДБИ"