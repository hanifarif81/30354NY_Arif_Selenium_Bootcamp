package login_homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeCRMLoginPage extends BasePage {

    @FindBy (xpath = "//a[starts-with(@href, 'https://ui.freecrm.com')]")
    public WebElement loginButtonFreeCRM;


    public FreeCRMLoginPage(){
        PageFactory.initElements(driver,this);
    }
    public CogmentoLoginPage clickLoginButtonLoginPage(){
        safeClickOnElement(loginButtonFreeCRM);
        return new CogmentoLoginPage();
    }

}
