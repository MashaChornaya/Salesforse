package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LightningCombobox extends BaseElement{
    private final static String BUTTON_LOCATOR ="%s";
    private final static String OPTION_LOCATOR ="%s %s";
    public LightningCombobox(WebDriver driver, String label) {
        super(driver, label);
    }
    public void selectByVisibleText(String visibleText){
        WebElement button = driver.findElement(By.xpath(String.format(BUTTON_LOCATOR, label)));
        scrollIntoView(button);
        button.click();
        System.out.println("log");
        // 1st option
        driver.findElement(By.xpath(String.format(OPTION_LOCATOR, label, visibleText)));
        // 2nd option
        List<WebElement> allItems = driver.findElements(By.xpath(String.format(OPTION_LOCATOR, label))); //lightning-base-combobox-item
        allItems.stream().filter(webElement -> webElement.getText().equals(visibleText))
                .findFirst()
                .get()
                .click();
    }
}
