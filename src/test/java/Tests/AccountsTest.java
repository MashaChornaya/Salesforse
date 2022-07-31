package Tests;

import Pages.AccountsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class   AccountsTest extends BaseTest {
    protected final static String ACCOUNT_NAME="Best account";
    protected final static String ACCOUNT_PHONE = "+375331478523";
    protected final static String ACCOUNT_WEBSITE = "www.web.com";


    private AccountsPage accountsPage;

    @BeforeClass
    public void initialise() {
        accountsPage = new AccountsPage(driver);
    }

    @Test
    public  void createAccountsTest() {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openAccountsTab();
        accountsPage.waitForPageLoaded();
        accountsPage.clickNewAccountButton();
        accountsPage.setAccountNameInput(ACCOUNT_NAME);
        accountsPage.setAccountPhone(ACCOUNT_PHONE);
        accountsPage.setAccountWebsite(ACCOUNT_WEBSITE);
        accountsPage.clickAccountSaveButton();
        accountsPage.waitAccountInfo();
        Assert.assertTrue(accountsPage.isNewAccountInfoDisplayed());
    }
}