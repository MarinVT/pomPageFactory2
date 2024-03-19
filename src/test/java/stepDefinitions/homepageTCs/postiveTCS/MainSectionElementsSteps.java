package stepDefinitions.homepageTCs.postiveTCS;

import io.cucumber.java.en.Given;
import pageObjects.Homepage;

public class MainSectionElementsSteps {

    private Homepage homepage;

    public MainSectionElementsSteps(Homepage homepage) {
        this.homepage = homepage;
    }

    @Given("User opens url to get main section Elements {string}")
    public void user_opens_url_to_get_main_section_elements(String url) {
        homepage.navigateToHomepageURL(url);
    }
    @Given("User sees the main section Elements listed successfully")
    public void user_sees_the_main_section_elements_listed_successfully() {
        homepage.getMainSectionElements();
    }

}
