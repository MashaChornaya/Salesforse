package Pages.Modals;

import Elements.LightningInput;
import Enums.Salutation;
import Models.Lead;
import org.openqa.selenium.WebDriver;


public class NewLeadModal extends BaseModal {
    public NewLeadModal(WebDriver driver) {
        super(driver);
    }
    public void fillForm(Lead inputLead){
        new LightningInput(driver,"First name").setValue(inputLead.getFirstName());
        new LightningInput(driver,"Last name").setValue(inputLead.getLastName());
        new LightningInput(driver,"Company").setValue(inputLead.getCompany());
        new LightningInput(driver,"Phone").setValue(inputLead.getPhone());
        new LightningInput(driver,"Email").setValue(inputLead.getEmail());
        new LightningInput(driver, "Title").setValue(inputLead.getTitle());
        new LightningInput(driver,"Website").setValue(inputLead.getWebsite());
        new LightningInput(driver,"City").setValue(inputLead.getCity());
        new LightningInput(driver,"State/Province").setValue(inputLead.getStateProvince());
        new LightningInput(driver,"Zip/Postal Code").setValue(inputLead.getZipPostalCode());
        new LightningInput(driver,"Country").setValue(inputLead.getCountry());
        new LightningInput(driver,"No. Of Employees").setValue(inputLead.getNoOfEmployees());
        new LightningInput(driver,"Annual Revenue").setValue(inputLead.getAnnualRevenue());

    }
}
