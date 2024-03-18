@tag
Feature: Tag finds article via its name
  Precondition: Tag is added from CMS in open article with name егенът
  Test article https://hotnews.bg/article/2024030112005165237

  Scenario: User is able to find article via tag name
    Given User opens article "https://hotnews.bg/article/2024030112005165237" to ger articles via tag name
    And User scrolls down to tag ергенът and clicks on it
    Then User is navigated to tag page with title "ЕРГЕНЪТ" that contains articles with this name