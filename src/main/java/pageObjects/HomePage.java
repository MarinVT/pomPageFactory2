package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basePage.BasePage;

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

    // Share component locators
    @FindBy(className = "post_post__share__Z2_63")
    private WebElement shareComponentMainArticleLocatorList1;

    @FindBy(xpath = "/html/body/div[1]/main/div[3]/section/div/div[1]/a/div[1]/div/div/div/button")
    private WebElement shareComponentMainArticleLocatorList2;

    @FindBy(xpath = "(//img[contains(@sizes,'100vw')])[2]")
    private WebElement getFacebookIconShareComponentLocator;

    @FindBy(xpath = "(//img[@sizes='100vw'])[5]")
    private WebElement facebookIconShareComponentLocator;

    // Share component locators ENDS

    // Search functionality locators
    @FindBy(xpath = "//img[@src='/image/icon/search.svg?v=48&format=webp']")
    private WebElement searchIcon;

    @FindBy(xpath = "//input[contains(@class,'search_search__input__xo3rD')]")
    private WebElement inputSearchField;

    // Logo homepage
    @FindBy(xpath = "(//img[contains(@srcset,'logo.svg?v=384&format=webp 2x')])[1]")
    private WebElement logoHotNews;

    // Hamburger menu locator
    @FindBy(css = "img[alt='search icon'][srcset='/image/icon/menu.svg?v=32&format=webp 1x, /image/icon/menu.svg?v=48&format=webp 2x']")
    private WebElement hamburgerMenu;

    // Top stories dropdown locator
    @FindBy(xpath = "//a[@href='/top-stories'][contains(.,'Top stories')]")
    private WebElement topStoriesDropdownLocator;

    @FindBy(xpath = "//a[@href='/sudbi'][contains(.,'Съдби')]")
    private WebElement sudbiDropdownLocator;

    // ----> Footer links locators <----
    @FindBy(linkText = "Контакти")
    private WebElement contactsLinkFooterLocator;

// Test element using By by
    By contactsLink = By.xpath("//a[@href='/contacts']");

    @FindBy(xpath = "//a[@target='_blank'][contains(.,'За рекламa')]")
    private WebElement addsLinkFooterLocator;

    @FindBy(linkText = "Лични данни")
    private WebElement privacyLinkFooterLocator;

    @FindBy(xpath = "//a[@href='https://corp.sportal.bg/bg/static/terms']")
    private WebElement termsLinkFooterLocator;

    @FindBy(xpath = "//a[@href='https://corp.sportal.bg/bg/ethical']")
    private WebElement ethicalRulesFooterLocator;

    // ----> Footer end links

    @FindBy(id = "brand")
    List <WebElement> dropDownBrandCarLocatorList;

//    Page Actions
    // Navigate to homepage via URL
    public void openBrowser(String url) {
        navigateToSiteURL(url);
        acceptCookieButton();
    }

    // Accept cookie button menu method
    public void acceptCookieButton() {
        waitElementAndClickOnIt(acceptCookieButton);
    }

    // Return homepage title
    public String getHomePageTitle(String actualPageTitle) {
        return getDriver().getTitle();
    }

    // Homepage list with 5 articles method
    public void getMainListWith5Articles() {
        waitElementToBeVisible(mainList5ArticlesLocator);
    }

    // Homepage list with 5 articles Bullevard
    public void getList5ArticlesBoulevard() {
        waitElementToBeVisible(listBulevardLocator);
    }

    // Homepage list with the last articles created
    public void getListLastCreatedArticles() {
        waitElementToBeVisible(listLastCreatedArticlesLocator);
    }

    // -----> SHARE COMPONENTS METHODS <-----
    // Homepage button "Share component" is listed
    public void buttonViewAllListed() {
        waitElementToBeVisible(viewAllButtonLocator);
    }

    // Homepage "Share component" is listed
    public void shareComponentListedUnderTheArticle() {
        waitVisibilityOfWebElement(shareComponentMainArticleLocatorList1);
    }

    // Share component navigates to Facebook page
    public void hoverOverShareComponentMainListFirstArticle() {
        hoverEffectOverAnElement(shareComponentMainArticleLocatorList1);
        hoverAndClick(getFacebookIconShareComponentLocator);
    }
    // -----> SHARE COMPONENTS METHODS ENDS <-----

    // ------>  Search functionality <------
    public void clickOnSearchIcon() {
        hoverAndClick(searchIcon);
        waitElementAndClickOnIt(searchIcon);
//        waitElementAndClickOnIt(searchIcon);
    }

    public void enterTextToSearchField(String searchArticle) {
        waitVisibilityOfWebElement(inputSearchField);
        sendKeysViaWebElementAndEnterString(inputSearchField, searchArticle);
    }

    public SearchPage doSearch() {
        waitElementAndClickOnIt(searchIcon);
        return new SearchPage();
    }
    // ------>  Search functionality END <------

    // Logo hotNews is clickable on the homepage
    public HomePage clickOnLogo() {
//        waitHoverEffect(logoHotNews);
//        waitElementAndClickOnIt(logoHotNews);
        hoverAndClick(logoHotNews);
        return new HomePage();
    }

    // Logo of hotNews is listed
    public void logoIsListed() {
        waitElementToBeVisible(logoHotNews);
    }

    // Click on top stories from dropdown menu
    public void clickOnHamburgerMenu() {
        waitElementToBeVisible(hamburgerMenu);
        hoverEffectOverAnElement(hamburgerMenu);
        waitElementAndClickOnIt(hamburgerMenu);
    }

    public TopStoriesPageCategory openDropdownSelectTopStories() {
        waitElementAndClickOnIt(topStoriesDropdownLocator);
        return new TopStoriesPageCategory();
    }

    public SudbiCategory openDropdownSelectSudbi() {
        waitElementAndClickOnIt(sudbiDropdownLocator);
        return new SudbiCategory();
    }

    // FOOTER METHODS NAVIGATING TO EACH PAGE - КОНТАКТИ, За Реклама, Общи условия, Етични правила, Лични данни и други
    // Link Contacts
    public ContactUsPage openContactsPage() {
        waitElementAndClickOnIt(contactsLinkFooterLocator);
        return new ContactUsPage();
    }

    // Link За реклама
    public AddsPage openAddsPage() {
        waitElementAndClickOnIt(addsLinkFooterLocator);
        openNewTab();
        return new AddsPage();
    }

    // Footer - Personal data
    public PrivacyPage clickOnPrivacyLink() {
        waitElementAndClickOnIt(privacyLinkFooterLocator);
        return new PrivacyPage();
    }

    // Link Common Terms
    public TermsPage openTermsPage() {
        waitElementAndClickOnIt(termsLinkFooterLocator);
        openNewTab();
        return new TermsPage();
    }

    // Link Common Terms
    public EthicalRulesPage openEthicalRulesPage() {
        waitElementAndClickOnIt(ethicalRulesFooterLocator);
        openNewTab();
        return new EthicalRulesPage();
    }

    // HELPER METHODS
    // Get all values from dropdown brand and print it all - Example
    public void getAllValuesDropDownBrand() {
        List<String> allValues = getValuesFromDropDown(dropDownBrandCarLocatorList, WebElement::getText);
        List<String> getHref = getValuesFromDropDown(dropDownBrandCarLocatorList, e -> e.getAttribute("href"));
        List<String> getTagName = getValuesFromDropDown(dropDownBrandCarLocatorList, WebElement::getTagName);
        allValues.forEach(System.out::println);
    }





}
