package pageObjects.shareComponentPages;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookShareComponentPage extends BasePage {

    public FacebookShareComponentPage() {
        super();
    }

    @FindBy(xpath = "//span[@class='_50f7'][contains(.,'hotnews.bg')]")
    private WebElement createPostTitleWindowLocator;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/div/div[4]/button[2]")
    private WebElement cookieWindowAcceptButtonLocator;

    public void acceptCookie() {
        waitElementAndClickOnIt(cookieWindowAcceptButtonLocator);
    }

    public void getCreatePostTitleWindow(String expectedTitle) {
        assertEqualsByWebElementExpectedText(createPostTitleWindowLocator, expectedTitle);
    }
}
