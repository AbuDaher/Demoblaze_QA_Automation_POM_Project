package demoblazeTests;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class BaseTest{
    protected WebDriver  driver;
    protected HomePage homePage;
    protected Cart cart;

    @BeforeMethod
    public  void setUp(){
        this.driver = new ChromeDriver();
        this.driver.get(Constants.URL);
        this.driver.manage().window().maximize();
        this.homePage = new HomePage(driver);
        this.cart = new Cart(driver);
    }

    @Test
    public void goToWebsite(){
    }

}
