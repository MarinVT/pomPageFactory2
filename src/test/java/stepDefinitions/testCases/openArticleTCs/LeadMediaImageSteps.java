package stepDefinitions.testCases.openArticleTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.OpenArticlePage;

public class LeadMediaImageSteps {

    private OpenArticlePage openArticlePage;

    public LeadMediaImageSteps(OpenArticlePage openArticlePage) {
        this.openArticlePage = openArticlePage;
    }

    @Given("User opens article {string} to check the image is listed in lead media container")
    public void user_opens_article_to_check_the_image_is_listed_in_lead_media_container(String url) {
        openArticlePage.navigateToSiteURL(url);
    }

    @And("User sees image successfully listed in main media container")
    public void user_sees_image_successfully_listed_in_main_media_container() {
        openArticlePage.mainImageAddedInLeadMedia();
    }

}
