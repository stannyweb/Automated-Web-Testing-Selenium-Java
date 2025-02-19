package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwigEditorPage {
    private WebDriver driver;
    private String enterWysiwigEditor = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.cssSelector("[aria-label='Increase indent;]");

    public WysiwigEditorPage(WebDriver driver) {
        this.driver = driver;

    }

    public void switchToEditArea() {
        driver.switchTo().frame(enterWysiwigEditor);
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increaseIndent() {
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextFromEditor() {
        switchToMainArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToMainArea() {
        driver.switchTo().defaultContent();
    }
}
