@ethicalTerms @footer
Feature: Ethical rules page

  Scenario: User opens the Ethical page and gets the Title page
    Given User opens the following url "https://hotnews.bg/" to open Ethical rules page
    And User clicks Ethical Rules link in the footer
    Then User is navigated to Ethical rules page
    And User sees the following title of section in grey background "ЕТИЧНИ ПРАВИЛА НА НСС"