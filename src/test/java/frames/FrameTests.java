package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NestedFramesPage;
import pages.WysiwigEditorPage;

public class FrameTests extends BaseTests {

    @Test
    public void wysiWigTest() {
        String text = "hello ";
        String text2 = "world";

        WysiwigEditorPage editorPage = homePage.clickWysiwigEditorPage();

        editorPage.clearTextArea();
        editorPage.setTextArea(text);
        editorPage.increaseIndent();
        editorPage.setTextArea(text2);

        Assert.assertEquals(editorPage.getTextFromEditor(), text + text2, "Incorrect Text message");

    }

    @Test
    public void nestedFramesTests() {
        NestedFramesPage nestedFrames = homePage.clickNestedFrames();

        Assert.assertEquals(nestedFrames.enterLeftFrame(), "LEFT", "Incorrect Text from left frame");
        Assert.assertEquals(nestedFrames.enterBottomFrame(), "BOTTOM", "Incorrect Text from left frame");
    }
}
