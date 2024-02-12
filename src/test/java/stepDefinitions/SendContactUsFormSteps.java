package stepDefinitions;

import BaseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ContactUsPage;
import pages.Homepage;

public class SendContactUsFormSteps extends BaseTest {

    private Homepage homepage;
    private ContactUsPage contactUsPage;

    public SendContactUsFormSteps(Homepage homepage, ContactUsPage contactUsPage) {
        this.homepage = homepage;
        this.contactUsPage = contactUsPage;
    }

    @Given("User opens this address {string}")
    public void user_opens_this_address(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("User clicks on CONTACTS link")
    public void user_clicks_on_contacts_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User sees contact us form")
    public void user_sees_contact_us_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("User enter the following text {string} to input field NAME")
    public void user_enter_the_following_text_to_input_field_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("User enter the following text {string} to input field EMAIL")
    public void user_enter_the_following_text_to_input_field_email(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("User enter the following text {string} to input field TOWN")
    public void user_enter_the_following_text_to_input_field_town(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("User enter the following phone number {string} to input field Phone")
    public void user_enter_the_following_phone_number_to_input_field_phone(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("User enter the following text {string} to input field MESSAGE")
    public void user_enter_the_following_text_to_input_field_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
