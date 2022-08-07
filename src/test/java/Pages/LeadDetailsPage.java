package Pages;

import Elements.LightningFormattedElement;
import Enums.*;
import Models.Lead;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends BasePage{
    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {

    }
    public Lead getLeadInfo() {
        String company = new LightningFormattedElement(driver, "Company").getText();
        Lead.LeadBuilder leadBuilder = new Lead.LeadBuilder(company, "New","Chornaya");
        String phone = new LightningFormattedElement(driver, "Phone").getText();
        if (phone != "") {
            leadBuilder.phone(phone);
        }
        String email = new LightningFormattedElement(driver, "Email").getText();
        if (email != "") {
            leadBuilder.email(email);
        }
        String rating = new LightningFormattedElement(driver, "Rating").getText();
        if (rating != "") {
            leadBuilder.rating(Rating.fromString(rating));
        }
        String fullName = new LightningFormattedElement(driver, "Name").getText();
        if (fullName != "") {
            leadBuilder.fullName(fullName);
        }
        String title=new LightningFormattedElement(driver,"Title").getText();
        if (title !=""){
            leadBuilder.title(title);
        }
        String website=new LightningFormattedElement(driver,"Website").getText();
        if (website !=""){
            leadBuilder.website(website);
        }
        String city=new LightningFormattedElement(driver,"City").getText();
        if (city !=""){
            leadBuilder.city(city);
        }
        return leadBuilder.build();
    }
}

