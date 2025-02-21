package navigation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoading().dynamicExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("http://google.com");

    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTabWithTitle("New Window");
    }

    @Test
    public void dynamicNavigationWithKeys() {
        DynamicLoadingExample2 dynamicExample = homePage.clickDynamicLoading().switchToExample2();
        getWindowManager().switchToNewTab();

        Assert.assertTrue(dynamicExample.isButtonDisplayed(), "Start button is not displayed");
    }
}
