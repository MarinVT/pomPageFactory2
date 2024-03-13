@footerTerms @footer
Feature: Terms page

  Scenario: User opens the Terms page and gets the Title Common Terms to use web sites of sportal
    Given User opens the following url "https://hotnews.bg/" to open Terms page
    And User clicks Terms in the footer
    Then User is navigated to Terms page
    And User sees the following title of section "ОБЩИ УСЛОВИЯ ЗА ИЗПОЛЗВАНЕ НА САЙТОВЕТЕ НА СПОРТАЛ.БГ АД"