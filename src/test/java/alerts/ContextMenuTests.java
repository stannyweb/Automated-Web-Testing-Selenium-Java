package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextPage;

public class ContextMenuTests extends BaseTests {

    @Test
    public void contextMenuTest() {

        ContextPage contextPage = homePage.clickContextPage();
        contextPage.clickContextMenu();
        Assert.assertEquals(contextPage.getAlertText(), "You selected a context menu", "incorrect context text");
        contextPage.alert_acceptAlert();


    }

}
