package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.BasePage;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage() {
        super();
    }

    // Accept cookie button locator
    @FindBy(xpath = "//button[contains(.,'Приемам')]")
    private WebElement acceptCookieButton;

    // Homepage locators Main list with 5 articles
    // Test locator 2 - /html/body/div[1]/main/div[3]/section/div for the main list
    @FindBy(xpath = "//*[@id='__next']/main/div[3]/section/div")
    private WebElement mainList5ArticlesLocator;

    // Homepage list with 5 articles Bullevard
    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[5]/section/div")
    private WebElement listBulevardLocator;

    // Homepage list with newest created articles
    @FindBy(xpath = "//*[@id='__next']/main/div[6]/section/section")
    private WebElement listLastCreatedArticlesLocator;

    // Homepage "Виж още" button located under the list with latest articles
    @FindBy(xpath = "//a[@href='/?page=2']")
    private WebElement viewAllButtonLocator;

    // Share component is visible under the article in list
    @FindBy(className = "post_post__share__Z2_63")
    private WebElement shareComponentLocatorUnderArticle;

    // Search functionality locators
    @FindBy(xpath = "//img[@src='/image/icon/search.svg?v=48&format=webp']")
    private WebElement searchIcon;

    @FindBy(xpath = "//input[contains(@placeholder,'Търси в hotNews')]")
    private WebElement inputSearchField;

    // Logo homepage
    @FindBy(xpath = "(//img[contains(@alt,'Hotnews.bg')])[1]")
    private WebElement logoHotNews;

    // Hamburger menu locator
    @FindBy(xpath = "//img[@srcset='/image/icon/menu.svg?v=32&format=webp 1x, /image/icon/menu.svg?v=48&format=webp 2x']")
    private WebElement hamburgerMenu;

    // Top stories dropdown locator
    @FindBy(xpath = "//*[@id=\"__next\"]/header/div/div[2]/ul/li[1]/a")
    private WebElement topStoriesDropdown;

    @FindBy(id = "brand")
    private WebElement dropDownBrandCarLocator;

    @FindBy(id = "brand")
    List <WebElement> dropDownBrandCarLocatorList;

    // Locator of About Us page on the homepage in the main section with links on the top
    By aboutUsLinkHomepageTopOfPage = By.linkText("За Нас");
    // Contacts Locator
    By contactUsLinkHomepageTopOfPage = By.linkText("Контакти");
    // Homepage logo company locator
    By homepageLogoEcometalLTD = By.xpath("//img[@src='https://ecometal.bg/wp-content/uploads/2021/03/logo-ecometal.png']");

    // Homepage phone number locator in the right upper corner
    By homepagePhoneNumber = By.xpath("//div[@class='contact-number'][contains(.,'Позвънете Ни0885 771 777')]");
    private @FindBy(xpath = "(//strong[contains(.,'0885 771 777')])[1]")
    WebElement homepagePhoneNumberLocatorWebelement;


    @FindBy(xpath = "/html/body/div[1]/header/div[3]/div/div[2]/nav/div[2]/ul/li[1]")
    private WebElement aboutUsLinkHomepageTopOfPageWebElement;

//    Page Actions

    // Navigate to homepage via URL
    public void openBrowser(String url) {
        navigateToSiteURL(url);
        acceptCookieButton();
    }

    // Accept cookie button menu method
    public void acceptCookieButton() {
        waitAndClickOnElement(acceptCookieButton);
    }

    // Return homepage title
    public String getHomePageTitle(String actualPageTitle) {
        return getDriver().getTitle();
    }

    // Homepage list with 5 articles method
    public void getMainListWith5Articles() {
        waitVisibilityOfEWebElement(mainList5ArticlesLocator);
    }

    // Homepage list with 5 articles Bullevard
    public void getList5ArticlesBulevard() {
        waitVisibilityOfEWebElement(listBulevardLocator);
    }

    // Homepage list with the last articles created
    public void getListLastCreatedArticles() {
        waitVisibilityOfEWebElement(listLastCreatedArticlesLocator);
    }

    // Homepage button "Share component"
    public void buttonViewAllListed() {
        waitVisibilityOfEWebElement(viewAllButtonLocator);
    }

    // Homepage button "Share component"
    public void shareComponentListedUnderTheArticle() {
        waitVisibilityOfEWebElement(shareComponentLocatorUnderArticle);
    }

    // Search functionality
    public void clickOnSearchIcon() {
        waitVisibilityOfEWebElement(searchIcon);
        searchIcon.click();
    }

    public void enterTextToSearchField(String searchArticle) {
        waitVisibilityOfEWebElement(inputSearchField);
        sendKeysViaWebElementAndEnterString(inputSearchField, searchArticle);
    }

    public SearchPage doSearch() {
        waitCustomMethod(4000);
        waitAndClickOnElement(searchIcon);
        return new SearchPage();
    }

    // Logo hotNews is clickable on the homepage
    public HomePage clickOnLogo() {
        waitAndClickOnElement(logoHotNews);
        return new HomePage();
    }

    // Logo of hotNews is listed
    public void logoIsListed() {
        waitVisibilityOfEWebElement(logoHotNews);
    }

    // Click on top stories from dropdown menu

    public void clickOnHamburgerMenu() {
        waitAndClickOnElement(hamburgerMenu);
    }

    public TopStoriesPageCategory openDropdownSelectTopStories() {
        waitAndClickOnElement(topStoriesDropdown);

        return new TopStoriesPageCategory();
    }


//    public boolean verifyDefaultLanguageIsSelected(String language) {
//        return buttonChangeLanguageDefaultBG.getText().contains(language);
//    }

    // Homepage search car input fields
    public void selectDropdownBrandCar(String brand) {
        selectFromDropDownByValue(dropDownBrandCarLocator,brand);
    }

    // Takes homepage logo of the company
    public void getHomepageCompanyLogo() {
        waitVisibilityOfElementLocatedBy(homepageLogoEcometalLTD);
    }

    // Takes homepage phone number of the company
    public void getHomepagePhoneNumberListed(String expectedResult) {
        waitVisibilityOfEWebElement(homepagePhoneNumberLocatorWebelement);
        Assert.assertEquals(homepagePhoneNumberLocatorWebelement.getText(), expectedResult);
    }

    // HELPER METHODS
    // Get all values from dropdown brand and print it all - Example
    public void getAllValuesDropDownBrand() {
        List<String> allValues = getValuesFromDropDown(dropDownBrandCarLocatorList, WebElement::getText);
        List<String> getHref = getValuesFromDropDown(dropDownBrandCarLocatorList, e -> e.getAttribute("href"));
        List<String> getTagName = getValuesFromDropDown(dropDownBrandCarLocatorList, WebElement::getTagName);
        allValues.forEach(System.out::println);
    }

    // Open ABOUT US page clicking on link "За НАС"
    public AboutUsPage openAboutUsPage() {
        findWebElementByLocator(aboutUsLinkHomepageTopOfPage).click();
        return new AboutUsPage();
    }


}
