package stepDefinitions.positiveTCsHappyPath.homepageTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class ValidateHomepageTitleSteps {

    private HomePage homepage;

    public ValidateHomepageTitleSteps(HomePage homepage) {
        this.homepage = homepage;
    }

    @Given("User opens the following url {string}")
    public void user_opens_the_following_url(String url) {
        homepage.navigateToSiteURL(url);
    }

    @And("User gets homepage title {string}")
    public void user_gets_homepage_title(String homepageTitle) {
        homepage.getHomePageTitle(homepageTitle);
    }

}
