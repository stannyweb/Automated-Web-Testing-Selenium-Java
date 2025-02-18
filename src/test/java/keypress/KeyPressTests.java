package keypress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSlidePage;
import pages.KeyPressPage;

public class KeyPressTests extends BaseTests {


    public void testBackspace() {
        KeyPressPage keyPressPage = homePage.clickKeyPressPage();

        keyPressPage.keyPressField("S" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressPage.getKeyPressResults(), "You entered: BACK_SPACE", "Incorrect text");
    }

    @Test
    public void testHorizontalSlider() {
        HorizontalSlidePage horizontalSlider = homePage.clickHorizontalSlide();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        horizontalSlider.moveHorizontalSlider(7);
        Assert.assertEquals(horizontalSlider.getRange(), "4", "Incorrect number value");


    }
}
