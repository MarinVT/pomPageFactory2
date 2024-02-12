package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AboutUsPage;
import pages.Homepage;

public class AboutUsPageSteps {

    private Homepage homepage;
    private AboutUsPage aboutUsPage;

    public AboutUsPageSteps(Homepage homepage, AboutUsPage aboutUsPage) {
        this.homepage = homepage;
        this.aboutUsPage = aboutUsPage;
    }

    @Given("User is on the homepage1 {string}")
    public void user_is_on_the_homepage(String url) {
        homepage.navigateToHomepageURL(url);
    }

    @And("User clicks on link About us")
    public void user_clicks_on_link_about_us() throws InterruptedException {
        homepage.openAboutUsPage();
    }

    @And("User sees the title {string}")
    public void user_sees_the_title(String title) {
        aboutUsPage.getWelcomeTextAboutUsPage(title);
    }
}
