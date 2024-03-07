@topStory @UI
Feature: Top Stories main list
  Main list is activated from the CMS

  Scenario: User is able to validate that the first article is listed
    Given User opens url "https://hotnews.bg/top-stories" to verify that the first article is listed
    Then User is successfully navigated to Top Stories page and first article is successfully listed