package page_library.homepages.components;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends BasePage {

    @FindBy (xpath = "//a[@href=\"/calendar\"]")
    public WebElement buttonCalendarItem;



    public CalendarPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickButtonCalendarItem(){
        safeClickOnElement(buttonCalendarItem);
    }



}
