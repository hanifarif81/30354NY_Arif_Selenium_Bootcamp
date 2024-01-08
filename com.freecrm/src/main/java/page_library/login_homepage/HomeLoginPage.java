package page_library.login_homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLoginPage extends BasePage {

    @FindBy (xpath = "//a[starts-with(@href, 'https://ui.freecrm.com')]")
    public WebElement loginButtonFreeCRM;


    public HomeLoginPage(){
        PageFactory.initElements(driver,this);
    }
    public void clickLoginButtonLoginPage(){
        safeClickOnElement(loginButtonFreeCRM);
    }


}
