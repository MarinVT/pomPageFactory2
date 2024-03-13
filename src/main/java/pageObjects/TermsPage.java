package pageObjects;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TermsPage extends BasePage {

    public TermsPage() {
        super();
    }

    @FindBy(xpath = "//strong[contains(.,'ОБЩИ УСЛОВИЯ ЗА ИЗПОЛЗВАНЕ НА САЙТОВЕТЕ НА СПОРТАЛ.БГ АД')]")
    private WebElement termsSectionTitle;

    public boolean termsSectionTitle() {
        return termsSectionTitle.isDisplayed();
    }

    public void isTermsSectionTitleListed(String expectedTitleSection) {
         Assert.assertEquals(termsSectionTitle.getText(), expectedTitleSection);
    }

}
