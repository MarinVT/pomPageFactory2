package pageObjects;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TagPage extends BasePage {

    public TagPage() {
        super();
    }

    @FindBy(xpath = "//strong[contains(.,'ергенът')]")
    private WebElement tagTitleLocator;

    // TAG PAGE TITLE
    public void getTagTitlePage(String expectedTitleTagPage) {
        assertEqualsByWebElementExpectedText(tagTitleLocator, expectedTitleTagPage);
    }

}
