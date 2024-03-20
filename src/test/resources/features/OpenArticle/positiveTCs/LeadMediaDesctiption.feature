@openArticleProps
Feature: Open Article Lead Media Description
  Precondition: Author has added Description in lead media

  Scenario: User verifies that the description is listed in open Article's description container
    Given User opens article "https://hotnews.bg/article/2024031713215253565" to check the description is listed under lead media container
    And User sees description "Мария Силвестър с майстор Караджов" successfully listed in main media's container