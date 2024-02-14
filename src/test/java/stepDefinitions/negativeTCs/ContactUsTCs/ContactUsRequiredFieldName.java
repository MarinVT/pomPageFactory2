package stepDefinitions.negativeTCs.ContactUsTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ContactUsPage;
import pages.Homepage;

public class ContactUsRequiredFieldName {

    private Homepage homepage;
    private ContactUsPage contactUsPage;

    public ContactUsRequiredFieldName(Homepage homepage, ContactUsPage contactUsPage) {
        this.homepage = homepage;
        this.contactUsPage = contactUsPage;
    }

    @Given("User opens this address {string} to reach the contact us page")
    public void user_opens_this_address_to_reach_the_contact_us_page(String url) {
        homepage.navigateToSiteURL(url);
    }

    @And("User clicks on Contact us white section  located in front of the phone number")
    public void user_clicks_on_contact_us_white_section_located_in_front_of_the_phone_number() {
        homepage.openContactUsPage();
    }

    @And("User does not enter name in name input field")
    public void user_does_not_enter_name_in_name_input_field() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(contactUsPage.isNameInputFieldListed(), "Name input field is not present on the page empty");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("User enters the following email {string} in next field email")
    public void user_enters_the_following_email_in_next_field_email(String email) {
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

    @And("User enters town {string} in town input field2")
    public void user_enters_town_in_town_input_field2(String town) {
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

    @And("User sees in red text with the following {string} under Name input field")
    public void user_sees_in_red_text_with_the_following_under_name_input_field(String warningText) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(contactUsPage.getTextRequiredFieldNameNotAdded(), warningText);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
