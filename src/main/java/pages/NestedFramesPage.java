package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private By frameTop = By.cssSelector("[name='frame-top']");
    private By frameLeft = By.cssSelector("[name='frame-left']");
    private By frameBottom = By.cssSelector("[name='frame-bottom']");
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String enterLeftFrame() {
        driver.switchTo().frame(driver.findElement(frameTop));
        driver.switchTo().frame(driver.findElement(frameLeft));
        String text = getTextFromFrame();
        driver.switchTo().defaultContent();
        return text;

    }

    public String enterBottomFrame() {
        driver.switchTo().frame(driver.findElement(frameBottom));
        String text = getTextFromFrame();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getTextFromFrame() {
        return driver.findElement(body).getText();
    }
}
