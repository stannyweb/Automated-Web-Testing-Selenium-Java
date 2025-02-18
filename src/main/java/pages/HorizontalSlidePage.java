package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSlidePage {
    private WebDriver driver;
    private By slideContainer = By.tagName("input");
    private By range = By.id("range");

    public HorizontalSlidePage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveHorizontalSlider(int numberOfMoves) {
        WebElement slider = driver.findElement(slideContainer);

        for(int i = 0; i <= numberOfMoves; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getRange() {
       return driver.findElement(range).getText();
    }

}
