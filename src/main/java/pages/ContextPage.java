package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextPage {
    private WebDriver driver;


    public ContextPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContextMenu() {
        Actions actions = new Actions(driver);

        WebElement contextMenu = driver.findElement(By.id("hot-spot"));
        actions.moveToElement(contextMenu).contextClick().perform();
    }

    public void alert_acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
}
