package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountsPage extends  BasePage{
    private final static By ICON_LOCATOR = By.xpath("//div[@data-aura-class='forceListViewManagerHeader']");
    private final static By NEW_ACCOUNT_BUTTON = By.cssSelector("div.active a[title=New]");
   private final static By ACCOUNT_SAVE_BUTTON=By.xpath("//button[@title='Save']");// //*[@title='Save']
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
