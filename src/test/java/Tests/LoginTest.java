package Tests;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest {
    @Test
    public void  positiveLoginTest(){
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserIconDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());
    }
}
