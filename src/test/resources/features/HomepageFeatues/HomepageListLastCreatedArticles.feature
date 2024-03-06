@sanity2
Feature: Homepage main list with last created articles
  Precondition: List is activated

  Scenario: User gets main list with last created articles
    Given User opens the following url "https://hotnews.bg/" to see the list with last created articles
    And User sees main list with last created articles