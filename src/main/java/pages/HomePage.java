package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@id='signin2']")
    private WebElement signUpButton;

    @FindBy(xpath = "//b[contains(text(), 'About Us')]")
    private WebElement aboutUs;

    @FindBy (xpath = "//a[contains(text(),'Monitors')]")
    private WebElement monitorButton;

    @FindBy(xpath = "//button[contains(text(), 'Place Order')]")
    private WebElement placeOrderButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUpButton(){
        clickElement(signUpButton);
    }

    public boolean isAboutUsDisplayed(){

        return aboutUs.isDisplayed();
    }

    public void ScrollToAboutUs(){

//        Utils.scrollToElement(, driver);
    }

    public void clickMonitorButton(){
        monitorButton.click();
    }

    public void clickPlaceOrderButton(){

        placeOrderButton.click();
    }
}
