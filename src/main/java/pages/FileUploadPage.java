package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUploadFile = By.id("file-upload");
    private By uploadFileButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadFileButton).click();
    }

    public void uploadFile(String absoluteFilePath) {
        driver.findElement(fileUploadFile).sendKeys(absoluteFilePath);
        clickUploadButton();
    }

    public String getUploadedFileText() {
        return driver.findElement(uploadedFile).getText();
    }


}
