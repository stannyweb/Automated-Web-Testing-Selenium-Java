package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertTests extends BaseTests {

    @Test
    public void alertAcceptTests() {
        AlertsPage alertPage = homePage.clickAlertPage();
        alertPage.clickTriggerAlertJS();
        alertPage.acceptAlert();

        Assert.assertEquals(alertPage.getAlertText(), "You successfully clicked an alert", "Incorrect alert message");
    }
    @Test
    public void alertConfirmTest() {
        AlertsPage alertPage = homePage.clickAlertPage();
        alertPage.clickTriggerAlertConfirm();
        alertPage.acceptAlert();

        Assert.assertEquals(alertPage.getAlertText(), "You clicked: Ok", "Incorrect Alert Text");
    }

    @Test
    public void alertDismissAlert() {
        AlertsPage alertsPage = homePage.clickAlertPage();
        alertsPage.clickTriggerAlertConfirm();
        alertsPage.cancelAlert();

        Assert.assertEquals(alertsPage.getAlertText(), "You clicked: Cancel", "Incorrect alert message");
    }

    @Test
    public void alertConfirmPromptTest() {
        AlertsPage alertsPage = homePage.clickAlertPage();
        alertsPage.clickTriggerAlertPrompt();
        alertsPage.promptAlert("stannyweb");
        alertsPage.acceptAlert();

        Assert.assertEquals(alertsPage.getAlertText(), "You entered: stannyweb", "incorrect alert text");
    }

    @Test
    public void alertDismissPromptTest() {
        AlertsPage alertsPage = homePage.clickAlertPage();
        alertsPage.clickTriggerAlertPrompt();
        alertsPage.promptAlert("stannyweb");
        alertsPage.cancelAlert();

        Assert.assertEquals(alertsPage.getAlertText(), "You entered: null", "Incorrect alert text");

    }
}
