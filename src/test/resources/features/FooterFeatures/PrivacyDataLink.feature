@footerPrivacyPage @footer
Feature: Privacy page

  Scenario: User opens the Adds page to validate the data in it
    Given User opens the following url "https://hotnews.bg/" to open Privacy page
    And User clicks privacy link in the footer
    And User sees the following title of the page Personal data "ЛИЧНИ ДАННИ"
    And User sees tab on the page Privacy Policy "Политика за поверителност"
    And User sees tab on the page Cookie policy "Политика за бисквитки"
    And User sees tab on the page Rights under GDPR "Права по GDPR"

