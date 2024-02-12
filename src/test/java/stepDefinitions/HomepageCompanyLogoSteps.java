package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pages.Homepage;

public class HomepageCompanyLogoSteps extends BasePage {

    private WebDriver driver = getDriver();
    private Homepage homepage;

    public HomepageCompanyLogoSteps(Homepage homepage) {
        this.homepage = homepage;
    }

    @Given("User has open the official web page {string}")
    public void user_has_open_the_official_web_page(String url) {
        homepage.navigateToHomepageURL(url);
    }

    @And("User sees the logo of the company listed successfully AutoScout24")
    public void user_sees_the_logo_of_the_company_listed_successfully_auto_scout24() {
//        homepage.isHomePageLogoVisible();
    }
}
