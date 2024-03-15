package stepDefinitions.testCases.categorySudbi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.SudbiCategory;

public class OpenCategorySudbiGetTitleSteps {

    private HomePage homePage;
    private SudbiCategory sudbiCategory;

    public OpenCategorySudbiGetTitleSteps(HomePage homePage, SudbiCategory sudbiCategory) {
        this.homePage = homePage;
        this.sudbiCategory = sudbiCategory;
    }

    @Given("User opens url {string} to open Sudbi category")
    public void user_opens_url_to_open_sudbi_category(String url) {
        homePage.openBrowser(url);
    }

    @And("User clicks on hamburger menu to open Sudbi category")
    public void user_clicks_on_hamburger_menu_to_open_sudbi_category() {
        homePage.clickOnHamburgerMenu();
    }

    @And("User selects Sudbi from dropdown")
    public void user_selects_sudbi_from_dropdown() {
        homePage.openDropdownSelectSudbi();
    }

    @Then("User is navigated to Sudbi page and sees title Sudbi {string}")
    public void user_is_navigated_to_sudbi_page_and_sees_title_sudbi(String expectedTitle) {
        homePage.waitCustomMethod(3000);
        sudbiCategory.getMainTitleOpenCategorySudbi(expectedTitle);
        homePage.waitCustomMethod(3000);
    }

}
