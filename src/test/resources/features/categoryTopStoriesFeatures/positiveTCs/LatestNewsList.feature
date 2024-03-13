@topStory @UI
Feature: Top Stories latest articles list
  Latest articles list is activated

  Scenario: User is able to pick up an article from latest list with articles located under the lead news list
    Given User opens url "https://hotnews.bg/top-stories" to verify that the list with latest articles is presented
    Then User is successfully navigated to Top Stories page and latest articles list is successfully listed