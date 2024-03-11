@footer
Feature: Contacts page

  Scenario: User opens the contacts page and takes the email listed in it
    Given User opens the following url "https://hotnews.bg/" to open Contacts page
    And User clicks contacts in the footer
    Then User is navigated to Contacts page
    And User sees the following email for contacts "e-mail: office@hotnews.bg"