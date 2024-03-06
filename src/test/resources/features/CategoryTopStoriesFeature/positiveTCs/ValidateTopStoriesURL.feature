@urlTest
Feature: Top Stories category url
  Category is activated from the CMS

  Scenario: User is able to open category Top Stories via url that opens current page
    Given User opens the following url "https://hotnews.bg/top-stories" to validate the correct URL
    Then User is successfully navigated to Top Stories page to this address "https://hotnews.bg/top-stories"