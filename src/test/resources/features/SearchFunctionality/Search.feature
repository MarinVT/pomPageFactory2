@functional @search
Feature: Search functionality

  Scenario: User should be able to search for an article
    Given User has open the official web page "https://www.hotnews.bg"
    And User clicks on search icon
    And User enters the following search patter "Мария: Не нося сутиен от години"
    And User clicks on search icon to see the result
    Then User sees a list with articles containing the title "Мария: Не нося сутиен от години"