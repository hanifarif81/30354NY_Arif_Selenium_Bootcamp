package test_web_element;

import base.BasePage;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import web_element.Alerts;

public class TestAlerts extends BasePage {

    Alerts alerts;

    @Test
    public void testAlertBox(){
        alerts = new Alerts();

        alerts.alertBoxOkButton();
        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.accept();
    }

    @Test
    public void testConfirmationBox(){
        alerts = new Alerts();
        String text = "Ok";

        alerts.confirmationBoxButton();
        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.accept();

        Assert.assertEquals(text,alerts.isTextSelected());
    }

    @Test
    public void testPromptBoxAllert(){
        alerts = new Alerts();
        String text = "Goood";

        alerts.promptBoxbutton();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();

        Assert.assertEquals(alerts.promptBoxConfermation(text),text);


    }



}
