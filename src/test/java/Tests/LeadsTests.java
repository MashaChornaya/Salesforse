package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.LeadsPage;

public class LeadsTests extends BaseTest {
    protected final static String FIRST_NAME_LEAD="Masha";
    protected final static String LAST_NAME_LEAD = "Chornaya";
    protected final static String COMPANY_LEAD = "BestComp";
    
    private LeadsPage leadsPage;

    @BeforeClass
    public void initialise() {
        leadsPage = new LeadsPage(driver);
    }
    
    @Test
    public void createLeadTest()  {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openLeadsTab();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();
        leadsPage.clickLeadStatusButton();
        leadsPage.clickLeadStatusOption();
        leadsPage.clickSalutationButton();
        leadsPage.clickSalutationOption();
        leadsPage.setFirstNameInput(FIRST_NAME_LEAD);
        leadsPage.setLastNameInput(LAST_NAME_LEAD);
        leadsPage.setCompanyInput(COMPANY_LEAD);
        leadsPage.clickSaveLeadButton();
        leadsPage.waitLeadInfo();
        Assert.assertTrue(leadsPage.isNewLeadInfoDisplayed());
    }
}
