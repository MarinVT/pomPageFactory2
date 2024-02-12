package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

import java.util.List;

public class Homepage extends BasePage {

    public Homepage() {
        super();
    }

    // Homepage locators
    @FindBy(xpath = "//button[contains(.,'Български')]")
    private WebElement buttonChangeLanguageDefaultBG;

    // Homepage properties
    @FindBy(id = "region")
    private WebElement dropDownSelectRegionLocator;

    @FindBy(id = "brand")
    private WebElement dropDownBrandCarLocator;
    @FindBy(id = "brand")
    List <WebElement> dropDownBrandCarLocatorList;

    // Search fields locator - Brand, Model, YearRegistration
    @FindBy(id = "model")
    private WebElement dropDownModelCarLocator;

    @FindBy(xpath = "//*[@id='modification']")
    private WebElement getDropDownModificationLocator;

    @FindBy(xpath = "//button[contains(@id,'give-me-price')]")
    private WebElement giveMePriceButtonHomepageLocator;

    // Error message locator
    @FindBy(xpath = "//p[contains(.,'Грешка:')]")
    private WebElement errorMessageLocator;

    // White header links locators
    // Locator of About Us page on the homepage in the main section with links on the top
    By aboutUsLinkHomepageTopOfPage = By.linkText("За Нас");
    // Contacts Locator
    By contactUsLinkHomepageTopOfPage = By.linkText("Контакти");
    // Homepage logo company locator
    By homepageLogoEcometalLTD = By.xpath("//img[@src='https://ecometal.bg/wp-content/uploads/2021/03/logo-ecometal.png']");

    @FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/nav/div[2]/ul/li[1]")
    private WebElement aboutUsLinkHomepageTopOfPageWebElement;

//    Page Actions

    // Navigate to homepage via URL
    public void navigateToHomepageURL(String url) {
        navigateToSiteURL(url);
    }

    public String getHomePageTitle(String actualPageTitle) {
        return getDriver().getTitle();
    }

    public boolean verifyDefaultLanguageIsSelected(String language) {
        return buttonChangeLanguageDefaultBG.getText().contains(language);
    }

    // Homepage search car input fields
    public void selectDropdownBrandCar(String brand) {
        selectFromDropDownByValue(dropDownBrandCarLocator,brand);
    }

    public void selectDropdownModelCar(String model) {
        selectFromDropDownByValue(dropDownModelCarLocator, model);
    }

    public void selectDropdownModification(String modification) {
        selectFromDropDownByText(getDropDownModificationLocator, modification);
    }

    public void selectDropdownRegion(String region) {
        selectFromDropDownByValue(dropDownSelectRegionLocator, region);
    }

    public void clickOnSubmitButton() {
//        giveMePriceButtonHomepageLocator.click();
        waitAndClickOnElement(giveMePriceButtonHomepageLocator);
    }

    public void getHomepageCompanyLogo() {
        waitVisibilityOfElementLocatedBy(homepageLogoEcometalLTD);
    }

    // Homepage search car input fields end part

    // HELPER METHODS
    // Get all values from dropdown brand and print it all - Example
    public void getAllValuesDropDownBrand() {
        List<String> allValues = getValues(dropDownBrandCarLocatorList, WebElement::getText);
        List<String> getHref = getValues(dropDownBrandCarLocatorList, e -> e.getAttribute("href"));
        List<String> getTagName = getValues(dropDownBrandCarLocatorList, WebElement::getTagName);
        allValues.forEach(System.out::println);
    }

    // Open ABOUT US page clicking on link "За НАС"
    public AboutUsPage openAboutUsPage() {
        findWebElementByLocator(aboutUsLinkHomepageTopOfPage).click();
        return new AboutUsPage();
    }

    // Open CONTACT US page clicking on link "За НАС"
    public ContactUsPage openContactUsPage() {
        findWebElementByLocator(contactUsLinkHomepageTopOfPage).click();
        return new ContactUsPage();
    }
}
