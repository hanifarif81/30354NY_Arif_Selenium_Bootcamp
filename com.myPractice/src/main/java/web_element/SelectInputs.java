package web_element;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SelectInputs extends BasePage {

    @FindBy(xpath = "//a[@href='javascript:;']")
    public WebElement singleUIElements;

    @FindBy (xpath = "//a[@href='/elements/select']")
    public WebElement buttonSelect;

    @FindBy (xpath = "//a[@href=\"/elements/select/single_select\"]")
    public WebElement buttonSingleSelect;

    @FindBy (xpath = "//select[@id=\"id_choose_language\"]")
    public WebElement selectChooseLanguageDropdown;

    @FindBy (id = "submit-id-submit")
    public WebElement buttonSingleSelectSubmit;

    @FindBy (id = "result-text")
    public WebElement textYouSelectedSingleSelect;


    @FindBy (xpath = "//a[@href=\"/elements/select/mult_select\"]")
    public WebElement buttonMultiSelects;

    @FindBy (xpath = "//select[@id='id_choose_the_place_you_want_to_go']")
    public WebElement selectPlaceYouWantToGO;

    @FindBy (xpath = "//select[@id=\"id_choose_how_you_want_to_get_there\"]")
    public WebElement selectHowYouWantToGetThere;

    @FindBy (xpath = "//select[@id='id_choose_when_you_want_to_go']")
    public WebElement selectWhenYouWantToGO;

    @FindBy (id = "submit-id-submit")
    public WebElement buttonMultiSelectsSubmit;

    @FindBy (xpath = "//p[@id='result-text']")
    public WebElement textYouSelectedMultiSelects;

    public SelectInputs(){
        PageFactory.initElements(driver,this);
    }

    public void buttonSelectmultiple(){
        safeClickOnElement(singleUIElements);
        safeClickOnElement(buttonSelect);
        safeClickOnElement(buttonMultiSelects);
    }
    public void buttonSelectsingle(){
        safeClickOnElement(singleUIElements);
        safeClickOnElement(buttonSelect);
    }


//    region Multi Select
    public WebElement choosePlaceYouWantToGO(String placeGoing, String howGoing,String whenGoing){
        buttonSelectmultiple();
        selectFromDropdownByVisibleText(selectPlaceYouWantToGO, placeGoing);
        selectFromDropdownByVisibleText(selectHowYouWantToGetThere,howGoing);
        selectFromDropdownByVisibleText(selectWhenYouWantToGO,whenGoing);
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//select[@id='id_choose_when_you_want_to_go']")));
        safeClickOnElement(buttonMultiSelectsSubmit);
       isElementVisible(textYouSelectedMultiSelects);
       return textYouSelectedMultiSelects;
    }

//    endregion



//region Single Select

    public int chooseLanguagebyIndex(int index){
        safeClickOnElement(buttonSingleSelect);
        selectFromDropdownByIndex(selectChooseLanguageDropdown,index);
        safeClickOnElement(buttonSingleSelectSubmit);
        isElementVisible(textYouSelectedSingleSelect);
        return index;
    }
    public String chooseLanguagebyValue(String value){
        safeClickOnElement(buttonSingleSelect);
        selectFromDropdownByValue(selectChooseLanguageDropdown,value);
        safeClickOnElement(buttonSingleSelectSubmit);
        isElementVisible(textYouSelectedSingleSelect);
        return value;
    }
    public String chooseLanguagebyText(String text) {
        safeClickOnElement(buttonSingleSelect);
        selectFromDropdownByVisibleText(selectChooseLanguageDropdown, text);
        safeClickOnElement(buttonSingleSelectSubmit);
         isElementVisible(textYouSelectedSingleSelect);
        return text;
    }

//endregion




}
