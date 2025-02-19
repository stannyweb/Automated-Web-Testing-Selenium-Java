package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WysiwigEditorPage;

public class FrameTests extends BaseTests {

    @Test
    public void frameTest() {
        String text = "hello ";
        String text2 = "world";

        WysiwigEditorPage editorPage = homePage.clickWysiwigEditorPage();

        editorPage.clearTextArea();
        editorPage.setTextArea(text);
        editorPage.increaseIndent();
        editorPage.setTextArea(text2);

        Assert.assertEquals(editorPage.getTextFromEditor(), text + text2, "Incorrect Text message");

    }
}
