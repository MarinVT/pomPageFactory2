package stepDefinitions.testCases.categoryTopStories.positiveTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.TopStoriesPageCategory;

public class LoadMoreButtonTopStoriesSteps {

    private TopStoriesPageCategory topStoriesPageCategory;

    public LoadMoreButtonTopStoriesSteps(TopStoriesPageCategory topStoriesPageCategory) {
        this.topStoriesPageCategory = topStoriesPageCategory;
    }

    @Given("User opens url {string} to see the view all button listed above the footer")
    public void user_opens_url_to_see_the_view_all_button_listed_above_the_footer(String url) {
        topStoriesPageCategory.openTopStoryPageURL(url);
    }

    @And("User sees Load more button listed on the page")
    public void user_sees_load_more_button_listed_on_the_page() {
        topStoriesPageCategory.loadMoreButtonListed();
    }

}
