package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class LightningInput extends BaseElement{
    private final static String INPUT_LOCATOR="//label[text()='%s']";

    public LightningInput(WebDriver driver, String label) {
        super(driver,label);
    }
    public void setValue (String value){
        WebElement inputElement = driver.findElement(By.xpath(String.format(INPUT_LOCATOR,label)));
        System.out.printf("Setting %s input value = %s", label, value);
        if(Objects.nonNull(value)){
            scrollIntoView(inputElement);
            inputElement.sendKeys(value);
        }
    }
}
