package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By dynamicLink = By.linkText("Example 1: Element on page that is hidden");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1 dynamicExample1() {
        driver.findElement(dynamicLink).click();
        return new DynamicLoadingExample1(driver);
    }
}
