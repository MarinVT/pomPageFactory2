package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basePage.BasePage;

public class AddsPage extends BasePage {

    public AddsPage() {
        super();
    }

    @FindBy(xpath = "//h2[contains(.,'Advertisement & prices')]")
    private WebElement addsPageTitleLocator;

    public void verifyAddsPageTitleListed(String expectedTitle) {
        assertEqualsByWebElementExpectedText(addsPageTitleLocator, expectedTitle);
    }

}
