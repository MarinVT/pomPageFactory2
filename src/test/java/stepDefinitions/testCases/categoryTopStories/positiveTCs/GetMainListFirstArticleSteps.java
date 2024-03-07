package stepDefinitions.testCases.categoryTopStories.positiveTCs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TopStoriesPageCategory;

public class GetMainListFirstArticleSteps {

    private TopStoriesPageCategory topStoriesPageCategory;

    public GetMainListFirstArticleSteps(TopStoriesPageCategory topStoriesPageCategory) {
        this.topStoriesPageCategory = topStoriesPageCategory;
    }

    @Given("User opens url {string} to verify that the first article is listed")
    public void user_opens_url_to_verify_that_the_first_article_is_listed(String url) {
        topStoriesPageCategory.openTopStoryPageURL(url);
    }

    @Then("User is successfully navigated to Top Stories page and first article is successfully listed")
    public void user_is_successfully_navigated_to_top_stories_page_and_first_article_is_successfully_listed() {
        topStoriesPageCategory.isFirstArticleListed();
    }

}
