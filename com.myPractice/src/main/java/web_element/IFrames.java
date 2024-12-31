package web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IFrames extends BasePage {


    @FindBy(xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

    @FindBy (xpath = "//li[@class='active']/a[@href='/elements/iframe/iframe_page']")
    public WebElement iFrameButton;

    @FindBy (xpath = "//iframe[@src='/elements/iframe/iframe_album']")
    public WebElement iFrameFrame;

    @FindBy (xpath = "//a[text()='Main call to action'] [@class=\"btn btn-primary my-2\"]")
    public WebElement mainClassToActionButton;


    public IFrames(){
        PageFactory.initElements(driver,this);
    }

//    public void iFrameButtonClick(){
//        safeClickOnElement(singleUIElements);
//        safeClickOnElement(iFrameButton);
//    }
    public void iFrameFrame(){
//        safeClickOnElement(singleUIElements);
//        jsClickOnElement(iFrameButton);
//        webDriverWait.until(ExpectedConditions.visibilityOf(iFrameFrame));
        driver.switchTo().frame(iFrameFrame);
    }
    public boolean mainClassToActionButton(){
        return isElementVisible(mainClassToActionButton);
    }


}
