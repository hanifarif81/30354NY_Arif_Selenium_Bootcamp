package test_web_element;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import web_element.IFrames;

public class TestIFrames extends BasePage {
    IFrames iFrames;

    @Test
    public void testIFrames(){
       iFrames = new IFrames();

       iFrames.iFrameFrame();
        Assert.assertTrue(iFrames.mainClassToActionButton());
    }

}
