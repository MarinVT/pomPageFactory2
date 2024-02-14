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

    // Contact us form - Name, Email, Town, Phone, Message locators
    By nameInputField = By.xpath("//input[contains(@placeholder,'Име *')]");
    By emailInputField = By.xpath("//input[contains(@type,'email')]");
    By townInputField = By.xpath("//input[contains(@placeholder,'Град *')]");
    By phoneInputField = By.xpath("//input[@placeholder='Телефон *']");
    By messageContainerInputField = By.xpath("//textarea[contains(@aria-invalid,'false')]");
    By submitButtonSend = By.xpath("//button[@type='submit']");

    // Required fields locators
    // Required field NAME with text Това поле е задължително.
    By nameRequiredFieldLocator = By.xpath("//span[@class='wpcf7-not-valid-tip'][contains(.,'Това поле е задължително.')]");

    // Add more methods to enter data in all fields
    public void getConnectionWithUsTextContactUsPage(String title) {
        assertEqualsByElementExpectedText(companyText, title);
    }

    // Enter methods for Name, Email, Town, Phone, Message input fields
    // Enter method for NAME
    public void enterName(String name) {
        sendKeysLocatedByEnterString(nameInputField, name);
    }
    // Enter method for EMAIL
    public void enterEmail(String email) {
        sendKeysLocatedByEnterString(emailInputField, email);
    }
    // Enter method for TOWN
    public void enterTown(String town) {
        sendKeysLocatedByEnterString(townInputField, town);
    }
    // Enter method for TOWN
    public void enterPhone(String phoneNumber) {
        sendKeysLocatedByEnterString(phoneInputField, phoneNumber);
    }
    // Enter method for MESSAGE container
    public void enterTextMessageContainer(String text) {
        sendKeysLocatedByEnterString(messageContainerInputField, text);
    }
    // SUBMIT button click method
    public void submitFormButtonIsListed() {
        waitVisibilityOfElementLocatedBy(submitButtonSend);
    }
    // Required field NAME Това поле е задължително.
    public String getTextRequiredFieldNameNotAdded() {
        return readText(nameRequiredFieldLocator);
    }
    // Is element display
    public boolean isNameInputFieldListed() {
        return waitAndIsElementDisplay(nameInputField);
    }

}
