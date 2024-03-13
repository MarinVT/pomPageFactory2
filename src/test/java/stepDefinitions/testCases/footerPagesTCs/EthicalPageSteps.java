package stepDefinitions.testCases.footerPagesTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.EthicalRulesPage;
import pageObjects.HomePage;

public class EthicalPageSteps {

    private HomePage homePage;
    private EthicalRulesPage ethicalRulesPage;

    public EthicalPageSteps(HomePage homePage, EthicalRulesPage ethicalRulesPage) {
        this.homePage = homePage;
        this.ethicalRulesPage = ethicalRulesPage;
    }

    @Given("User opens the following url {string} to open Ethical rules page")
    public void user_opens_the_following_url_to_open_ethical_rules_page(String url) {
        homePage.openBrowser(url);
    }
    @Given("User clicks Ethical Rules link in the footer")
    public void user_clicks_ethical_rules_link_in_the_footer() {
        homePage.waitCustomMethod(3000);
        homePage.openEthicalRulesPage();
    }

    @And("User is navigated to Ethical rules page")
    public void user_is_navigated_to_ethical_rules_page() {
        ethicalRulesPage.getSectionTitle();
    }

    @Then("User sees the following title of section in grey background {string}")
    public void user_sees_the_following_title_of_section_in_grey_background(String expectedTitle) {
        ethicalRulesPage.verifySectionTitle(expectedTitle);
    }


}
