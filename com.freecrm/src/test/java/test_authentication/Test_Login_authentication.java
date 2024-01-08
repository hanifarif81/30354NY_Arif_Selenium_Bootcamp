package test_authentication;

import base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page_library.homepages.HomePage;
import page_library.login_homepage.LoginPage;
import page_library.login_homepage.HomeLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Login_authentication extends BasePage {

    LoginPage loginPage;

    @Test
    public void test_LoginPage(){
        HomeLoginPage homeLoginPage = new HomeLoginPage();
        homeLoginPage.clickLoginButtonLoginPage();
        loginPage = new LoginPage();
        Assert.assertTrue(isElementVisible(loginPage.logInButton));

    }

    @Test(dataProviderClass = data_providers.LoginDataProviderFreeCRM.class, dataProvider = "testLogin")
    public void testLogIn(String email, String password){
        HomeLoginPage homeLoginPage = new HomeLoginPage();
        homeLoginPage.clickLoginButtonLoginPage();
         loginPage = new LoginPage();
        loginPage.logIn(email,password);
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOf(homePage.usersFullName));
        Assert.assertTrue(isElementVisible(homePage.usersFullName));

    }
    @Test(dataProviderClass = data_providers.LoginDataProviderFreeCRM.class, dataProvider = "testLogin")
    public void testLogOut(String email, String password){
        HomeLoginPage homeLoginPage = new HomeLoginPage();
        homeLoginPage.clickLoginButtonLoginPage();
        loginPage = new LoginPage();
        HomePage homePage = loginPage.logIn(email,password);
        webDriverWait.until(ExpectedConditions.visibilityOf(homePage.usersFullName));
        LoginPage loginPage = homePage.logOut();
        Assert.assertTrue(isElementVisible(loginPage.logInButton));
    }

}
