package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

public class CategoryTopStoriesPage extends BasePage {

    public CategoryTopStoriesPage() {
        super();
    }

    @FindBy(xpath = "//strong[contains(.,'Top stories')]")
    private WebElement topStoriesCategoryTitleLocator;

    public void categoryTitleIsListed() {
        waitVisibilityOfEWebElement(topStoriesCategoryTitleLocator);
    }

}