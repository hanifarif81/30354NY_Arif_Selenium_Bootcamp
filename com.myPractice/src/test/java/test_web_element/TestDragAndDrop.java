package test_web_element;

import base.BasePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import web_element.DragAndDrop;

public class TestDragAndDrop extends BasePage {

    DragAndDrop dragAndDrop;
    Actions actions;

    @Test
    public void testBoxesDroped()   {
        dragAndDrop = new DragAndDrop();

        dragAndDrop.dragAndDropButton();
        dragAndDrop.dragMeButton();

        Assert.assertTrue(dragAndDrop.istextDroped());
    }

}
