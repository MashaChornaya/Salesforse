package Pages;

import Elements.LightningFormattedElement;
import Enums.Industry;
import Enums.Rating;
import Enums.Type;
import Models.Account;
import Models.Lead;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {

    public AccountDetailsPage(WebDriver driver) {

        super(driver);
    }

    @Override
    public void waitForPageLoaded() {

    }
    public Account getAccountInfo() {
        String parentAccount = new LightningFormattedElement(driver, "Parent Account").getText();
        Account.AccountBuilder accountBuilder =Account.builder().parentAccount(parentAccount);
        String phone = new LightningFormattedElement(driver, "Phone").getText();
        if (phone != "") {
            accountBuilder.phone(phone);
        }
        String fax = new LightningFormattedElement(driver, "Fax").getText();
        if (fax != "") {
            accountBuilder.fax(fax);
        }
        String website = new LightningFormattedElement(driver, "Website").getText();
        if (website != "") {
            accountBuilder.website(website);
        }
        String type = new LightningFormattedElement(driver, "Type").getText();
        if (type != "") {
            accountBuilder.type(Type.fromString(type));
        }
        String employees = new LightningFormattedElement(driver, "Employees").getText();
        if (employees != "") {
            accountBuilder.employees(employees);
        }
        String industry = new LightningFormattedElement(driver, "Industry").getText();
        if (industry != "") {
            accountBuilder.industry(Industry.fromString(industry));
        }
        String annualRevenue = new LightningFormattedElement(driver, "Annual Revenue").getText();
        if (annualRevenue != "") {
            accountBuilder.annualRevenue(annualRevenue);
        }
        return accountBuilder.build();
    }
}
