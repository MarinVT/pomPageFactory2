package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basePage.BasePage;

public class ContactUsPage extends BasePage {

    public ContactUsPage() {
        super();
    }

    @FindBy(xpath = "//p[contains(.,'e-mail: office@hotnews.bg')]")
    private WebElement contactsPageEmailListedLocator;

    @FindBy(xpath = "//strong[contains(.,'Контакти')]")
    private WebElement contactsTitlePage;

    public void contactUsTitleIsListed() {
        waitElementAndClickOnIt(contactsTitlePage);
    }

    public void emailListedOnThePage() {
        waitElementAndClickOnIt(contactsPageEmailListedLocator);
    }







}
