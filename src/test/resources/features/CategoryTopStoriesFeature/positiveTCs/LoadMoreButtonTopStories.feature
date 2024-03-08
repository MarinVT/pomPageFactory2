@topStory1 @UI2
Feature: On Top Stories page "Load More" button is listed
  Preconditions:
  1. Category has more than 15 articles created to generate Load More button

  Scenario: User is able to see "Load More" button listed on the page
    Given User opens url "https://hotnews.bg/top-stories" to see the view all button listed above the footer
    And User sees Load more button listed on the page