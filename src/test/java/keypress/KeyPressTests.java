package keypress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressPage;

public class KeyPressTests extends BaseTests {

    @Test
    public void testBackspace() {
        KeyPressPage keyPressPage = homePage.clickKeyPressPage();

        keyPressPage.keyPressField("S" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressPage.getKeyPressResults(), "You entered: BACK_SPACE", "Incorrect text");
    }
}
