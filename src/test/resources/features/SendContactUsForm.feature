@functional3

  Feature: Send contact us form

    Scenario: User can send a contact us form
      Given User opens this address "https://ecometal.bg/"
      And User clicks on CONTACTS link
      Then User sees contact us form
      And User enter the following text "Амадор" to input field NAME
      And User enter the following text "amador@abv.bg" to input field EMAIL
      And User enter the following text "Sofia" to input field TOWN
      And User enter the following phone number "0123456789" to input field Phone
      And User enter the following text "Карам БМВ и съм играч!!!!" to input field MESSAGE
