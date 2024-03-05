@sanity
Feature: Homepage main section with 5 articles is listed
  Main list is activated from the CMS

  Scenario: User gets main list with 5 articles
    Given User opens the following url "https://hotnews.bg/" to see the main list with five articles
    And User sees main list with five articles