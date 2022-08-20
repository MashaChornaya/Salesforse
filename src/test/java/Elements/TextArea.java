package Elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

@Log4j2

public class TextArea extends BaseElement{

    private final static String TEXT_AREA_LOCATOR="//label[@lightning-textarea_textarea and text()='%s']";

    public TextArea(WebDriver driver, String label) {
        super(driver, label);
    }
    public void setText (String value){
        WebElement textAreaElement = driver.findElement(By.xpath(String.format(TEXT_AREA_LOCATOR,label)));
        if(Objects.nonNull(value)){
            scrollIntoView(textAreaElement);
            log.debug("'Setting %s input value = %s', label, value");
            textAreaElement.sendKeys(value);
        }
    }

}
