package demoblazeTests;
import constants.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;
import utils.Utils;

public class LoginTests extends BaseTest{
    private LogInPage logInPage;

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        logInPage = new LogInPage(driver);
    }

    @Test
    public void loginTest()  {
        this.logInPage.logInButtonClick();
        Utils.waitInSeconds(1);
        this.logInPage.logInCredentials();
        Utils.waitInSeconds(2);
        String actualMessage = this.logInPage.isMessageConfirmationDisplayed();
        Assert.assertTrue(actualMessage.contains(Constants.WELCOME_MESSAGE));
    }


}
