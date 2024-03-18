package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.util.List;

public class Homepage extends BasePage {

    public Homepage() {
        super();
    }

    // Homepage locators

    // Main section ELEMENTS
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")
    private WebElement mainSectionElementsLocator;

    @FindBy(id = "brand")
    List <WebElement> dropDownBrandCarLocatorList;


//    Page Actions

    // Navigate to homepage via URL
    public void navigateToHomepageURL(String url) {
        navigateToSiteURL(url);
    }

    // Return title
    public String getHomePageTitle(String actualPageTitle) {
        return getDriver().getTitle();
    }

    // Checks if the main Section Elements is listed
    public void getMainSectionElements() {
        waitVisibilityOfWebElement(mainSectionElementsLocator);
    }

    public ElementsPage openElementsPage() {
        waitElementAndClickOnIt(mainSectionElementsLocator);

        return new ElementsPage();
    }



    // Homepage search car input fields end part

    // HELPER METHODS
    // Get all values from dropdown brand and print it all - Example
//    public void getAllValuesDropDownBrand() {
//        List<String> allValues = getAllValuesDropDownBrand(dropDownBrandCarLocatorList, WebElement::getText);
//        List<String> getHref = getAllValuesDropDownBrand(dropDownBrandCarLocatorList, e -> e.getAttribute("href"));
//        List<String> getTagName = getAllValuesDropDownBrand(dropDownBrandCarLocatorList, WebElement::getTagName);
//        allValues.forEach(System.out::println);
//    }



}
