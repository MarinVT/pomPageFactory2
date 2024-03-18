@openArticleProps
Feature: Open Article Title
  Precondition: Article's title is set to Бившият майстор на Мария Силвестър обикаля Латинска Америка

  Scenario: User verifies that the title is listed in open Article
    Given User opens the following url "https://hotnews.bg/article/2024031713215253565" to get title
    And User sees the title "Бившият майстор на Мария Силвестър обикаля Латинска Америка" listed above the main media photo