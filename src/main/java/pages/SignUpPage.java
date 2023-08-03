package pages;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='sign-username']")
    private WebElement signUsername;
    @FindBy(xpath = "//input[@id='sign-password']")
    private WebElement signPassword;
    @FindBy(xpath = "//button[@onclick='register()']")
    private WebElement registerButton;
    @FindBy(xpath = "//h5[@id='signInModalLabel']")
    private WebElement signUpTitle;
    @FindBy(css = "#nameofuser")
    private WebElement nameOfUser;
    @FindBy(xpath = "//input[@id='loginpassword']")
    private WebElement logInPassword;
    @FindBy(xpath = "(//button[contains(text(),'Close'])[2]")
    private WebElement closeButton;


    public void clickInputValidCredentials(){
        this.signUsername.sendKeys(Constants.generateUsername());
        this.signPassword.sendKeys(Constants.PASSWORD);
        this.registerButton.click();
    }

    public boolean isSignUpButtonDisplayed(){
        return this.registerButton.isDisplayed();
    }

    public void signUpButtonClick(){

        this.registerButton.click();
    }

    public String getUserName(){

        return this.nameOfUser.getText();
    }

    public String signUpTitleIsDisplayed(){

        return this.signUpTitle.getText();
    }

    public String getColor(){
        return this.registerButton.getCssValue("background-color");
    }

    public void insertPassword(){
        this.logInPassword.sendKeys(Constants.PASSWORD);
    }

    public  void insertUsername(){
        this.nameOfUser.sendKeys(Constants.USERNAME);
    }

}
