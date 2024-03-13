package stepDefinitions.testCases.categoryTopStories.positiveTCs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.TopStoriesPageCategory;
import pageObjects.HomePage;

public class ValidateCorrectURLTopStoriesSteps {

    private HomePage homePage;
    private TopStoriesPageCategory categoryTopStoriesPage;

    public ValidateCorrectURLTopStoriesSteps(TopStoriesPageCategory categoryTopStoriesPage) {
        this.categoryTopStoriesPage = categoryTopStoriesPage;
    }

    @Given("User opens the following url {string} to validate the correct URL")
    public void user_opens_the_following_url_to_validate_the_correct_url(String url) {
        categoryTopStoriesPage.openTopStoryPageURL(url);
    }
    @Then("User is successfully navigated to Top Stories page to this address {string}")
    public void user_is_successfully_navigated_to_top_stories_page_to_this_address(String expectedURL) {
        Assert.assertEquals(categoryTopStoriesPage.getTopStoriesCurrentPageURL(), expectedURL);
    }

}
