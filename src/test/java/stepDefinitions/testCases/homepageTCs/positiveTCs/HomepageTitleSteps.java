package stepDefinitions.testCases.homepageTCs.positiveTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.HomePage;

public class HomepageTitleSteps {

    private HomePage homepage;

    public HomepageTitleSteps(HomePage homepage) {
        this.homepage = homepage;
    }

    @Given("User opens the following url {string}")
    public void user_opens_the_following_url(String url) {
        homepage.openBrowser(url);
    }

    @And("User gets homepage title {string}")
    public void user_gets_homepage_title(String homepageTitle) {
        homepage.getHomePageTitle(homepageTitle);
    }

}
