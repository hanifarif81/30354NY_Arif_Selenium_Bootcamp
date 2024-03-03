package test_web_element;

import base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import web_element.Button;

public class TestButton extends BasePage {
    public Button button;

    @Test()
    public void TestSimpleButton(){
         button =  new Button();

        button.simpleButtonClickAndConfirmation();
        webDriverWait.until(ExpectedConditions.visibilityOf(button.submittedGeneratedSimpleButton));
        Assert.assertTrue(button.submittedGeneratedSimpleButton.isDisplayed());

    }

    @Test()
    public void TestLooksLikeButton(){
        button = new Button();
        button.looksLikeButtonAndConfirmation();

        webDriverWait.until(ExpectedConditions.visibilityOf(button.submittedGeneratedLookslikebutton));
        Assert.assertTrue(button.submittedGeneratedLookslikebutton.isDisplayed());

    }

    @Test()
    public void TestDisabledButton(){
        button = new Button();
//        String value = "Enabled";
        button.disabledButtonClickedAndConfirmation(1);

    }
}
