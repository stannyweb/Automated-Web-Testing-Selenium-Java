package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void scrollToTableTest() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void scrollInfiniteTest() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
