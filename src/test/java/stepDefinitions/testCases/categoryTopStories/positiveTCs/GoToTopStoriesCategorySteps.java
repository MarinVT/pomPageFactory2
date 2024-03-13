package stepDefinitions.testCases.categoryTopStories.positiveTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.TopStoriesPageCategory;
import pageObjects.HomePage;

public class GoToTopStoriesCategorySteps {

    private HomePage homePage;
    private TopStoriesPageCategory categoryTopStoriesPage;

    public GoToTopStoriesCategorySteps(HomePage homePage, TopStoriesPageCategory categoryTopStoriesPage) {
        this.homePage = homePage;
        this.categoryTopStoriesPage = categoryTopStoriesPage;
    }

    @Given("User opens the following url {string} to open Top Stories category")
    public void user_opens_the_following_url_to_open_top_stories_category(String url) {
        homePage.openBrowser(url);
    }

    @And("User clicks on hamburger menu")
    public void user_clicks_on_hamburger_menu() {
        homePage.clickOnHamburgerMenu();
    }

    @And("User selects Top Stories category")
    public void user_selects_top_stories_category() {
        homePage.openDropdownSelectTopStories();
    }

    @Then("User is navigated to Top Stories page")
    public void user_is_navigated_to_top_stories_page() {
        categoryTopStoriesPage.categoryTitleIsListed();
    }

}
