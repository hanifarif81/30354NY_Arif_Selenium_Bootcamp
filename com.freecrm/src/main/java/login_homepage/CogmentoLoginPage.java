package login_homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CogmentoLoginPage extends BasePage {
    @FindBy(xpath = "//div[contains(text(),'Login')]")
    public WebElement logInButtonCogmetoPage;


    public CogmentoLoginPage(){
        PageFactory.initElements(driver,this);
    }


}
