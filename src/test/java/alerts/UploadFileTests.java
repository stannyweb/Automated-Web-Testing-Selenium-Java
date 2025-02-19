package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTests extends BaseTests {

    @Test
    public void uploadFileTest() {
        var fileUpload = homePage.clickFileUploadPage();
        fileUpload.uploadFile("S:/karanokyoukai/selenium/AutomatedWebTestingSelenium/src/main/java/pages/DropDownPage.java");

        Assert.assertEquals(fileUpload.getUploadedFileText(), "DropDownPage.java", "incorrect text");
    }
}
