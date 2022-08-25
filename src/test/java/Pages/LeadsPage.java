package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadsPage extends BasePage{

    private final static By NEW_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By ICON_LOCATOR = By.xpath("//div[@data-aura-class='forceListViewManagerHeader']");
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
