package stepDefinitions.testCases.homepageTCs.positiveTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class GetViewAllButtonListedSteps {

    private HomePage homePage;

    public GetViewAllButtonListedSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("User opens the following url {string} to see the view all button")
    public void user_opens_the_following_url_to_see_the_view_all_button(String url) {
        homePage.openBrowser(url);
    }
    @And("User sees view all button")
    public void user_sees_view_all_button() {
        homePage.buttonViewAllListed();
    }
}
