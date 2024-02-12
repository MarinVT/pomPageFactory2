package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

public class ContactUsPage extends BasePage {

    public ContactUsPage() {
        super();
    }

    @FindBy(xpath = "//h2[contains(.,'Връзка с Нас')]")
    private WebElement textConnectionWithUs;

    By companyText = By.xpath("//h2[contains(.,'Връзка с Нас')]");

    // Add selectors here
    // Test comment new branch

    // Add more methods to enter data in all fields

    public void getConnectionWithUsTextContactUsPage(String title) {
        assertEqualsByElementExpectedText(companyText, title);
    }

}
