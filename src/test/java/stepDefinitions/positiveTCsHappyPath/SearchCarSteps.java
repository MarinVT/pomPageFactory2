package stepDefinitions.positiveTCsHappyPath;

import BaseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Homepage;
import pages.SearchCarPage;

public class SearchCarSteps extends BaseTest {

//    private WebDriver driver = getDriver();
    private Homepage homepage;
    private SearchCarPage searchCarPage;

    public SearchCarSteps(Homepage homepage, SearchCarPage searchCarPage) {
        this.homepage = homepage;
        this.searchCarPage = searchCarPage;
    }

    @Given("User is on the homepage {string}")
    public void user_is_on_the_homepage(String url) {
        homepage.navigateToSiteURL(url);
    }

    @And("User select region {string} Sofia Town from dropdown")
    public void user_select_region_sofia_town_from_dropdown(String region) {

        homepage.selectDropdownRegion(region);

    }

    @And("User selects BMW {string} from dropdown BRAND")
    public void user_selects_bmw_from_dropdown_brand(String brand) {

        homepage.selectDropdownBrandCar(brand);

    }

    @And("User selects model X3 {string} from dropdown MODEL")
    public void user_selects_model_x3_from_dropdown_model(String model) {

        homepage.selectDropdownModelCar(model);

    }

    @Given("User selects modification {string} from dropdown")
    public void user_selects_modification_from_dropdown(String modification) {

        homepage.selectDropdownModification(modification);

    }

    @And("User clicks on yellow submit button")
    public void user_clicks_on_yellow_submit_button() {

        homepage.clickOnSubmitButton();

    }

    @Then("User is navigated to search page with listed result for {string}")
    public void user_is_navigated_to_search_page_with_listed_result_for(String expectedSearchingString) {
        homepage.getAllValuesDropDownBrand();

    }

}
