package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadsPage extends BasePage{

    private final static By NEW_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By ICON_LOCATOR = By.xpath("//div[@class='slds-page-header--object-home slds-page-header_joined slds-page-header_bleed slds-page-header slds-shrink-none test-headerRegion forceListViewManagerHeader']");

    private final static By SALUTATION_BUTTON=By.xpath("//button[@name='salutation']");
    private final static By SALUTATION_OPTION=By.xpath("//span[@class='slds-truncate' and text()='Ms.']");
    private final static By LEAD_STATUS_BUTTON=By.xpath("//button[@aria-label='Lead Status, New']");
    private final static By LEAD_STATUS_OPTION=By.xpath("//span [@class='slds-truncate' and text()='Working']");
    private final static By FIRST_NAME_INPUT=By.xpath("//input[@name='firstName']");
    private final static By LAST_NAME_INPUT=By.xpath("//input[@placeholder='Last Name']");
    private final static By COMPANY_INPUT=By.xpath("//input[@name='Company']");
    private final static By SAVE_LEAD_BUTTON=By.xpath("//button[@name='SaveEdit' and text()='Save']");

    private final static By INFO_NEW_LEAD_SAVED=By.xpath(" //div[@aria-label='Success']");
    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LOCATOR);
    }

    public void clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
    }
    public void clickSalutationButton(){
        driver.findElement(SALUTATION_BUTTON).click();

    }
    public void clickSalutationOption(){
        driver.findElement(SALUTATION_OPTION).click();
    }

    public void clickLeadStatusButton(){
        driver.findElement(LEAD_STATUS_BUTTON).click();
    }

    public void clickLeadStatusOption(){
        driver.findElement(LEAD_STATUS_OPTION).click();
    }

    public void setFirstNameInput(String leadFirstName){
        driver.findElement(FIRST_NAME_INPUT).sendKeys(leadFirstName);
}
    public void setLastNameInput(String leadLastName){
        driver.findElement(LAST_NAME_INPUT).sendKeys(leadLastName);
    }
    public void setCompanyInput(String leadCompany){
        driver.findElement(COMPANY_INPUT).sendKeys(leadCompany);
    }
    public void clickSaveLeadButton(){
        driver.findElement(SAVE_LEAD_BUTTON).click();
    }
    public boolean isNewLeadInfoDisplayed(){
        return driver.findElement(INFO_NEW_LEAD_SAVED).isDisplayed();
    }
    public void waitLeadInfo(){
        WebElement info=(new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //div[@aria-label='Success']")));
    }
}
