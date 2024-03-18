package stepDefinitions.testCases.openArticleTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.OpenArticlePage;
import pageObjects.TagPage;

public class TagFindsArticlesSteps {

    private OpenArticlePage openArticlePage;
    private TagPage tagPage;


    public TagFindsArticlesSteps(OpenArticlePage openArticlePage, TagPage tagPage) {
        this.openArticlePage = openArticlePage;
        this.tagPage = tagPage;
    }

    @Given("User opens article {string} to ger articles via tag name")
    public void user_opens_article_to_ger_articles_via_tag_name(String urlArticle) {
        openArticlePage.navigateToSiteURL(urlArticle);
        openArticlePage.acceptCookieButton();
    }

    @And("User scrolls down to tag ергенът and clicks on it")
    public void user_scrolls_down_to_tag_ергенът_and_clicks_on_it() throws InterruptedException {
        openArticlePage.clickOnTagNameToOpenTagPage();
    }

    @Then("User is navigated to tag page with title {string} that contains articles with this name")
    public void user_is_navigated_to_tag_page_with_title_that_contains_articles_with_this_name(String expectedTitlePage) {
        tagPage.getTagTitlePage(expectedTitlePage);
    }

}
