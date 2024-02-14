package pageObjects;

import SeleniumDriver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BasePage {

//    public static WebDriver driver;
//    public WebDriverWait wait;

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    // NAVIGATE TO URL CUSTOM METHOD
    public void navigateToSiteURL(String url) {
        getDriver().get(url);
    }

    //  FIND METHOD
    public WebElement findWebElementByLocator(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
        return getDriver().findElement(locator);
    }
    // SENDKEYS CUSTOM METHOD USING BY AND ENTER TEXT
    public void sendKeysLocatedByEnterString(By by, String stringToEnter) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(stringToEnter);
    }
    // SENDKEYS VIA WEBELEMENT AND STRING TO BE ENTERED
    public void sendKeysViaWebElementAndEnterString(WebElement webElement, String stringToEnter) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement)).sendKeys(stringToEnter);
    }

    //Wait Wrapper Method using BY by - https://www.swtestacademy.com/page-object-model-java/
    public void waitVisibilityOfElementLocatedBy(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    //Wait Wrapper Method for WEBELEMENT
    public void waitVisibilityOfEWebelement(WebElement webElement) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    //CLICK METHOD USING WEBELEMENT
//    public void waitAndClickOnElement(By element) {
//        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
//    }

    //CLICK METHOD USING BY
    public void waitAndClickOnElement(WebElement webElement) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }

    // Check that is element present
    public boolean waitAndIsElementDisplay(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(by)).isDisplayed();
    }


//    // WAIT ELEMENT FOR A WEBELEMENT
//    public WebElement waitVisibilityOfWebElement(WebElement element) {
//        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(element));
//        return element;
//    }

    //WRITE TEXT
    public void writeText (By elementBy, String text) {
        waitVisibilityOfElementLocatedBy(elementBy);
        getDriver().findElement(elementBy).sendKeys(text);
    }
    //CLEAR METHOD
    public void clear(By locator) {
        findWebElementByLocator(locator).clear();
    }

    //READ TEXT USING By
    public String readTextUsingBy (By elementBy) {
        waitVisibilityOfElementLocatedBy(elementBy);
        return getDriver().findElement(elementBy).getText();
    }

    //READ TEXT USING By by
    public String readText (By by) {
        waitVisibilityOfElementLocatedBy(by);
        return getDriver().findElement(by).getText();
    }

    //ASSERT METHOD
    public void assertEqualsByElementExpectedText (By elementBy, String expectedText) {
        waitVisibilityOfElementLocatedBy(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
        System.out.println("Main text is: " + expectedText);
    }

    // VALIDATE CORRECT PAGE METHOD
    public void validateCorrectPage(String searchString) {
        if (!getDriver().getTitle().contains(searchString)) {
            throw new IllegalStateException(
                    "This is not "
                    + searchString + " .The actual Url is: "
                    + getDriver().getCurrentUrl());
        }
    }

    // DROPDOWN METHOD SELECTION BY TEXT
    public void selectFromDropDownByText(WebElement element, String selectByText) {
        Select select = new Select(element);
        select.selectByVisibleText(selectByText);
    }

    // DROPDOWN METHOD SELECTION BY VALUE
    public void selectFromDropDownByValue(WebElement element, String selectByValue) {
        Select select = new Select(element);
        select.selectByValue(selectByValue);
    }

    /*
    Get desired values method and returns list with items - LINK BELOW
    https://www.testingminibytes.com/courses/java-8-for-automation-qa-power-of-functional-programming/optimising-gettext-gettagname-getattribute-methods-in-selenium

    NOTE: This is a selector that will be passed to the method - private By menuItems = By.xpath("//div[@id='nav-xshop']/a")
    List<WebElement> elements = driver.findElements(menuItems)
    List<String> takeAllValues1 = getValues(elements(Webelement, Webelement::getText)
    List<String> takeAllValues2 = getValues(elements(Webelement, e -> e.getAttribute("href"))
    List<String> takeAllValues3 getValues(elements(Webelement, Webelement::getTagName)
     */
    public List<String> getValues(List<WebElement> elements, Function<WebElement, String> function) {
        return elements.stream().map(function).collect(Collectors.toList());
    }
    /*
    Call the method ->
    getValues.foreach(System::println)
     */

    // Switch to alert
    public void waitForAlertWindowAndValidateText(String text) {
        String alertMessage = getDriver().switchTo().alert().getText();
        Assert.assertEquals(alertMessage, text);
    }

    // Get message method
    public String getErrorMessage(WebElement element) {
        String strErrorMsg = null;
//        WebElement errorMsg = driver.findElement(errorMsgTxt);
        if(element.isDisplayed() && element.isEnabled())
            strErrorMsg = element.getText();
        return strErrorMsg;
    }
}
