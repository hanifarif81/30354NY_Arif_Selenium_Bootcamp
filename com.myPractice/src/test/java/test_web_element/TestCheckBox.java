package test_web_element;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import web_element.CheckBox;

public class TestCheckBox extends BasePage {
    CheckBox checkBox;
    @Test
    public void testSingleCheckBox(){
       checkBox = new CheckBox();

       checkBox.singleCheckBoxClickedAndConfirmation();
        Assert.assertTrue(checkBox.selectMeOrNotGeneratedText.isDisplayed());
    }

    @Test
    public void testCheckBoxes(){
        checkBox = new CheckBox();

        checkBox.buttonsDropDown();
        Assert.assertTrue(checkBox.selectCheckBoxesGeneratedText.isDisplayed());
    }
}
