package stepDefinitions.testCases.categorySudbi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.SudbiCategory;

public class MainSectionWithArticlesSteps {

    private HomePage homePage;
    private SudbiCategory sudbiCategory;

    public MainSectionWithArticlesSteps(HomePage homePage, SudbiCategory sudbiCategory) {
        this.homePage = homePage;
        this.sudbiCategory = sudbiCategory;
    }

    @Given("User opens url {string} to verify that the main list is listed in Sudbi")
    public void user_opens_url_to_verify_that_the_main_list_is_listed_in_sudbi(String url) {
        homePage.openBrowser(url);
    }
    @Then("User is successfully navigated to Sudbi page and the main list is listed")
    public void user_is_successfully_navigated_to_sudbi_page_and_the_main_list_is_listed() {
        sudbiCategory.mainSectionWithArticlesIsListed();
    }

}
