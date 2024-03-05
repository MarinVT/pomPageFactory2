package stepDefinitions.positiveTCsHappyPath.homepageTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomepageViewAllButtonListedSteps {

    private HomePage homePage;

    public HomepageViewAllButtonListedSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("User opens the following url {string} to see the view all button")
    public void user_opens_the_following_url_to_see_the_view_all_button(String url) {
        homePage.navigateToHomepageURL(url);
    }
    @And("User sees view all button")
    public void user_sees_view_all_button() {
        homePage.buttonViewAllListed();
    }
}
