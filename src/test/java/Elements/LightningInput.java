package Elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;
@Log4j2
public class LightningInput extends BaseElement{
    private final static String INPUT_LOCATOR="//input[@class='slds-input' and @placeholder='%s']";

    public LightningInput(WebDriver driver, String label) {
        super(driver,label);
    }
    public void setValue (String value){
        WebElement inputElement = driver.findElement(By.xpath(String.format(INPUT_LOCATOR,label)));
        if(Objects.nonNull(value)){
            scrollIntoView(inputElement);
            log.debug("'Setting %s input value = %s', label, value");
            inputElement.sendKeys(value);
        }
    }
}
