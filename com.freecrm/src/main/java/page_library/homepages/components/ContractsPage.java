package page_library.homepages.components;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContractsPage extends BasePage {

    @FindBy (xpath = "//a[@href=\"/contacts\"]")
    public WebElement buttonContactsItem;

    @FindBy (xpath = "//a[@href='/contacts/new']/button[@class='ui linkedin button']")
    public WebElement buttonCreate;

    @FindBy (xpath = "//input[@name='first_name']")
    public WebElement inputFirstName;

    @FindBy (xpath = "//input[@name='last_name']")
    public WebElement inputLastName;

    @FindBy (xpath = "//input[@name='middle_name']")
    public WebElement inputMiddleName;

    @FindBy (xpath = "//div[@name='company']/input[@class='search']")
    public WebElement inputCompany;





    public ContractsPage(){
        PageFactory.initElements(driver,this);
    }
}
