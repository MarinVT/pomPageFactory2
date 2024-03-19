package stepDefinitions.ElementsPageTCs.TextBoxTab.negativeTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.ElementsPage;
import pageObjects.Homepage;

public class TextBoxFullFieldFormSteps {

    private Homepage homepage;
    private ElementsPage elementsPage;

    public TextBoxFullFieldFormSteps(Homepage homepage, ElementsPage elementsPage) {
        this.homepage = homepage;
        this.elementsPage = elementsPage;
    }

    @Given("User opens the following url {string} to open Text Box feature")
    public void user_opens_the_following_url_to_open_text_box_feature(String url) {
        homepage.navigateToHomepageURL(url);
    }
    @And("User clicks on Elements main section on the homepage")
    public void user_clicks_on_elements_main_section_on_the_homepage() throws InterruptedException {
        homepage.openElementsPage();
    }
//    @And("User clicks on Elements tab to expand the menu")
//    public void user_clicks_on_elements_tab_to_expand_the_menu() {
//        homepage.waitCustomMethod(3000);
//        elementsPage.expandDropdownElementsTab();
//        homepage.waitCustomMethod(3000);
//    }
    @And("User clicks on Text Box tab")
    public void user_clicks_on_text_box_tab() {
        elementsPage.goToTextBoxSection();

    }
    @And("User enters full name {string}, email {string}, current address {string}, pernament address {string}")
    public void user_enters_full_name_email_current_address_pernament_address(String fullName,
                                                                              String email,
                                                                              String currentAddress,
                                                                              String permanentAddress) {
        elementsPage.fullFieldTextBoxFields(fullName, email, currentAddress, permanentAddress);
        homepage.waitCustomMethod(3000);
    }
    @And("User clicks on submit button")
    public void user_clicks_on_submit_button() {
        elementsPage.clickOnSubmitButton();
    }
    @Then("User sees form added below with fullName {string}")
    public void user_sees_form_added_below_with_full_name(String fullName) {
        elementsPage.dataListedSuccessFully(fullName);
    }



}
