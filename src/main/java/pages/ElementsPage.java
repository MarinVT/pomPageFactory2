package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

public class ElementsPage extends BasePage {

    public ElementsPage() {
        super();
    }

    // Elements TAB locators
    @FindBy(xpath = "//div[@class='header-text'][contains(.,'Elements')]")
    private WebElement elementsDropdownLocator;

    // TEXT BOX LOCATORS
    @FindBy(xpath = "//span[contains(.,'Text Box')]")
    private WebElement textBoxLocator;

    @FindBy(xpath = "//input[contains(@id,'userName')]")
    private WebElement fullNameLocatorTextBox;

    @FindBy(xpath = "//input[contains(@id,'userEmail')]")
    private WebElement emailTextBoxLocator;

    @FindBy(xpath = "//textarea[contains(@id,'currentAddress')]")
    private WebElement currentAddressTextBoxLocator;

    @FindBy(xpath = "//textarea[contains(@id,'permanentAddress')]")
    private WebElement permanentAddressTextBoxLocator;

    @FindBy(xpath = "//button[contains(@id,'submit')]")
    private WebElement submitButtonTextBoxLocator;

    // Successfully added properties fullName, email, currentAddress, permanentAddress form
    @FindBy(xpath = "//p[contains(@id,'name')]")
    private WebElement fullNameAddedFormLocator;

    public void expandDropdownElementsTab() {
        waitElementAndClickOnIt(elementsDropdownLocator);
    }

    public void goToTextBoxSection() {
        waitElementAndClickOnIt(textBoxLocator);
    }

    public void fullFieldTextBoxFields(String fullName, String email, String currentAddress, String pernamentAddress) {
        sendKeysViaWebElementAndEnterString(fullNameLocatorTextBox, fullName);
        sendKeysViaWebElementAndEnterString(emailTextBoxLocator, email);
        sendKeysViaWebElementAndEnterString(currentAddressTextBoxLocator, currentAddress);
        sendKeysViaWebElementAndEnterString(permanentAddressTextBoxLocator, pernamentAddress);

    }

    public void clickOnSubmitButton() {
        waitVisibilityOfWebElement(submitButtonTextBoxLocator);
        hoverAndClick (submitButtonTextBoxLocator);
    }

    public void dataListedSuccessFully(String fullName) {
        assertEqualsByWebElementExpectedText(fullNameAddedFormLocator, fullName);
    }

}
