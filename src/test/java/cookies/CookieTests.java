package cookies;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CookieManager;

public class CookieTests extends BaseTests {

    @Test
    public void deleteCookieTest() {
        CookieManager cookieManager = getCookieManager();
        Cookie cookie = cookieManager.cookieBuild("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);

        Assert.assertFalse(cookieManager.isCookiePresent(cookie), "The cookie was not deleted");
    }
}
