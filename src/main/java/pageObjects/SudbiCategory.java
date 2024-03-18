package pageObjects;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SudbiCategory extends BasePage {

    public SudbiCategory() {
        super();
    }

    String topStoriesUrl = "https://hotnews.bg/sudbi";

    @FindBy(xpath = "//strong[contains(.,'Съдби2')]")
    private WebElement mainTitleSudbiLocator;

    @FindBy(xpath = "/html/body/div[1]/main/div[4]/section/div")
    private WebElement mainSectionWithArticlesListedLocator;

    public void getMainTitleOpenCategorySudbi(String expectedTitle) {
        assertEqualsByWebElementExpectedText(mainTitleSudbiLocator, expectedTitle);
    }

    public void mainSectionWithArticlesIsListed() {
        waitElementToBeVisible(mainSectionWithArticlesListedLocator);
    }

}
