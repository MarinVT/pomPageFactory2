@functional1
Feature: About us page

  Background:

  Scenario: Verify that the user can open about us page
    Given User is on the homepage1 "https://ecometal.bg/"
    And User clicks on link About us
    And User sees the title "Ecometal Engineering Ltd."