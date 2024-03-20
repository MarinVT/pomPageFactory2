package stepDefinitions.testCases.openArticleTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.OpenArticlePage;

public class ParagraphSteps {

    private OpenArticlePage openArticlePage;

    public ParagraphSteps(OpenArticlePage openArticlePage) {
        this.openArticlePage = openArticlePage;
    }

    @Given("User opens article {string} to check the Paragraph is listed under lead media container")
    public void user_opens_article_to_check_the_paragraph_is_listed_under_lead_media_container(String url) {
        openArticlePage.navigateToSiteURL(url);
        openArticlePage.acceptCookieButton();
    }
    @And("User sees Paragraph {string} successfully listed in body of article")
    public void user_sees_paragraph_successfully_listed_in_body_of_article(String expectedTextParagraph) {
        openArticlePage.waitCustomMethod(3000);
        openArticlePage.getParagraphTextInBody(expectedTextParagraph);
        openArticlePage.waitCustomMethod(3000);
    }

}
