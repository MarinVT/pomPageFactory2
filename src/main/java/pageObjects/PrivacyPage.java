package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basePage.BasePage;

public class PrivacyPage extends BasePage {

    public PrivacyPage() {
        super();
    }

    @FindBy(xpath = "(//strong[contains(.,'Лични данни')])[1]")
    private WebElement personalDataPageTitleLocator;

    @FindBy(xpath = "//li[contains(.,'Политика за поверителност')]")
    private WebElement privacyPolicyTabLocator;

    @FindBy(xpath = "//li[contains(.,'Политика за бисквитки')]")
    private WebElement cookiePolicyTabLocator;

    @FindBy(xpath = "//li[contains(.,'Права по GDPR')]")
    private WebElement gdpTabLocator;

    public void getTitleOfPrivacyPage(String privacyPageTitle) {
        assertEqualsByWebElementExpectedText(personalDataPageTitleLocator, privacyPageTitle);
    }

    public void tabPrivacyPolicyListed(String tabPrivacyPolicyTitle) {
        assertEqualsByWebElementExpectedText(privacyPolicyTabLocator, tabPrivacyPolicyTitle);
    }

    public void tabCookiePolicyListed(String tabCookiePolicyTitle) {
        assertEqualsByWebElementExpectedText(cookiePolicyTabLocator, tabCookiePolicyTitle);
    }

    public void tabGDPListed(String tabGPRTitle) {
        assertEqualsByWebElementExpectedText(gdpTabLocator, tabGPRTitle);
    }

}
