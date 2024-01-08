package page_library.login_homepage;

import base.BasePage;
import page_library.homepages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//div[contains(text(),'Login')]")
    public WebElement logInButton;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailInputField;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordInputField;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void typeEmail(String email){
        clearSendKeysToElement(emailInputField, email);
    }
    public void typePassword(String password){
        clearSendKeysToElement(passwordInputField,password);
    }

    public void clickLoginButton(){
        safeClickOnElement(logInButton);
    }

    public HomePage logIn(String email, String password){
        typeEmail(email);
        typePassword(password);
        clickLoginButton();
        return new HomePage();
    }

}
