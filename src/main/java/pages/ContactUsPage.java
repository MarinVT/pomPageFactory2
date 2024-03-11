package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

public class ContactUsPage extends BasePage {

    public ContactUsPage() {
        super();
    }

    @FindBy(xpath = "//p[contains(.,'e-mail: office@hotnews.bg')]")
    private WebElement contactsPageEmailListedLocator;

    @FindBy(xpath = "//strong[contains(.,'Контакти')]")
    private WebElement contactsTitlePage;

    // Locator example using By by
    By nameInputField = By.xpath("//input[contains(@placeholder,'Име *')]");

    public void contactUsTitleIsListed() {
        moveAndWaitElementAndClickOnIt(contactsTitlePage);
    }

    public void emailListedOnThePage() {
        moveAndWaitElementAndClickOnIt(contactsPageEmailListedLocator);
    }







}
