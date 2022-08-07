package Tests;

import Enums.Salutation;
import Models.Lead;
import Pages.LeadDetailsPage;
import Pages.LeadsPage;
import Pages.Modals.NewLeadModal;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeadsTests extends BaseTest {
    private LeadsPage leadsPage;
    private NewLeadModal newLeadModal;
    private LeadDetailsPage leadDetailsPage;

    @BeforeClass
    public void initialise() {

        leadsPage = new LeadsPage(driver);
        newLeadModal = new NewLeadModal(driver);
        leadDetailsPage=new LeadDetailsPage(driver);
    }
    @Test
    public void createLeadTest() throws InterruptedException {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openLeadsTab();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();
        // Template
        Lead testLead = new Lead.LeadBuilder("TMS","New","Chornaya")
                .email("21313213123")
                .phone("6514541")
                .firstName("Masha")
                .salutation(Salutation.MS)
                .build();
        newLeadModal.fillForm(testLead);
        newLeadModal.clickSaveButton();
       // Assert.assertTrue(leadsPage.isConfirmationPopupPresent());
        Assert.assertEquals(leadDetailsPage.getLeadInfo(), testLead);
    }
}
