@footerAdds @footer
Feature: Adds page

  Scenario: User opens the Adds page to validate the data in it
    Given User opens the following url "https://hotnews.bg/" to open Adds page
    When User clicks Adds link in the footer
    Then User sees the following title of the page "ADVERTISEMENT & PRICES"