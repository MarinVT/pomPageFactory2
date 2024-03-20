package stepDefinitions.testCases.openArticleTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.OpenArticlePage;

public class SummarySteps {

    private OpenArticlePage openArticlePage;

    public SummarySteps(OpenArticlePage openArticlePage) {
        this.openArticlePage = openArticlePage;
    }

    @Given("User opens article {string} to check the text in summary field")
    public void user_opens_article_to_check_the_text_in_summary_field(String url) {
        openArticlePage.navigateToSiteURL(url);
    }

    @And("User gets the following text from the summary field {string}")
    public void user_gets_the_following_text_from_the_summary_field(String expectedText) {
        openArticlePage.getTextSummaryField(expectedText);
    }

}
