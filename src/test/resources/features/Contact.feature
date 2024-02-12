@functional2
Feature: Contact us page

  Scenario: Verify that the user can open contact us page
    Given User is on the homepage2 "https://ecometal.bg/"
    And User clicks on link Contact us
    And User sees the section "Връзка с Нас"