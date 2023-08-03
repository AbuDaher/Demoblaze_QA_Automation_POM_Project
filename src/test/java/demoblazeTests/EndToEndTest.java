package demoblazeTests;
import constants.Constants;
import constants.ErrorMessages;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogInPage;
import pages.MonitorsPage;
import pages.ProductPage;
import utils.Utils;

public class EndToEndTest extends BaseTest{

    private MonitorsPage monitorpage;
    private ProductPage productPage;
    private LogInPage logInPage;

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        monitorpage = new MonitorsPage(driver);
        productPage = new ProductPage(driver);
        logInPage = new LogInPage(driver);
    }

    @Test
    public void EndToEndFlowTest(){
        this.logInPage.logInButtonClick();
        Utils.waitInSeconds(1);
        this.logInPage.logInCredentials();
        Utils.waitInSeconds(2);
        String actualMessage = this.logInPage.isMessageConfirmationDisplayed();
        Assert.assertTrue(actualMessage.contains(Constants.WELCOME_MESSAGE));
        homePage.clickMonitorButton();
        Utils.waitInSeconds(2);
        monitorpage.clickAsusMonitorLink();
        Utils.waitInSeconds(1);
        productPage.clickAddToCartCutton();
        Utils.waitInSeconds(1);
        Assert.assertEquals(Utils.getAlertText(driver), Constants.PRODUCT_ADDED_TEXT,
                ErrorMessages.INCORRECT_ALERT_PRODUCT_ADDED);
        Utils.acceptAlert(driver);
        Utils.waitInSeconds(1);
        cart.clickCartButton();
        homePage.clickPlaceOrderButton();
    }
}
