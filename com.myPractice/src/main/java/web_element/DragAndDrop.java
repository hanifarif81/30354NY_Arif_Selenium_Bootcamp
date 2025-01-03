package web_element;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop extends BasePage {
//region Boxes Drag and Drop Webelements
    @FindBy(xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

    @FindBy (xpath = "//a[@href=\"/elements/dragndrop\"]")
    public WebElement dragAndDropButton;

    @FindBy (xpath = "//a[@href=\"/elements/dragndrop/boxes\"]")
    public WebElement boxesButton;

    @FindBy (id = "rect-draggable")
    public WebElement dragMeButton;

    @FindBy (id = "rect-droppable")
    public WebElement dropHereButton;

    @FindBy (xpath = "//div[@id='rect-droppable']//p[contains(text(),\"Dropped!\")]")
    public WebElement textDroped;
//endregion
// region Images Drag and Drop Webelements

    @FindBy (xpath = "//a[@href='/elements/dragndrop/images']")
    public WebElement imagesButton;

    @FindBy (id = "rect-droppable1")
    public WebElement imageDragable;

    @FindBy (id = "rect-droppable2")
    public WebElement imageDroppable;

    @FindBy (xpath = "//div[@id='rect-droppable2']/p[contains(text(),'Dropped!')]")
    public WebElement imageDroppedConformation;

//endregion
    public DragAndDrop(){
        PageFactory.initElements(driver,this);
    }

    public void dragAndDropButton(){
        safeClickOnElement(singleUIElements);
        safeClickOnElement(dragAndDropButton);
    }
//  region Boxes Drag and Drop
    public void dragMeButton()  {
        safeClickOnElement(boxesButton);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMeButton,dropHereButton).build().perform();
    }

    public String istextDroped()  {
        return getTrimmedElementText(textDroped);
    }
//endregion

//  Region Images Drag and Drop

    public void imageDragAndDrop(){
        dragAndDropButton();
        safeClickOnElement(imagesButton);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(imageDragable,imageDroppable).build().perform();
    }

    public String isImageDropped(){
        return getTrimmedElementText(imageDroppedConformation);
    }


//endregion
}
