package stepDefinitions.testCases.categoryTopStories.positiveTCs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TopStoriesPageCategory;

public class GetLatestArticlesListTopStories {

    private TopStoriesPageCategory topStoriesPageCategory;

    public GetLatestArticlesListTopStories(TopStoriesPageCategory topStoriesPageCategory) {
        this.topStoriesPageCategory = topStoriesPageCategory;
    }

    @Given("User opens url {string} to verify that the list with latest articles is presented")
    public void user_opens_url_to_verify_that_the_list_with_latest_articles_is_presented(String url) {
        topStoriesPageCategory.openTopStoryPageURL(url);
        topStoriesPageCategory.waitCustomMethod(3000);
    }
    @Then("User is successfully navigated to Top Stories page and latest articles list is successfully listed")
    public void user_is_successfully_navigated_to_top_stories_page_and_latest_articles_list_is_successfully_listed() {
        topStoriesPageCategory.waitCustomMethod(3000);
        topStoriesPageCategory.isListLatestArticlePresented();
        topStoriesPageCategory.waitCustomMethod(3000);
    }
}
