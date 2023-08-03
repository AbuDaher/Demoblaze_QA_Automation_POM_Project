package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends BasePage{

    @FindBy(css = "#cartur")
    private WebElement cartButton;

    public Cart(WebDriver driver) {
        super(driver);
    }

    public void clickCartButton(){
        cartButton.click();
    }

}
