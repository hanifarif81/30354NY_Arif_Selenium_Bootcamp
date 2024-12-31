package web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop extends BasePage {

    @FindBy(xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

    @FindBy (xpath = "//a[@href=\"/elements/dragndrop\"]")
    public WebElement dragAndDropButton;

    @FindBy (xpath = "//a[@href=\"/elements/dragndrop/boxes\"]")
    public WebElement boxesButton;

    @FindBy (id = "rect-droppable")
    public WebElement dragMeButton;

    @FindBy (id = "rect-draggable")
    public WebElement dropHereButton;

    @FindBy (id = "//p[contains(text(),\"Dropped!\")]")
    public WebElement textDroped;

    public DragAndDrop(){
        PageFactory.initElements(driver,this);
    }

    public void dragAndDropButton(){
        safeClickOnElement(singleUIElements);
        safeClickOnElement(dragAndDropButton);
        safeClickOnElement(boxesButton);
    }

    public void dragMeButton()  {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMeButton,dropHereButton).build().perform();
    }


    public boolean istextDroped()  {
        return isElementVisible(textDroped);
    }
}
