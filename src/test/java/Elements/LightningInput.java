package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class LightningInput extends BaseElement{
    private final static String INPUT_LOCATOR="//input[@class='slds-input' and @placeholder='%s']";

    public LightningInput(WebDriver driver, String label) {
        super(driver,label);
    }
    public void setValue (String value){
        WebElement inputElement = driver.findElement(By.xpath(String.format(INPUT_LOCATOR,label)));
        if(Objects.nonNull(value)){
            scrollIntoView(inputElement);
            System.out.printf("Setting %s input value = %s", label, value);
            inputElement.sendKeys(value);
        }
    }
}
