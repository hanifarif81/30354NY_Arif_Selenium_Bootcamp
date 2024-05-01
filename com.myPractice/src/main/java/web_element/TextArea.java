package web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextArea extends BasePage {

    @FindBy(xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

    @FindBy (xpath = "//a[@href='/elements/textarea']")
    public WebElement textAreaButton;

// region Single Textarea
    @FindBy (xpath = "//a[@href='/elements/textarea/single']")
    public WebElement singTextArea;

    @FindBy (xpath = "//textarea[@id='id_text_area']")
    public WebElement insertTextArea;

    @FindBy (id = "submit-id-submit")
    public WebElement singleSubmitButton;

    @FindBy (id = "result-text")
    public WebElement youEnteredText;
//endregion


    public TextArea(){
        PageFactory.initElements(driver,this);
    }

    public void clickTextArea(){
        safeClickOnElement(singleUIElements);
        safeClickOnElement(textAreaButton);
    }
// region single Text Area
    public void singleAreaTextInsert(String text){
        safeClickOnElement(singTextArea);
        clearSendKeysToElement(insertTextArea,text);
        safeClickOnElement(singleSubmitButton);
    }
    public String mySingleText(){
        return getTrimmedElementText(youEnteredText);
    }


//endregion
}
