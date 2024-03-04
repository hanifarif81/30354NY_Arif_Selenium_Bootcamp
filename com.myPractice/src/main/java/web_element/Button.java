package web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Button extends BasePage {

    @FindBy (xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

    @FindBy (xpath = "//a[@href='/elements/button']")
    public WebElement buttonsDropDown;

    @FindBy (xpath = "//a[@href='/elements/button/disabled']")
    public WebElement disabledButton;

    @FindBy (xpath = "//select[@id='id_select_state']")
    public WebElement selectStateButton;

    @FindBy (xpath = "//input[@id='submit-id-submit']")
    public WebElement enableSubmitButton;

    @FindBy (xpath = "//p[contains(text(),'Submitted')]")
    public WebElement enableSubmittedTextGenerated;

    @FindBy (xpath = "//a[@href=\"/elements/button/like_a_button\"]")
    public WebElement looksLikeButton;

    @FindBy (xpath = "//a[contains(text(),'Click')]")
    public WebElement looksLikeButtonClick;

    @FindBy (xpath = "//p[contains(text(), Submitted)]")
    public WebElement submittedGeneratedLookslikebutton;

    @FindBy (xpath = "//a[contains(text(),'Simple button')]")
    public WebElement simpleButton;

    @FindBy (xpath = "//input[@id=\"submit-id-submit\"]")
    public WebElement simpleButtonClick;

    @FindBy (xpath = "//p[contains(text(),'Submitted')]")
    public WebElement submittedGeneratedSimpleButton;

    public Button(){
        PageFactory.initElements(driver,this);
    }

    public void buttonsDropDown(){
        clickOnElement(singleUIElements);
        clickOnElement(buttonsDropDown);
    }
//  region simple Button
    public void simpleButton(){
        clickOnElement(simpleButton);
    }

    public void simpleButtonClick(){
        clickOnElement(simpleButtonClick);
    }
    public void submittedGenerated(){
        isElementVisible(submittedGeneratedSimpleButton);
    }

    public void simpleButtonClickAndConfirmation(){
        buttonsDropDown();
        simpleButton();
        simpleButtonClick();
        submittedGenerated();
    }

// endregion

//    region Looks Like a BUtton
    public void looksLikeButton(){
        clickOnElement(looksLikeButton);
    }

    public void looksLikeButtonClick(){
        clickOnElement(looksLikeButtonClick);
    }

    public void submittedGeneratedLookslikebutton(){
        isElementVisible(submittedGeneratedLookslikebutton);
    }

    public void looksLikeButtonAndConfirmation(){
        buttonsDropDown();
        looksLikeButton();
        looksLikeButtonClick();
        submittedGeneratedLookslikebutton();
    }

// endregion

//    region Disabled Button
    public void disabledButton(){
        clickOnElement(disabledButton);
    }

    public void selectStateButton(int value){
        selectFromDropdownByIndex(selectStateButton,value);

    }

    public void enableSubmitButton(){
        clickOnElement(enableSubmitButton);
    }

    public void enableSubmittedTextGenerated(){
        isElementVisible(enableSubmittedTextGenerated);
    }

    public void disabledButtonClickedAndConfirmation(int value){
        buttonsDropDown();
        disabledButton();
        selectStateButton(value);
        enableSubmitButton();
        enableSubmittedTextGenerated();
    }
//endregion

}
