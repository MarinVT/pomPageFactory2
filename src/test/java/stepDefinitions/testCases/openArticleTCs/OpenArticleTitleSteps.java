package stepDefinitions.testCases.openArticleTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.OpenArticlePage;

public class OpenArticleTitleSteps {

    private OpenArticlePage openArticlePage;

    public OpenArticleTitleSteps(OpenArticlePage openArticlePage) {
        this.openArticlePage = openArticlePage;
    }

    @Given("User opens the following url {string} to get title")
    public void user_opens_the_following_url_to_get_title(String openArticleURL) {
        openArticlePage.navigateToSiteURL(openArticleURL);
        openArticlePage.acceptCookieButton();
    }
    @And("User sees the title {string} listed above the main media photo")
    public void user_sees_the_title_listed_above_the_main_media_photo(String expectedTitle) {
        openArticlePage.getTitleOfArticle(expectedTitle);
    }

}
