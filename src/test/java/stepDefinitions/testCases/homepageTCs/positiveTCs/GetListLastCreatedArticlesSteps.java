package stepDefinitions.testCases.homepageTCs.positiveTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class GetListLastCreatedArticlesSteps {

    private HomePage homePage;

    public GetListLastCreatedArticlesSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("User opens the following url {string} to see the list with last created articles")
    public void user_opens_the_following_url_to_see_the_list_with_last_created_articles(String url) {
        homePage.navigateToHomepageURL(url);
    }
    @And("User sees main list with last created articles")
    public void user_sees_main_list_with_last_created_articles() {
        homePage.getListLastCreatedArticles();
    }

}
