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




}
