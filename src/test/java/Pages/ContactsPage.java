package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactsPage extends BasePage{
    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LOCATOR);
    }
    private final static By NEW_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By ICON_LOCATOR = By.xpath("//div[@data-aura-class='forceListViewManagerHeader']");
    private final static By SALUTATION_BUTTON=By.xpath("//button[@name='salutation']");
    private final static By SALUTATION_OPTION=By.xpath("//span[@class='slds-truncate' and text()='Ms.']");
    private final static By ACCOUNT_NAME_BUTTON=By.xpath("//input[@placeholder ='Search Accounts...']");
    private final static By ACCOUNT_NAME_OPTION=By.xpath("//span[@title='New Account']");
    private final static By SAVE_NEW_ACCOUNT_BUTTON=By.xpath ("//button[@title='Save']");
    private final static By SAVE_CONTACT_BUTTON=By.xpath("//button[@name='SaveEdit' and text()='Save']");

    private final static By INFO_NEW_CONTACT_SAVED=By.xpath(" //div[@aria-label='Success']");


    public void clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
    }
    public void clickSalutationButton(){
        driver.findElement(SALUTATION_BUTTON).click();

    }
    public void clickSalutationOption(){
        driver.findElement(SALUTATION_OPTION).click();
    }

    public void clickAccountNameButton (){
        driver.findElement(ACCOUNT_NAME_BUTTON).click();
    }
    public void waitContactSaveButtonDisplayed() {
        WebElement contactSave=(new WebDriverWait(driver,5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='SaveEdit' and text()='Save']")));
    }
    public void clickAccountNameOption (){
        driver.findElement(ACCOUNT_NAME_OPTION).click();
    }

    public void clickSaveNewAccButton(){
        driver.findElement(SAVE_NEW_ACCOUNT_BUTTON).click();
    }
    public void clickSaveContactButton(){
        driver.findElement(SAVE_CONTACT_BUTTON).click();
    }
    public boolean isNewContactInfoDisplayed(){
        return driver.findElement(INFO_NEW_CONTACT_SAVED).isDisplayed();
    }
    public void waitContactInfo(){
        WebElement info=(new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //div[@aria-label='Success']")));
    }
}

