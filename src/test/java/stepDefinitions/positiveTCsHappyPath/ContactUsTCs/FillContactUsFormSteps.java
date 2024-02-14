package stepDefinitions.positiveTCsHappyPath.ContactUsTCs;

import BaseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.ContactUsPage;
import pages.Homepage;

public class FillContactUsFormSteps extends BaseTest {

    private Homepage homepage;
    private ContactUsPage contactUsPage;

    public FillContactUsFormSteps(Homepage homepage, ContactUsPage contactUsPage) {
        this.homepage = homepage;
        this.contactUsPage = contactUsPage;
    }

    @Given("User opens this address {string} to open contact us page")
    public void user_opens_this_address_to_open_contact_us_page(String url) {
        homepage.navigateToSiteURL(url);
    }

    @And("User clicks on Contact us link in the white section  located in front of the phone number")
    public void user_clicks_on_contact_us_link_in_the_white_section_located_in_front_of_the_phone_number() {
        homepage.openContactUsPage();
    }

    @And("User enters name {string} in name input field")
    public void user_enters_name_in_name_input_field(String names) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        contactUsPage.enterName(names);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("User enters the following email {string} in email input field")
    public void user_enters_the_following_email_in_email_input_field(String email) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        contactUsPage.enterEmail(email);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("User enters town {string} in town input field")
    public void user_enters_town_in_town_input_field(String town) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        contactUsPage.enterTown(town);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("User enter the following phone number in phone input field {string}")
    public void user_enter_the_following_phone_number_in_phone_input_field(String phone) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        contactUsPage.enterPhone(phone);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("User enter the following text in message container {string}")
    public void user_enter_the_following_text_in_message_container(String text) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        contactUsPage.enterTextMessageContainer(text);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("User is sees submit button listed")
    public void user_is_sees_submit_button_listed() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        contactUsPage.submitFormButtonIsListed();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
