package stepDefinitions.positiveTCsHappyPath.contactUsTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.BasePage;
import pages.ContactUsPage;
import pages.Homepage;

public class ContactUsSteps extends BasePage {

    private Homepage homepage;
    private ContactUsPage contactUsPage;

    public ContactUsSteps(Homepage homepage, ContactUsPage contactUsPage) {
        this.homepage = homepage;
        this.contactUsPage = contactUsPage;
    }

    @Given("User is on the homepage2 {string}")
    public void user_is_on_the_homepage2(String url) {
        contactUsPage.navigateToSiteURL(url);
    }

    @And("User clicks on link Contact us")
    public void user_clicks_on_link_contact_us() {
        homepage.openContactUsPage();
    }

    @And("User sees the section {string}")
    public void user_sees_the_section(String expectedTextConnectionWithUs) {
        contactUsPage.getConnectionWithUsTextContactUsPage(expectedTextConnectionWithUs);
    }
}
