package test_web_element;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import web_element.NewTab;

public class TestNewTab extends BasePage {

    NewTab newTab;

    @Test
    public void testNewTabLink(){
        newTab = new NewTab();

        newTab.newTabLink();

        switchToTab();
        Assert.assertTrue(newTab.iamNewPageText());

    }

    @Test
    public void testNewTabButton(){
        newTab = new NewTab();

        newTab.newTabButton();
        switchToTab();
        Assert.assertTrue(newTab.iamNewPageButton());

    }
}
