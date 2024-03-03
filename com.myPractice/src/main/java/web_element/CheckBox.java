package web_element;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class CheckBox extends BasePage {


    public CheckBox(){
        PageFactory.initElements(driver,this);
    }
}
