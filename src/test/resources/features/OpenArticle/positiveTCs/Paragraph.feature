@openArticleProps1
Feature: Open Article Paragraph
  Precondition: Author has added Paragraph in lead media

  Scenario: User verifies that the Paragraph is listed in open Article's body
    Given User opens article "https://hotnews.bg/article/2024031713215253565" to check the Paragraph is listed under lead media container
    And User sees Paragraph "Караджов обиколи Латинска Америка, като редува ходенето на плаж в Коста Рика с разглеждането на забележителности като Панамския канал в едноименната държава. Бившият бригадир на Мария Силвестър е предприел далечното пътешествие по покана на известна италианска строителна компания, с която работи в момента. Екскурзията той осъществи с жена си Цветелина, с която се запозна по време на снимките на Бригадата и манекенката Диляна Попова, която за първи път тогава показа новия си мъж, както Hotnews.bg вече писа." successfully listed in body of article