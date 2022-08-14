package Tests;

import Enums.Industry;
import Enums.Salutation;
import Enums.Type;
import Models.Account;
import Models.Lead;
import Pages.AccountDetailsPage;
import Pages.AccountsPage;
import Pages.Modals.NewAccountModal;
import Pages.Modals.NewLeadModal;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.security.Provider;

public class   AccountsTest extends BaseTest {

    private AccountsPage accountsPage;
    private NewAccountModal newAccountModal;
    private AccountDetailsPage accountDetailsPage;

    @BeforeClass
    public void initialise() {

        accountsPage = new AccountsPage(driver);
        newAccountModal= new NewAccountModal(driver);
        accountDetailsPage=new AccountDetailsPage(driver);
    }
    //@Data Provider

    @Test
    public  void createAccountsTest() {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openAccountsTab();
        accountsPage.waitForPageLoaded();
        accountsPage.clickNewAccountButton();

        // Template
        Account testAccount= Account.builder().parentAccount("Best account")
                .phone("6514541")
                .fax("4564lo")
                .website("www.bst.com")
                .type(Type.ANALYST)
                .industry(Industry.MEDIA)
                .employees("Sasha")
                .annualRevenue("1000000$")
                .description("We are the best")
                .build();
        newAccountModal.fillForm(testAccount);
        newAccountModal.clickSaveButton();
        Assert.assertEquals(accountDetailsPage.getAccountInfo(), testAccount);

    }
}