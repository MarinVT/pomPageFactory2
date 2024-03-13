package stepDefinitions.testCases.categoryTopStories.positiveTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.TopStoriesPageCategory;

public class ArticleCategoryListedBelowMainPhotoSteps {

    private TopStoriesPageCategory topStoriesPageCategory;

    public ArticleCategoryListedBelowMainPhotoSteps(TopStoriesPageCategory topStoriesPageCategory) {
        this.topStoriesPageCategory = topStoriesPageCategory;
    }

    @Given("User opens {string} to verify that the category title is listed")
    public void user_opens_to_verify_that_the_category_title_is_listed(String url) {
        topStoriesPageCategory.openTopStoryPageURL(url);

    }

    @And("User sees the category title {string} underlined is successfully listed below the main photo")
    public void user_sees_the_category_title_underlined_is_successfully_listed_below_the_main_photo(String expectedTitle) {
        topStoriesPageCategory.firstArticleCategoryTitleListed();
    }

}
