package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextArea extends BaseElement{

    private final static String TEXT_AREA_LOCATOR="//label[text()='%s']";

    public TextArea(WebDriver driver, String label) {
        super(driver, label);
    }
    public void setText (String value){
        WebElement textAreaElement = driver.findElement(By.xpath(String.format(TEXT_AREA_LOCATOR,label)));
        System.out.printf("Setting %s text area = %s", label, value);
        scrollIntoView(textAreaElement);
        textAreaElement.sendKeys(value);
    }

}
