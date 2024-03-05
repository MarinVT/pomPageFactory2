package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

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
        waitVisibilityOfEWebElement(searchResultLocator);
    }

    public void getFirstArticleList(String articleTitle) {
        assertEqualsByElementExpectedTextWebElement(listedArticleLocator, articleTitle);
    }

}
