package stepDefinitions.testCases.homepageTCs.positiveTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class GetMainListSteps {

    private HomePage homepage;

    public GetMainListSteps(HomePage homepage) {
        this.homepage = homepage;
    }

    @Given("User opens the following url {string} to see the main list with five articles")
    public void user_opens_the_following_url_to_see_the_main_list_with_five_articles(String url) {
        homepage.navigateToSiteURL(url);
    }
    @And("User sees main list with five articles")
    public void user_sees_main_list_with_five_articles() {
        homepage.getMainListWith5Articles();
    }

}