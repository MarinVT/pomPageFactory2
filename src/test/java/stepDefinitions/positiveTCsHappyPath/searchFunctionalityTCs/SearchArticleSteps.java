package stepDefinitions.positiveTCsHappyPath.searchFunctionalityTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.SearchPage;

public class SearchArticleSteps {

    private HomePage homePage;
    private SearchPage searchPage;

    public SearchArticleSteps(HomePage homePage, SearchPage searchPage) {
        this.homePage = homePage;
        this.searchPage = searchPage;
    }

    @Given("User has open the official web page {string}")
    public void user_has_open_the_official_web_page(String url) {
        homePage.navigateToHomepageURL(url);
    }

    @And("User clicks on search icon")
    public void user_clicks_on_search_icon() {
        homePage.clickOnSearchIcon();
    }

    @And("User enters the following search patter {string}")
    public void user_enters_the_following_search_patter(String searchArticle) {
        homePage.enterTextToSearchField(searchArticle);
    }

    @And("User clicks on search icon to see the result")
    public void user_clicks_on_search_icon_to_see_the_result() {
        homePage.doSearch();
    }

    @Then("User sees a list with articles containing the title {string}")
    public void user_sees_a_list_with_articles_containing_the_title(String expectedSearchArticle) {
        searchPage.getFirstArticleList(expectedSearchArticle);
    }


}
