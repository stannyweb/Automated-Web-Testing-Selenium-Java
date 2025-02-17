package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void forgotPasswordTests() {
        ForgotPasswordPage forgotPassword = homePage.clickForgotPassword();
        forgotPassword.retrievePassword("stannyweb@gmail.com");
    }
}
