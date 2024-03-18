package stepDefinitions.testCases.openArticleTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.OpenArticlePage;

public class TagListedInOpenArticleSteps {

    private OpenArticlePage openArticlePage;

    public TagListedInOpenArticleSteps(OpenArticlePage openArticlePage) {
        this.openArticlePage = openArticlePage;
    }

    @Given("User opens url {string} to get the TAG")
    public void user_opens_url_to_get_the_tag(String url) {
        openArticlePage.navigateToSiteURL(url);
        openArticlePage.acceptCookieButton();
    }
    @And("User scrolls down and tag is successfully added with name {string}")
    public void user_scrolls_down_and_tag_is_successfully_added_with_name(String expectedTagName) {
        openArticlePage.getTagNameInOpenArticle(expectedTagName);
    }

}
