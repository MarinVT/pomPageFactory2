package pageObjects;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
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

    // SUMMARY LOCATOR
    @FindBy(xpath = "//p[contains(.,'Майстор Влади Караджов не дава вида на страдащ за липсата си в новите епизоди на „Бригада Нов дом”, в които бе заместен от бившия участник във „Фермата” Калин.')]")
    private WebElement summaryTextLocator;

    // LEAD MEDIA DESCRIPTION
    @FindBy(xpath = "//p[contains(.,'Мария Силвестър с майстор Караджов')]")
    private WebElement leadMediaDescriptionLocator;

    // PARAGRAPH IN THE BODY OF ARTICLE
    @FindBy(xpath = "//p[contains(.,'Караджов обиколи Латинска Америка, като редува ходенето на плаж в Коста Рика с разглеждането на забележителности като Панамския канал в едноименната държава. Бившият бригадир на Мария Силвестър е предприел далечното пътешествие по покана на известна италианска строителна компания, с която работи в момента. Екскурзията той осъществи с жена си Цветелина, с която се запозна по време на снимките на Бригадата и  манекенката Диляна Попова, която за първи път тогава показа новия си мъж, както Hotnews.bg вече писа.')]")
    private WebElement paragraphBodyLocator;

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

    // COMPARES THE TEXT ADDED IN THE SUMMARY FIELD
    public void getTextSummaryField(String expectedTextSummaryField) {
        assertEqualsByWebElementExpectedText(summaryTextLocator, expectedTextSummaryField);
    }

    // COMPARES THE TEXT ADDED IN PARAGRAPH
    public void getLeadMediaDescription(String expectedLeadMediaDescription) {
        assertEqualsByWebElementExpectedText(leadMediaDescriptionLocator, expectedLeadMediaDescription);
    }

    public void getParagraphTextInBody(String expectedParagraphText) {
        scrollDown(paragraphBodyLocator);
        assertEqualsByWebElementExpectedText(paragraphBodyLocator, expectedParagraphText);
    }

}
