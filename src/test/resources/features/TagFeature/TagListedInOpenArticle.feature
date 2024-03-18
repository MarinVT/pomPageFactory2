@tag
Feature: Tag in open article
  Precondition: Tag is added from CMS in open article with name егенът
  Test article https://hotnews.bg/article/2024030112005165237

  Scenario: User has tag added in open article
    Given User opens url "https://hotnews.bg/article/2024030112005165237" to get the TAG
    And User scrolls down and tag is successfully added with name "ергенът"