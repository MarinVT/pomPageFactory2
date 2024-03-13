package pageObjects;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EthicalRulesPage extends BasePage {

    public EthicalRulesPage() {
        super();
    }

    @FindBy(xpath = "//h1[@class='entry-title'][contains(.,'Етични правила на НСС')]")
    private WebElement ethicalRulesTitleLocator;

    public void getSectionTitle() {
        waitVisibilityOfWebElement(ethicalRulesTitleLocator);
    }

    public void verifySectionTitle(String expectedTitle) {
        assertEqualsByWebElementExpectedText(ethicalRulesTitleLocator, expectedTitle);
    }

}
