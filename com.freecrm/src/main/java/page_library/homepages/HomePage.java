package page_library.homepages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page_library.login_homepage.LoginPage;

public class HomePage extends BasePage {
    @FindBy (xpath = "//div/span[contains(text(),'Sami Sheikh')]")
    public WebElement usersFullName;

    @FindBy (xpath = "//div[@role='listbox']")
    public WebElement listBoxDropdown;

    @FindBy (xpath = "//a[span[contains(text(), 'Log Out')]]")
    public WebElement logOutButton;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void userFullNameText(){
        isElementVisible(usersFullName);
    }

    public void clickListBoxDropdown(){
        safeClickOnElement(listBoxDropdown);
    }

    public void clickLogOutButton(){
        safeClickOnElement(logOutButton);
    }

    public LoginPage logOut(){
        clickListBoxDropdown();
        clickLogOutButton();
        return new LoginPage();
    }
}
