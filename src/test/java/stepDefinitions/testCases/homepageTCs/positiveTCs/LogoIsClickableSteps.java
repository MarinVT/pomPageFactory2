package stepDefinitions.testCases.homepageTCs.positiveTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class LogoIsClickableSteps {

    private HomePage homePage;

    public LogoIsClickableSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("User opens the following url {string} to click on the logo fo hotNews")
    public void user_opens_the_following_url_to_click_on_the_logo_fo_hot_news(String url) {
        homePage.navigateToHomepageURL(url);
    }
    @And("User clicks in the logo of hotNews on the homepage")
    public void user_clicks_in_the_logo_of_hot_news_on_the_homepage() {
        homePage.clickOnLogo();
    }
    @Then("User sees refreshed page")
    public void user_sees_refreshed_page() {
        homePage.logoIsListed();
    }

}
