package stepDefinitions.testCases.openArticleTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.OpenArticlePage;

public class LeadMediaDescriptionSteps {

    private OpenArticlePage openArticlePage;

    public LeadMediaDescriptionSteps(OpenArticlePage openArticlePage) {
        this.openArticlePage = openArticlePage;
    }

    @Given("User opens article {string} to check the description is listed under lead media container")
    public void user_opens_article_to_check_the_description_is_listed_under_lead_media_container(String url) {
        openArticlePage.navigateToSiteURL(url);
    }

    @And("User sees description {string} successfully listed in main media's container")
    public void user_sees_description_successfully_listed_in_main_media_s_container(String expectedLeadMediaDescription) {
        openArticlePage.getLeadMediaDescription(expectedLeadMediaDescription);
    }
}
