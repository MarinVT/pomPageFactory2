@openArticleProps2
Feature: Open Article Summary
  Precondition: Author has added text in summary field

  Scenario: User verifies that the summary lists text in open Article
    Given User opens article "https://hotnews.bg/article/2024031713215253565" to check the text in summary field
    And User gets the following text from the summary field "Майстор Влади Караджов не дава вида на страдащ за липсата си в новите епизоди на „Бригада Нов дом”, в които бе заместен от бившия участник във „Фермата” Калин."