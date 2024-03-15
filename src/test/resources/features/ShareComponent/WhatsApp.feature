@testForFuture
Feature: Share component WhatsUp icon in list

  Scenario: User shares article via WhatsUp
    Given User opens url "https://hotnews.bg/" to share article in WhatsUp
    And User hovers over share component and sees the WhatsApp is listed
