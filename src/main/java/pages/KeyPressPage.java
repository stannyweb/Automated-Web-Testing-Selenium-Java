package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By result = By.id("result");

    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void keyPressField(String keys) {
        driver.findElement(inputField).sendKeys(keys);
    }

    public String getKeyPressResults() {
        return driver.findElement(result).getText();
    }
}
