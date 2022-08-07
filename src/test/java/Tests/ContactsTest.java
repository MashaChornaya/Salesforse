package Tests;

import Enums.Salutation;
import Models.Contact;
import Models.Lead;
import Pages.ContactDetailsPage;
import Pages.ContactsPage;
import Pages.LeadDetailsPage;
import Pages.LeadsPage;
import Pages.Modals.NewContactModal;
import Pages.Modals.NewLeadModal;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContactsTest extends  BaseTest {

    private ContactsPage contactsPage;
    private NewContactModal newContactModal;
    private ContactDetailsPage  contactDetailsPage;

    @BeforeClass
    public void initialise() {

        contactsPage = new ContactsPage(driver);
        newContactModal = new NewContactModal(driver);
        contactDetailsPage=new ContactDetailsPage(driver);
    }
    @Test
    public void createContactTest() throws InterruptedException {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openContactsTab();
        contactsPage.waitForPageLoaded();
        contactsPage.clickNewButton();
        // Template
        Contact testContact = new Contact.ContactBuilder("Khobec",Salutation.MS,"Green")
                .firstName("Ann")
                .email("21313213123")
                .phone("6514541")
                .mobile("456321759")
                .title("jhuhp")
                .build();
        newContactModal.fillForm(testContact);
        newContactModal.clickSaveButton();
        Assert.assertEquals(contactDetailsPage.getContactInfo(), testContact);

    }
}
