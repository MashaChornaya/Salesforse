package Pages.Modals;

import Elements.LightningInput;
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
        new LightningInput(driver,"Fax").setValue(inputAccount.getFax());
        new LightningInput(driver, "Employees").setValue(inputAccount.getEmployees());
        new LightningInput(driver,"Annual Revenue").setValue(inputAccount.getAnnualRevenue());
        new LightningInput(driver,"Description").setValue(inputAccount.getDescription());
        new LightningInput(driver,"Billing Street").setValue(inputAccount.getBillingStreet());
        new LightningInput(driver,"Shipping Street").setValue(inputAccount.getShippingStreet());

    }
}
