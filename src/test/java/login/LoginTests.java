package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    @Test
    public void loginTestSuccessful() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        Assert.assertTrue(secureAreaPage.getAlertStatus().contains("You logged into a secure area"), "Missing alert status");
    }
}
