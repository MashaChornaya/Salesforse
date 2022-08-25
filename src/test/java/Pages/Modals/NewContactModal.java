package Pages.Modals;

import Elements.LightningCombobox;
import Elements.LightningInput;
import Models.Contact;
import Models.Lead;
import org.openqa.selenium.WebDriver;

public class NewContactModal extends BaseModal{
    public NewContactModal(WebDriver driver) {
        super(driver);
    }
    public void fillForm(Contact inputContact){
        new LightningCombobox(driver,"Salutation").selectByVisibleText(String.valueOf(inputContact.getSalutation()));
        new LightningInput(driver,"First name").setValue(inputContact.getFirstName());
        new LightningInput(driver,"Last name").setValue(inputContact.getLastName());
        new LightningInput(driver,"Account name").setValue(inputContact.getAccountName());
        new LightningInput(driver,"Phone").setValue(inputContact.getPhone());
        new LightningInput(driver,"Email").setValue(inputContact.getEmail());
        new LightningInput(driver, "Title").setValue(inputContact.getTitle());
        new LightningInput(driver,"Mobile").setValue(inputContact.getMobile());
    }
}
