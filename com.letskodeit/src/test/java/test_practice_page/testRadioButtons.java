package test_practice_page;

import base.BasePage;
import org.testng.annotations.Test;
import practice_page.RadioButtonExample;

public class testRadioButtons extends BasePage {
    @Test
    public void testRadioButtonExamples() {
        RadioButtonExample radioButtonExample = new RadioButtonExample();

        radioButtonExample.selectBMWRadioButton();
    }
}
