package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButtonJS = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerAlertButtonConfirm = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerAlertButtonPrompt = By.xpath("//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    // ALERT FOR JS
    public void clickTriggerAlertJS() {
        driver.findElement(triggerAlertButtonJS).click();
    }

    // ALERT FOR CONFIRM
    public void clickTriggerAlertConfirm() {
        driver.findElement(triggerAlertButtonConfirm).click();
    }

    // ALERT FOR PROMPT
    public void clickTriggerAlertPrompt() {
        driver.findElement(triggerAlertButtonPrompt).click();
    }


    // ACCEPT ALERT
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    // DISMISS ALERT
    public void cancelAlert() {
        driver.switchTo().alert().dismiss();
    }

    // ALERT FOR PROMPT
    public String promptAlert(String inputField) {
        driver.switchTo().alert().sendKeys(inputField);
        return driver.switchTo().alert().getText();
    }

    // GET TEXT AFTER THE ALERT
    public String getAlertText() {
        return driver.findElement(result).getText();
    }
}
