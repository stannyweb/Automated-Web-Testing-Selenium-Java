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

    private void clickLinks(String linkText) {
         driver.findElement(By.linkText(linkText)).click();
    }

}
