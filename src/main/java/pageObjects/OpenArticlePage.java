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

    // Main image container locator
    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[4]/section/div/div[1]/div[2]/div[1]/div/span/img")
    private WebElement leadMediaAddedImageLocator;

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

    // CHECKS IF THE TITLE IS LISTED
    public void getTitleOfArticle(String expectedTitle) {
        assertEqualsByWebElementExpectedText(titleLocator, expectedTitle);
    }

    // CHECKS IS THERE ANY MAIN IMAGE ADDED IN THE CONTAINER
    public void mainImageAddedInLeadMedia() {
        waitElementToBeVisible(leadMediaAddedImageLocator);
    }

}
