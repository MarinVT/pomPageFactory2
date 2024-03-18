package pageObjects;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenArticlePage extends BasePage {

    public OpenArticlePage() {
        super();
    }

    // Tags locators
    @FindBy(xpath = "//a[@href='/tag/ergenut']")
    private WebElement tagLocator;

    @FindBy(xpath = "//a[contains(.,'ергенът')]")
    private WebElement tagNameLocator;

    // TITLE LOCATOR
    @FindBy(xpath = "//h1[contains(.,'Бившият майстор на Мария Силвестър обикаля Латинска Америка')]")
    private WebElement titleLocator;

    // Accept cookie button locator
    @FindBy(xpath = "//button[contains(.,'Приемам')]")
    private WebElement acceptCookieButton;

    // ACCEPTS COOKIE BUTTON METHOD
    public void acceptCookieButton() {
        waitElementAndClickOnIt(acceptCookieButton);
    }

    // VERIFIES THAT THE TAG IS LISTED ON THE PAGE IN OPEN ARTICLE
    public void tagListedInOpenArticle() {
        waitElementToBeVisible(tagLocator);
    }

    // GETS TAG'S NAME
    public void getTagNameInOpenArticle(String expectedTagName) {
        scrollDownToElement(tagLocator);
        assertEqualsByWebElementExpectedText(tagLocator, expectedTagName);
    }

    // CLICKS ON TAG NAME OT OPEN TAG PAGE
    public TagPage clickOnTagNameToOpenTagPage() {
        scrollDownToElement(tagLocator);
        hoverEffectOverAnElement(tagNameLocator);
        waitElementAndClickOnIt(tagNameLocator);
//        waitElementAndClickOnIt(tagLocator);
        return new TagPage();
    }

    public void getTitleOfArticle(String expectedTitle) {
        assertEqualsByWebElementExpectedText(titleLocator, expectedTitle);
    }
}
