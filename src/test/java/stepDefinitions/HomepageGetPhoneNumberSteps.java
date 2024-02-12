package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.Homepage;

public class HomepageGetPhoneNumberSteps {

    private Homepage homepage;

    public HomepageGetPhoneNumberSteps(Homepage homepage) {
        this.homepage = homepage;
    }

    @Given("User opens the following url to see the phone number {string}")
    public void user_opens_the_following_url_to_see_the_phone_number(String url) {
        homepage.navigateToSiteURL(url);
    }
    @And("User sees the phonen number of the company listed successfully {string}")
    public void user_sees_the_phonen_number_of_the_company_listed_successfully(String phoneNumberHomepage) {
        homepage.getHomepagePhoneNumberListed(phoneNumberHomepage);
    }
}
