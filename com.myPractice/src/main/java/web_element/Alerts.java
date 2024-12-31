package web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alerts extends BasePage {

    @FindBy(xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

//region Alert Box
    @FindBy (xpath = "//a[@href=\"/elements/alert\"]")
    public WebElement allertsButton;

    @FindBy (xpath = "//a[@href=\"/elements/alert/alert\"]")
    public WebElement allertBoxButton;

    @FindBy (xpath = "//a[contains(text(), \"Click\")]")
    public WebElement clickTheClickButton;
// endregion

// region Confirmation Box
    @FindBy (xpath = "//a[@href='/elements/alert/confirm']")
    public WebElement confirmationBox;

    @FindBy (xpath = "//a[@class='a-button']")
    public WebElement clickConfirmationClick;

    @FindBy (xpath = "//p[contains(text(), 'Ok')]")
    public WebElement youSelectedText;
//endregion

    public Alerts(){
        PageFactory.initElements(driver,this);
    }
    public void clickAlertsBox(){
        safeClickOnElement(singleUIElements);
        safeClickOnElement(allertsButton);
    }
//region Alert Box
    public void alertBoxOkButton(){
        clickAlertsBox();
        safeClickOnElement(allertBoxButton);
        safeClickOnElement(clickTheClickButton);
    }
//endregion

//region Confirmation Box
    public void confirmationBoxButton(){
        clickAlertsBox();
        safeClickOnElement(confirmationBox);
        safeClickOnElement(clickConfirmationClick);
    }

    public String isTextSelected(){
       return getTrimmedElementText(youSelectedText);
    }
//endregion
}
