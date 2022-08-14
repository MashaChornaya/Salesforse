package Tests;

import Enums.LeadSource;
import Enums.LeadStatus;
import Enums.Rating;
import Enums.Salutation;
import Models.Lead;
import Pages.LeadDetailsPage;
import Pages.LeadsPage;
import Pages.Modals.NewLeadModal;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.LeadFactory;


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
    public void createLeadTest(Salutation salutation, String firstName, String lastName,
                               String company, LeadStatus leadStatus, String phone,
                               String email,String title, Rating rating,String website,
                               String city,String stateProvince,String zipPostalCode,
                               String country,String noOfEmployees, String annualRevenue,
                               LeadSource leadSource) throws InterruptedException {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openLeadsTab();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();
        // Template
      //  Lead testLead= LeadFactory.getFullInfoLead();
        Lead testLead= Lead.builder().salutation(salutation)
                .firstName(firstName)
                .lastName(lastName)
                .company(company)
                .leadStatus(String.valueOf(leadStatus))
                .phone(phone)
                .email(email)
                .title(title)
                .rating(rating)
                .website(website)
                .city(city)
                .stateProvince(stateProvince)
                .zipPostalCode(zipPostalCode)
                .country(country)
                .noOfEmployees(noOfEmployees)
                .annualRevenue(annualRevenue)
                .leadSource(leadSource)
                .build();
        newLeadModal.fillForm(testLead);
        newLeadModal.clickSaveButton();
       // Assert.assertTrue(leadsPage.isConfirmationPopupPresent());
        Assert.assertEquals(leadDetailsPage.getLeadInfo(), testLead);
    }
    @DataProvider()
    public Object[][] createLeadTestData(){
        return new Object[][]{
                {"Ms.","Masha","Chornaya","TMS","Working","4654135486",
                        "aswdak@gmail.com","Yhik","Hot","www.google.com",
                        "Minsk","Miskaya state","220852","Belarus",
                        "50","lalalal","lakl"},
                {"","","Chornaya","TMS","Working","","","","","","","","","","","",""},
                {"Ms.","Masha","Chornaya","TMS","Working","4654135486",
                        "aswdak@gmail.com","Yhik","Hot","www.google.com"}
        };
    }



}
