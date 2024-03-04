package web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox extends BasePage {
    @FindBy(xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

    @FindBy (xpath = "//a[@href='/elements/checkbox']")
    public WebElement buttonCheckBox;

    @FindBy (xpath = "//a[@href=\"/elements/checkbox/single_checkbox\"]")
    public WebElement buttonSingleCheckBox;

    @FindBy (xpath = "//input[@id='id_checkbox_0']")
    public WebElement checkboxSelectMeOrNot;

    @FindBy (id = "submit-id-submit")
    public WebElement buttonSubmitSingleCheckBox;

    @FindBy (id = "result-text")
    public WebElement selectMeOrNotGeneratedText;

    @FindBy (xpath = "//a[@href=\"/elements/checkbox/mult_checkbox\"]")
    public WebElement buttonCheckBoxes;

    @FindBy (xpath = "//input[@id=\"id_checkboxes_0\"]")
    public WebElement checkBoxOne;

    @FindBy (xpath = "//input[@id=\"id_checkboxes_1\"]")
    public WebElement checkBoxTwo;

    @FindBy (xpath = "//input[@id=\"id_checkboxes_2\"]")
    public WebElement checkBoxThree;

    @FindBy (xpath = "//input[@id='submit-id-submit']")
    public WebElement buttonCheckBoxesSubmit;

    @FindBy (xpath = "//p[@id='result-text']")
    public WebElement selectCheckBoxesGeneratedText;

    public CheckBox(){
        PageFactory.initElements(driver,this);
    }

//    region checkBoxes
    public void buttonCheckBoxesClick(){
       safeClickOnElement(checkBoxOne);
       safeClickOnElement(checkBoxTwo);
       safeClickOnElement(checkBoxThree);
    }
    public void buttonsDropDown(){
        safeClickOnElement(singleUIElements);
        safeClickOnElement(buttonCheckBox);
        safeClickOnElement(buttonCheckBoxes);
        buttonCheckBoxesClick();
        safeClickOnElement(buttonCheckBoxesSubmit);
        isElementVisible(selectCheckBoxesGeneratedText);
    }
//endregion




//region single Checkbox

    public void singleCheckBoxClickedAndConfirmation(){
        buttonsDropDown();
        safeClickOnElement(buttonSingleCheckBox);
        safeClickOnElement(checkboxSelectMeOrNot);
        safeClickOnElement(buttonSubmitSingleCheckBox);
        isElementVisible(selectMeOrNotGeneratedText);
    }
//endregion


}
