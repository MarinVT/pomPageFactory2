package stepDefinitions.testCases.footerPagesTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.TermsPage;

public class TermsPageSteps {

    private HomePage homePage;
    private TermsPage termsPage;

    public TermsPageSteps(HomePage homePage, TermsPage termsPage) {
        this.homePage = homePage;
        this.termsPage = termsPage;
    }

    @Given("User opens the following url {string} to open Terms page")
    public void user_opens_the_following_url_to_open_terms_page(String url) {
        homePage.openBrowser(url);
    }

    @And("User clicks Terms in the footer")
    public void user_clicks_terms_in_the_footer() {
        homePage.waitCustomMethod(3000);
        homePage.openTermsPage();
    }

    @Then("User is navigated to Terms page")
    public void user_is_navigated_to_terms_page() {
        termsPage.termsSectionTitle();
    }

    @And("User sees the following title of section {string}")
    public void user_sees_the_following_title_of_section(String expectedTitle) {
        termsPage.isTermsSectionTitleListed(expectedTitle);
    }

}
