package Pages;

import Elements.LightningFormattedElement;
import Enums.Rating;
import Enums.Salutation;
import Models.Contact;
import Models.Lead;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage{
    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {

    }

    public Contact getContactInfo() {
        String accountName = new LightningFormattedElement(driver, "Account Name").getText();
        Contact.ContactBuilder contactBuilder= new Contact.ContactBuilder( "Khobec", Salutation.MS,"Green");
        String phone = new LightningFormattedElement(driver, "Phone").getText();
        if (phone != "") {
            contactBuilder.phone(phone);
        }
        String email = new LightningFormattedElement(driver, "Email").getText();
        if (email != "") {
            contactBuilder.email(email);
        }

        String fullName = new LightningFormattedElement(driver, "Name").getText();
        if (fullName != "") {
            contactBuilder.fullName(fullName);
        }
        String title=new LightningFormattedElement(driver,"Title").getText();
        if (title !=""){
            contactBuilder.title(title);
        }
        String mobile=new LightningFormattedElement(driver,"Mobile").getText();
        if (mobile !=""){
            contactBuilder.mobile(mobile);
        }
        return contactBuilder.build();
    }
}
