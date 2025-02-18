package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoverPages;

public class HoverTests extends BaseTests {

    @Test
    public void hoverTest() {
        HoverPages hoverPage = homePage.clickHover();
        HoverPages.FigureCaption caption = hoverPage.hoverOverFigure(0);


        try {
            Thread.sleep(2000); // Пауза от 2 секунди
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }


}
