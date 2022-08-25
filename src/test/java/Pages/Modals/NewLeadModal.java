package Pages.Modals;

import Elements.LightningCombobox;
import Elements.LightningInput;
import Elements.TextArea;
import Enums.Salutation;
import Enums.*;
import Models.Lead;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;

@Log4j2
public class NewLeadModal extends BaseModal {
    public NewLeadModal(WebDriver driver) {
        super(driver);
    }
    public void fillForm(Lead inputLead){
        log.info(String.format("Creating new lead:%s",inputLead));
        new LightningCombobox(driver,"Salutation").selectByVisibleText(String.valueOf(inputLead.getSalutation()));
        new LightningInput(driver,"First name").setValue(inputLead.getFirstName());
        new LightningInput(driver,"Last name").setValue(inputLead.getLastName());
        new LightningInput(driver,"Company").setValue(inputLead.getCompany());
        new LightningCombobox(driver,"Lead Status").selectByVisibleText(String.valueOf(inputLead.getLeadStatus()));
        new LightningInput(driver,"Phone").setValue(inputLead.getPhone());
        new LightningInput(driver,"Email").setValue(inputLead.getEmail());
        new LightningInput(driver, "Title").setValue(inputLead.getTitle());
        new LightningCombobox(driver,"Rating").selectByVisibleText(String.valueOf(inputLead.getRating()));
        new TextArea(driver,"Street").setText(inputLead.getStreet());
        new LightningInput(driver,"Website").setValue(inputLead.getWebsite());
        new LightningInput(driver,"City").setValue(inputLead.getCity());
        new LightningInput(driver,"State/Province").setValue(inputLead.getStateProvince());
        new LightningInput(driver,"Zip/Postal Code").setValue(inputLead.getZipPostalCode());
        new LightningInput(driver,"Country").setValue(inputLead.getCountry());
        new LightningInput(driver,"No. Of Employees").setValue(inputLead.getNoOfEmployees());
        new LightningInput(driver,"Annual Revenue").setValue(inputLead.getAnnualRevenue());
        new LightningCombobox(driver,"Lead Source").selectByVisibleText(String.valueOf(inputLead.getLeadSource()));
        new LightningCombobox(driver,"Industry").selectByVisibleText(String.valueOf(inputLead.getIndustry()));
        new TextArea(driver,"Description").setText(inputLead.getDescription());
    }
}
