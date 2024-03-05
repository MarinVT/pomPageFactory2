package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

public class AboutUsPage extends BasePage {

    public AboutUsPage() {
        super();
    }

    @FindBy(partialLinkText = "Ecometal Engineering Ltd.")
    private WebElement mainSectionCompanyTitle;

    By companyText = By.xpath("//span[contains(.,'Ecometal Engineering Ltd.')]");

   public void getTextAboutUsWelcome(String expectedText) {
       assertEqualsByElementExpectedTextUsingBy(companyText, expectedText);
   }

   public void getWelcomeTextAboutUsPage(String title) {
       assertEqualsByElementExpectedTextUsingBy(companyText, title);
   }

}
