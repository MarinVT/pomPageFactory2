@sudbi
Feature: Sudbi main list with articles
  Main list is activated from the CMS

  Scenario: User is able to verify that the main list is listed on the page with articles
    Given User opens url "https://hotnews.bg/sudbi" to verify that the main list is listed in Sudbi
    Then User is successfully navigated to Sudbi page and the main list is listed