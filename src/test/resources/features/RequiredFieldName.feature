@functional5
Feature: Contact us page required field NAME

  Scenario: User sees warning text for empty required field NAME
    Given User opens this address "https://ecometal.bg/" to reach the contact us page
    And User clicks on Contact us white section  located in front of the phone number
    And User does not enter name in name input field
    And User enters the following email "amador@abv.bg" in next field email
    And User enters town "София" in town input field2
    Then User sees in red text with the following "Това поле е задължително." under Name input field
