package stepDefinitions.positiveTCsHappyPath.homepageTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pages.Homepage;

public class HomepageSteps extends BasePage {

    private WebDriver driver = getDriver();
    private Homepage homepage;

    public HomepageSteps(Homepage homepage) {
        this.homepage = homepage;
    }

    @Given("User opens the following url {string}")
    public void user_opens_the_following_url(String url) {
        homepage.navigateToHomepageURL(url);
    }

    @And("User gets homepage title {string}")
    public void user_gets_homepage_title(String expectedTitle) {
//        String currentTitle = driver.getTitle();
//        Assert.assertEquals(currentTitle, expectedTitle);
        homepage.validateCorrectPage(expectedTitle);
    }



}
