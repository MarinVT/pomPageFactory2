package stepDefinitions.testCases.homepageTCs.positiveTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.HomePage;

public class GetBullevardListSteps {

    //Test
    private HomePage homePage;

    public GetBullevardListSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("User opens the following url {string} to see the main list Bullevard")
    public void user_opens_the_following_url_to_see_the_main_list_bullevard(String url) {
        homePage.openBrowser(url);
    }
    @And("User sees main list Bullevard with articles")
    public void user_sees_main_list_bullevard_with_articles() {
        homePage.getList5ArticlesBulevard();
    }

}
