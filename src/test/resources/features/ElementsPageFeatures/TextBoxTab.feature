@functional
Feature: Text box feature

  Scenario: User submits Text Box form
    Given User opens the following url "https://demoqa.com" to open Text Box feature
    And User clicks on Elements main section on the homepage
#    And User clicks on Elements tab to expand the menu
    And User clicks on Text Box tab
    And User enters full name "Johnny Bravo", email "johnnybravo@abv.bg", current address "Mars 123", pernament address "Sofia 123"
    And User clicks on submit button
    Then User sees form added below with fullName "Name:Johnny Bravo"