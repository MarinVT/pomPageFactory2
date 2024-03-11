package stepDefinitions.testCases.footerPagesTCs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddsPage;
import pages.HomePage;

public class AddsPageSteps {

    private HomePage homePage;
    private AddsPage addsPage;

    public AddsPageSteps(HomePage homePage, AddsPage addsPage) {
        this.homePage = homePage;
        this.addsPage = addsPage;
    }

    @Given("User opens the following url {string} to open Adds page")
    public void user_opens_the_following_url_to_open_adds_page(String url) {
        homePage.openBrowser(url);
    }

    @When("User clicks Adds link in the footer")
    public void user_clicks_adds_link_in_the_footer() {
        homePage.waitCustomMethod(3000);
        homePage.openAddsPage();
        homePage.waitCustomMethod(3000);
    }

    @Then("User sees the following title of the page {string}")
    public void user_sees_the_following_title_of_the_page(String expectedTitle) {
        addsPage.verifyAddsPageTitleListed(expectedTitle);
    }

}
