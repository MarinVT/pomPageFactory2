@functional3
Feature: Contact us page fields

  Scenario: User can fill in all fields of contact us form
    Given User opens this address "https://ecometal.bg/" to open contact us page
    And User clicks on Contact us link in the white section  located in front of the phone number
    And User enters name "Амдор Ривас" in name input field
    And User enters the following email "amador@abv.bg" in email input field
    And User enters town "София" in town input field
    And User enter the following phone number in phone input field "01234567890"
    And User enter the following text in message container "Ако запитването Ви е от по-конкретен характер, можете да се свържете директно с нашия Централен офис на посочените по-долу координати или с някоя от базите ни в страната."
    And User is sees submit button listed