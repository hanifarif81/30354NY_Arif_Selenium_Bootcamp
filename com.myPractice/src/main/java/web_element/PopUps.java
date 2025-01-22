package web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUps extends BasePage {

    @FindBy(xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

    @FindBy (xpath = "//a[@href=\"/elements/popup\"]")
    public WebElement pupUpButton;

    @FindBy (xpath = "//a[@href=\"/elements/popup/modal\"]")
    public WebElement modalPupUpButton;

    @FindBy (xpath = "//button[contains(text(),'Launch Pop-Up')]")
    public WebElement lunchPopUpbutton;


    public PopUps(){
        PageFactory.initElements(driver,this);
    }




}
