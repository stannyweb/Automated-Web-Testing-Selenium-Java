package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1 = By.linkText("Example 1: Element on page that is hidden");
    private By example2 = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1 dynamicExample1() {
        driver.findElement(example1).click();
        return new DynamicLoadingExample1(driver);
    }

    public DynamicLoadingExample2 dynamicExample2() {
        driver.findElement(example2).click();
        return new DynamicLoadingExample2(driver);
    }


}
