@openArticleNegative

Feature: Open article
  Precondition: Article is deactivated from the CMS

  Scenario: User is not able to see the content of article with status deactivated. Throws 404 message.
    Given User opens the article "add deactivated article here" with status deactivated.
    Then User gets message 404 not found for the deactivated article