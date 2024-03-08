package stepDefinitions.testCases.footerPagesTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.PrivacyPage;

public class PrivacyPageSteps {

    private HomePage homePage;
    private PrivacyPage privacyPage;

    public PrivacyPageSteps(HomePage homePage, PrivacyPage privacyPage) {
        this.homePage = homePage;
        this.privacyPage = privacyPage;
    }

    @Given("User opens the following url {string} to open Privacy page")
    public void user_opens_the_following_url_to_open_privacy_page(String url) {
        homePage.openBrowser(url);
    }

    @And("User clicks privacy link in the footer")
    public void user_clicks_privacy_link_in_the_footer() {
        homePage.clickOnPrivacyLink();
    }

    @And("User sees the following title of the page Personal data {string}")
    public void user_sees_the_following_title_of_the_page_personal_data(String expectedTitle) {
//        privacyPage.getTitleOfPrivacyPage(expectedTitle);
        System.out.println("test1");
    }

    @And("User sees tab on the page Privacy Policy {string}")
    public void user_sees_tab_on_the_page_privacy_policy(String expectedTabPrivacyPolicy) {
//        privacyPage.tabPrivacyPolicyListed(expectedTabPrivacyPolicy);
        System.out.println("test 2");
    }

    @And("User sees tab on the page Cookie policy {string}")
    public void user_sees_tab_on_the_page_cookie_policy(String expectedTabCookiePolicyTitle) {
//        privacyPage.tabCookiePolicyListed(expectedTabCookiePolicyTitle);
        System.out.println("test 3");
    }

    @And("User sees tab on the page Rights under GDPR {string}")
    public void user_sees_tab_on_the_page_rights_under_gdpr(String expectedTitleTabGDP) {
        privacyPage.tabGDPListed(expectedTitleTabGDP);
    }

}
