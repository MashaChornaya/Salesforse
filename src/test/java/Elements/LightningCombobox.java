package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class LightningCombobox extends BaseElement{
    private final static String BUTTON_LOCATOR ="//button[@aria-label='%s']";
    private final static String OPTION_LOCATOR ="//span[@lightning-basecombobox_basecombobox and text()='%s']";
    public LightningCombobox(WebDriver driver, String label) {
        super(driver, label);
    }
    public void selectByVisibleText(String visibleText){
        WebElement button = driver.findElement(By.xpath(String.format(BUTTON_LOCATOR, label)));

        if(Objects.nonNull(visibleText)){
            scrollIntoView(button);
            button.click();
            List<WebElement> allItems = driver.findElements(By.xpath(String.format(OPTION_LOCATOR, label))); //lightning-base-combobox-item
            allItems.stream().filter(webElement -> webElement.getText().equals(visibleText))
                    .findFirst()
                    .get()
                    .click();
        }
    }
}
