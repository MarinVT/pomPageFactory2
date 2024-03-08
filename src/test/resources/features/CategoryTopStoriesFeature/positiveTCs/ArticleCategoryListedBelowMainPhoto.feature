@topStory1 @UI2
Feature: Top Stories category title
  Preconditions:
  1. Category is activated from the CMS
  2. Category lead news list is activated with added articles in it

  Scenario: User gets the title of the category listed below the main photo in main list
    Given User opens "https://hotnews.bg/top-stories" to verify that the category title is listed
    And User sees the category title "Top stories" underlined is successfully listed below the main photo