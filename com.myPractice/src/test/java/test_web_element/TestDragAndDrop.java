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
        String text = "Dropped!";
        dragAndDrop.dragAndDropButton();
        dragAndDrop.dragMeButton();

        Assert.assertEquals(dragAndDrop.istextDroped(),text);
    }

    @Test
    public void testImageDroped(){
        dragAndDrop = new DragAndDrop();
        String text = "Dropped!";
        dragAndDrop.imageDragAndDrop();

        Assert.assertEquals(dragAndDrop.isImageDropped(),text);
    }

}
