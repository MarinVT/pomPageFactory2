package stepDefinitions.homepageTCs.postiveTCS;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.Homepage;

public class HomepageTitleSteps {

    private Homepage homepage;

    public HomepageTitleSteps(Homepage homepage) {
        this.homepage = homepage;
    }

    @Given("User opens the following url {string}")
    public void user_opens_the_following_url(String url) {
        homepage.navigateToHomepageURL(url);
    }

    @And("User gets homepage title {string}")
    public void user_gets_homepage_title(String expectedTitle) {
        homepage.getHomePageTitle(expectedTitle);
    }


}
