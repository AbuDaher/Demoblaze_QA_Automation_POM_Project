package pages;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#login2")
    private WebElement logInButton;

    @FindBy(css="#loginusername")
    private WebElement logInUserName;

    @FindBy(css = "#loginpassword")
    private WebElement logInPassword;

    @FindBy(xpath = "//button[@onclick='logIn()']")
    private WebElement logInClickSubmit;

    @FindBy(xpath = "//a[contains(text(),'Welcome')]")
    private WebElement messageConfirmation;
    public void logInButtonClick(){
        this.logInButton.click();
    }

    public void logInCredentials(){
        this.logInUserName.sendKeys(Constants.USERNAME);
        this.logInPassword.sendKeys(Constants.PASSWORD);
        this.logInClickSubmit.click();
    }
    public String isMessageConfirmationDisplayed(){
        return this.messageConfirmation.getText();
    }
}
