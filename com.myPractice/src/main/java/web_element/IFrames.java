package web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IFrames extends BasePage {

    @FindBy(xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

    @FindBy (xpath = "//ul[@class='sub-menu']//a[@href='/elements/iframe/iframe_page']")
    public WebElement iframesButton;

    @FindBy (xpath = "//iframe[@class='embed-responsive-item']")
    public WebElement iFrameFrame;

    @FindBy (xpath = "//a[text()='Main call to action'] [@class=\"btn btn-primary my-2\"]")
    public WebElement iframeMainCallToActionButton;


    public IFrames(){
        PageFactory.initElements(driver,this);
    }

    public void iFrameButtonClick(){
        safeClickOnElement(singleUIElements);
        safeClickOnElement(iframesButton);
    }
    public void iFrameFrame(){
        webDriverWait.until(ExpectedConditions.visibilityOf(iFrameFrame));
        driver.switchTo().frame(iFrameFrame);
    }


}
