package Pages.Modals;

import Elements.LightningCombobox;
import Elements.LightningInput;
import Elements.TextArea;
import Models.Account;
import Models.Lead;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;

public class NewAccountModal extends BaseModal {
    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
    }
    public void fillForm(Account inputAccount){
        new LightningInput(driver,"Account Name").setValue(inputAccount.getAccountName());
        new LightningInput(driver,"Phone").setValue(inputAccount.getPhone());
        new LightningInput(driver,"Parent account").setValue(inputAccount.getParentAccount());
        new LightningInput(driver,"Website").setValue(inputAccount.getWebsite());
        new LightningCombobox(driver,"Type").selectByVisibleText(String.valueOf(inputAccount.getType()));
        new LightningCombobox(driver,"Industry").selectByVisibleText(String.valueOf(inputAccount.getIndustry()));
        new LightningInput(driver,"Fax").setValue(inputAccount.getFax());
        new LightningInput(driver, "Employees").setValue(inputAccount.getEmployees());
        new LightningInput(driver,"Annual Revenue").setValue(inputAccount.getAnnualRevenue());
        new TextArea(driver,"Description").setText(inputAccount.getDescription());
        new TextArea(driver,"Billing Street").setText(inputAccount.getBillingStreet());
        new TextArea(driver,"Shipping Street").setText(inputAccount.getShippingStreet());
    }
}
