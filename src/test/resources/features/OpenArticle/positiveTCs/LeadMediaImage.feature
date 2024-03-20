@openArticleProps
Feature: Open Article Lead Media Image
  Precondition: Author has added image in lead media

  Scenario: User verifies that the image is listed in open Article's lead media container
    Given User opens article "https://hotnews.bg/article/2024031713215253565" to check the image is listed in lead media container
    And User sees image successfully listed in main media container