package demoblazeTests;
import constants.Constants;
import constants.ErrorMessages;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignUpPage;
import utils.Utils;

public class SignUpTests extends BaseTest{

    private SignUpPage signUpPage;
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        this.signUpPage = new SignUpPage(driver);
    }

    @Test(priority = 1)
    public void signUpTest(){
        //Arrange

        //Act
        this.homePage.clickSignUpButton();
        Utils.waitInSeconds(1);
        this.signUpPage.clickInputValidCredentials();
        Utils.waitInSeconds(2);

        //Assert
        String expectedMessage = Constants.SIGN_UP_SUCCESSFUL_MESSAGE;
        String actualMessage = Utils.getAlertText(driver);
        Assert.assertEquals(expectedMessage, actualMessage);
        Utils.waitInSeconds(2);
        this.driver.switchTo().alert().accept();
        Utils.waitInSeconds(1);
    }
    @Test(priority = 3)
    public void SignUpIsDisplayed(){
        this.homePage.clickSignUpButton();
        Utils.waitInSeconds(1);
        Assert.assertTrue(this.signUpPage.isSignUpButtonDisplayed(), ErrorMessages.SIGN_UP_BUTTON_NOT_DISPLAYED);
    }

    @Test
    public void signUpIsDisplayedTitleCorrect(){
        this.homePage.clickSignUpButton();
        Utils.waitInSeconds(1);
        String actualMessage = signUpPage.signUpTitleIsDisplayed();
        String expectedMessage = Constants.SIGN_UP_TITLE;
        Assert.assertEquals(actualMessage, expectedMessage, ErrorMessages.SIGN_UP_TITLE);
    }

    @Test
    public void signUpIsDisplayedTitleWrong(){
        this.homePage.clickSignUpButton();
        Utils.waitInSeconds(1);
        String actualMessage = signUpPage.signUpTitleIsDisplayed();
        String expectedMessage = Constants.SIGN_UP_TITLE_WRONG;

        Assert.assertNotEquals(actualMessage, expectedMessage, ErrorMessages.SIGN_UP_TITLE);
    }

    @Test(priority = 2)
    public void SignUpNoUserNoPassword(){
        this.homePage.clickSignUpButton();
        Utils.waitInSeconds(1);
        this.signUpPage.signUpButtonClick();
       Utils.waitInSeconds(1);
        String expectedMessage = ErrorMessages.ALERT_BOX_MESSAGE_WHEN_NO_USER_NO_PASSWORD;
        String actualMessage = Utils.getAlertText(driver);
        Assert.assertEquals(expectedMessage, actualMessage, ErrorMessages.INCORRECT_ALERT_BOX_MESSAGE);
        Utils.acceptAlert(driver);
    }
    @Test
    public void SignUpWithPasswordNoUser(){
        this.homePage.clickSignUpButton();
        Utils.waitInSeconds(1);
        this.signUpPage.signUpButtonClick();
        Utils.waitInSeconds(1);
        String expectedMessage = ErrorMessages.INCORRECT_ALERT_BOX_MESSAGE_NO_USER;
        String actualMessage = Utils.getAlertText(driver);
        Assert.assertEquals(expectedMessage, actualMessage, ErrorMessages.INCORRECT_ALERT_BOX_MESSAGE);
        Utils.acceptAlert(driver);
    }

    @Test(priority = 5)
    public void SignWithUserNoPassword(){
        this.homePage.clickSignUpButton();
        Utils.waitInSeconds(1);
        this.signUpPage.signUpButtonClick();
        Utils.waitInSeconds(1);
        String expectedMessage = ErrorMessages.INCORRECT_ALERT_BOX_MESSAGE_NO_PASSWORD;
        String actualMessage = Utils.getAlertText(driver);
        Assert.assertEquals(expectedMessage, actualMessage, ErrorMessages.INCORRECT_ALERT_BOX_MESSAGE);
        Utils.acceptAlert(driver);
    }

    @Test(priority = 4)
    public void signUpButtonColorTest(){
        this.homePage.clickSignUpButton();
        Utils.waitInSeconds(1);
        String expectedColor = Constants.BLUE_COLOR;
        String actualColor = this.signUpPage.getColor();
        Assert.assertEquals(actualColor,expectedColor, ErrorMessages.SIGN_UP_COLOR);
        System.out.println(actualColor);
    }
}
