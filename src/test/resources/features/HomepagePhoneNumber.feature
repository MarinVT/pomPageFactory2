@UI2
Feature: Homepage company Phone number

  Scenario: Validate homepage phone number is listed in the right corner of the page
    Given User opens the following url to see the phone number "https://ecometal.bg/"
    And User sees the phonen number of the company listed successfully "0885 771 777"