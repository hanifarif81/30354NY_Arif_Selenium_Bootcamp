package test_web_element;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import web_element.TextArea;

public class TestTextArea extends BasePage {
    TextArea textArea;

    @Test
    public void testSingleTextArea(){
        textArea = new TextArea();
        String text = "Tom";

        textArea.singleAreaTextInsert(text);
        Assert.assertEquals(text,textArea.mySingleText());
    }
}
