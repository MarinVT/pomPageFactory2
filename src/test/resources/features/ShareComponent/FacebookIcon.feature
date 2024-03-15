@shareComponent
Feature: Share component facebook icon in list

  Scenario: User shares article via share component using facebook
    Given User opens url "https://hotnews.bg/" to share article in facebook
    And User hovers over share component in list and clicks on facebook icon
    Then User is navigated to facebook and sees Create post window "hotnews.bg"