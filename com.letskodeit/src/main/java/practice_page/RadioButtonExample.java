package practice_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonExample extends BasePage {
    @FindBy (id = "bmwradio")
    public WebElement radioButtonBMW;

    @FindBy (id = "benzradio")
    public WebElement radioButtonBenz;

    @FindBy (id = "hondaradio")
    public WebElement radioButtonHonda;



    public RadioButtonExample(){
        PageFactory.initElements(driver,this);
    }

    public void selectBMWRadioButton(){
        safeClickOnElement(radioButtonBMW);
    }

    public void selectBenzRadioButton(){
        safeClickOnElement(radioButtonBenz);
    }

    public void selectHondaRadioButton(){
        safeClickOnElement(radioButtonHonda);
    }



}
