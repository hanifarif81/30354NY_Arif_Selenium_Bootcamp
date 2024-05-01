package web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTab extends BasePage {

    @FindBy(xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

    @FindBy (xpath = "//a[@href='/elements/new_tab']")
    public WebElement newTabButton;

// region New Tab Link locators
    @FindBy (xpath = "//a[@href='/elements/new_tab/link']")
    public WebElement newTabLinkButton;

    @FindBy (xpath = "//a[@href='/elements/new_tab/new_page']")
    public WebElement newPageWillBeOpenLink;

    @FindBy (xpath = "//div[@id='result']/p[@id='result-text']")
    public WebElement iAmNewPageText;
// endregion

// region New Tab Button locators
    @FindBy (xpath = "//a[@href='/elements/new_tab/button']")
    public WebElement newTabButtonButton;

    @FindBy (xpath = "//a[@href='/elements/new_tab/new_page']")
    public WebElement buttonNewTabClick;

    @FindBy (id = "result-text")
    public WebElement iAmNewPageTabButton;
// endregion

    public NewTab(){
        PageFactory.initElements(driver,this);
    }

    public void newTab(){
        safeClickOnElement(singleUIElements);
        safeClickOnElement(newTabButton);
    }
//  region New Tax Link
    public void newTabLink(){
        newTab();
        safeClickOnElement(newTabLinkButton);
        safeClickOnElement(newPageWillBeOpenLink);

    }
    public boolean iamNewPageText(){
        return isElementVisible(iAmNewPageText);
    }
// endregion

//region New Tab Button
    public void newTabButton(){
        newTab();
        safeClickOnElement(newTabButtonButton);
        safeClickOnElement(buttonNewTabClick);
    }
    public boolean iamNewPageButton(){
        return isElementVisible(iAmNewPageTabButton);
    }

//endregion

}
