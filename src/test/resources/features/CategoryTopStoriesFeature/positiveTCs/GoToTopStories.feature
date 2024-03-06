@tag1
Feature: Top Stories category
  Category is activated from the CMS

  Scenario: User is able to open category Top Stories
    Given User opens the following url "https://hotnews.bg/" to open Top Stories category
    And User clicks on hamburger menu
    And User clicks on Top Stories link
    Then User is navigated to Top Stories page
