package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountsPage extends  BasePage{
    private final static By ICON_LOCATOR = By.xpath("//div[@class='slds-page-header--object-home slds-page-header_joined slds-page-header_bleed slds-page-header slds-shrink-none test-headerRegion forceListViewManagerHeader']");
    private final static By NEW_ACCOUNT_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By ACCOUNT_NAME_INPUT=By.xpath("//input[@role='combobox']");
    private final static By ACCOUNT_PHONE=By.xpath("//input[@type='tel']");
   private final static By ACCOUNT_WEBSITE=By.xpath("//input[@type='url']");
   private final static By ACCOUNT_SAVE_BUTTON=By.xpath("//button[@title='Save']");
   private final static By INFO_NEW_ACCOUNT_SAVED=By.xpath("//span[text()=' was created.']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LOCATOR);
    }
    public void clickNewAccountButton(){
        driver.findElement(NEW_ACCOUNT_BUTTON).click();
    }

    public void setAccountNameInput(String accountName){
        driver.findElement(ACCOUNT_NAME_INPUT).sendKeys(accountName);
    }

    public void setAccountPhone(String accountPhone){
        driver.findElement(ACCOUNT_PHONE).sendKeys(accountPhone);
    }
    public void setAccountWebsite(String accountWebsite){
        driver.findElement(ACCOUNT_WEBSITE).sendKeys(accountWebsite);
    }
    public void clickAccountSaveButton(){
        driver.findElement(ACCOUNT_SAVE_BUTTON).click();
    }
    public void waitAccountInfo(){
        WebElement info=(new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()=' was created.']")));
    }
    public boolean isNewAccountInfoDisplayed(){
        return driver.findElement(INFO_NEW_ACCOUNT_SAVED).isDisplayed();
    }
}
