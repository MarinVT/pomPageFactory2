package stepDefinitions.testCases.footerPagesTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactsPageSteps {

    private ContactUsPage contactUsPage;
    private HomePage homePage;

    public ContactsPageSteps(ContactUsPage contactUsPage, HomePage homePage) {
        this.contactUsPage = contactUsPage;
        this.homePage = homePage;
    }

    @Given("User opens the following url {string} to open Contacts page")
    public void user_opens_the_following_url_to_open_contacts_page(String url) {
        homePage.openBrowser(url);
    }
    @And("User clicks contacts in the footer")
    public void user_clicks_contacts_in_the_footer() {
        homePage.openContactsPage();
    }
    @Then("User is navigated to Contacts page")
    public void user_is_navigated_to_contacts_page() {
        contactUsPage.contactUsTitleIsListed();
    }
    @And("User sees the following email for contacts {string}")
    public void user_sees_the_following_email_for_contacts(String string) {
        contactUsPage.emailListedOnThePage();
    }

}
