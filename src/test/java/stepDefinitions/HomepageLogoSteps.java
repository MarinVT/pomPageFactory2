package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Homepage;

public class HomepageLogoSteps {

    private Homepage homepage;

    public HomepageLogoSteps(Homepage homepage) {
        this.homepage = homepage;
    }

    @Given("User opens the following url to see the logo ECOMETAL {string}")
    public void user_opens_the_following_url_to_see_the_logo_ecometal(String url) {
        homepage.navigateToHomepageURL(url);
    }
    @And("User sees the logo of the company listed successfully")
    public void user_sees_the_logo_of_the_company_listed_successfully() {
        homepage.getHomepageCompanyLogo();
    }
}
