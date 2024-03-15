package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basePage.BasePage;

public class TopStoriesPageCategory extends BasePage {

    public TopStoriesPageCategory() {
        super();
    }

    String topStoriesUrl = "https://hotnews.bg/top-stories";

    // Top stories title located under the logo of hotNews
    @FindBy(xpath = "//strong[contains(.,'Top stories')]")
    private WebElement topStoriesCategoryTitleLocator;

    // Main list first article locator
    @FindBy(xpath = "/html/body/div[1]/main/div[4]/section/div/div[1]")
    private WebElement mainListFirstArticle;

    // Locator list with latest articles located under the list with lead news
    @FindBy(xpath = "/html/body/div[1]/main/div[5]/section/section")
    private WebElement latestNewsListLocator;

    // Button Load More locator
    @FindBy(xpath = "//a[contains(.,'Виж още')]")
    private WebElement loadMoreButtonLocator;

    // Accept cookie button locator
    @FindBy(xpath = "//button[contains(.,'Приемам')]")
    private WebElement acceptCookieButton;

    // Top Stories title locator placed under the main photo in the list of the first article
    @FindBy(xpath = "(//p[contains(.,'Top stories')])[1]")
    private WebElement firstArticleLeadNewsCategoryTitleLocator;

    // Accept cookie button menu method
    public void acceptCookieButton() {
        waitElementAndClickOnIt(acceptCookieButton);
    }

    // Accept cookie method
    public void openTopStoryPageURL(String url) {
        navigateToSiteURL(url);
        acceptCookieButton();
    }

    public void categoryTitleIsListed() {
        waitVisibilityOfWebElement(topStoriesCategoryTitleLocator);
    }

    // Validate correct Top Stories URL - https://hotnews.bg/top-stories
    public String getTopStoriesCurrentPageURL() {
        return getCurrentURL();
    }

    // Is first article listed from the main list of the category
    public void isFirstArticleListed() {
        waitVisibilityOfWebElement(mainListFirstArticle);
    }

    // Method that checks is a list with latest article is presented on the page
    public void isListLatestArticlePresented() {
        waitVisibilityOfWebElement(latestNewsListLocator);
    }

    public void loadMoreButtonListed() {
        waitVisibilityOfWebElement(loadMoreButtonLocator);
    }

    public void firstArticleCategoryTitleListed() {
        waitVisibilityOfWebElement(firstArticleLeadNewsCategoryTitleLocator);
    }

}
