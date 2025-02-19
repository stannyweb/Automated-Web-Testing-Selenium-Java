package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLinks("Form Authentication");
        return new LoginPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword() {
        clickLinks("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public DropDownPage clickDropDown() {
        clickLinks("Dropdown");
        return new DropDownPage(driver);
    }

    public HoverPages clickHover() {
        clickLinks("Hovers");
        return new HoverPages(driver);
    }

    public KeyPressPage clickKeyPressPage() {
        clickLinks("Key Presses");
        return new KeyPressPage(driver);
    }

    public HorizontalSlidePage clickHorizontalSlide() {
        clickLinks("Horizontal Slider");
        return new HorizontalSlidePage(driver);
    }

    public AlertsPage clickAlertPage() {
        clickLinks("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUploadPage() {
        clickLinks("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextPage clickContextPage() {
        clickLinks("Context Menu");
        return new ContextPage(driver);
    }

    private void clickLinks(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
