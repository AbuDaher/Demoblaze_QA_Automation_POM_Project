package demoblazeTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{

    @Test
    public void verifyAboutUsIsDisplayedTest(){
        this.homePage.ScrollToAboutUs();
        Assert.assertTrue(this.homePage.isAboutUsDisplayed());

    }
}
