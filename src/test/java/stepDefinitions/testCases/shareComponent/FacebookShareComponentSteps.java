package stepDefinitions.testCases.shareComponent;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.shareComponentPages.FacebookShareComponentPage;

public class FacebookShareComponentSteps {

    private HomePage homePage;
    private FacebookShareComponentPage facebookShareComponentPage;

    public FacebookShareComponentSteps(HomePage homePage, FacebookShareComponentPage facebookShareComponentPage) {
        this.homePage = homePage;
        this.facebookShareComponentPage = facebookShareComponentPage;
    }

    @Given("User opens url {string} to share article in facebook")
    public void user_opens_url_to_share_article_in_facebook(String url) {
        homePage.openBrowser(url);
    }

    @And("User hovers over share component in list and clicks on facebook icon")
    public void user_hovers_over_share_component_in_list_and_clicks_on_facebook_icon() {
        homePage.hoverOverShareComponentMainListFirstArticle();
        homePage.openNewTab();
    }

    @Then("User is navigated to facebook and sees Create post window {string}")
    public void user_is_navigated_to_facebook_and_sees_create_post_window(String expectedFacebookCreatePostTitle) {
        facebookShareComponentPage.acceptCookie();
        facebookShareComponentPage.getCreatePostTitleWindow(expectedFacebookCreatePostTitle);
    }


}
