package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basePage.BasePage;

public class SearchPage extends BasePage {

    public SearchPage() {
        super();
    }

    // Search page current locators

    @FindBy(xpath = "//strong[contains(.,'Азис')]")
    private WebElement searchResultLocator;

    @FindBy(xpath = "//h2[@class='post_post__title__AZGAF'][contains(.,'Мария: Не нося сутиен от години')]")
    private WebElement listedArticleLocator;


    public void getSearchStrongTitle() {
        waitElementAndClickOnIt(searchResultLocator);
    }

    public void getFirstArticleList(String articleTitle) {
        assertEqualsByWebElementExpectedText(listedArticleLocator, articleTitle);
    }

}