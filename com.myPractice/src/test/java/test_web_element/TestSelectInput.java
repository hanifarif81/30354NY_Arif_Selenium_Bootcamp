package test_web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import web_element.SelectInputs;

public class TestSelectInput extends BasePage {
    SelectInputs selectInputs;
    @Test
    public void testSingleSelect() {
         selectInputs = new SelectInputs();

//        selectInputs.chooseLanguagebyValue("1");
//        selectInputs.chooseLanguagebyIndex(3);
        String text = selectInputs.chooseLanguagebyText("C#");

        Assert.assertEquals(selectInputs.textYouSelectedSingleSelect.getText(),text);

    }

    @Test
    public void testMultiSelects(){
        selectInputs = new SelectInputs();

        WebElement actualText = selectInputs.choosePlaceYouWantToGO("Sea","Bus","Tomorrow");
        Assert.assertEquals(actualText.getText(),selectInputs.textYouSelectedMultiSelects.getText());

    }


}
