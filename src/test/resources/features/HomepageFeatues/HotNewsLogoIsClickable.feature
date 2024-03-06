@UI5
Feature: Logo of hotNews is clickable on the homepage

  Scenario: User clicks on the logo of hotNews and it's redirected to the homepage
    Given User opens the following url "https://hotnews.bg/" to click on the logo fo hotNews
    And User clicks in the logo of hotNews on the homepage
    Then User sees refreshed page