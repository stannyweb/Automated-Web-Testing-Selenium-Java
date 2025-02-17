package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

public class DropdownTests extends BaseTests {

    @Test
    public void testDropdownMenu() {
        String option = "Option 1";
        DropDownPage dropdown = homePage.clickDropDown();

        dropdown.selectFromDropDown(option);
        List<String> getSelectedOptions = dropdown.getSelectedOption();

        Assert.assertEquals(getSelectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(getSelectedOptions.contains(option), "Incorrect option selected");

    }
}
