package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1;
import pages.DynamicLoadingExample2;
import pages.DynamicLoadingPage;

public class WaitTests extends BaseTests {
    //Explicit Wait
    @Test
    public void waitUntilHiddenTest() {
        DynamicLoadingExample1 dynamicLoading = homePage.clickDynamicLoading().dynamicExample1();
        dynamicLoading.clickStart();

        Assert.assertEquals(dynamicLoading.getLoadedText(), "Hello World!", "Incorrect dynamic loading text");
    }

    @Test
    public void waitUntilTextIsVisible() {
        DynamicLoadingExample2 dynamicLoading = homePage.clickDynamicLoading().dynamicExample2();
        dynamicLoading.clickStart();

        Assert.assertEquals(dynamicLoading.getLoadedText(), "Hello World!", "Incorrect loaded text");
    }
}
