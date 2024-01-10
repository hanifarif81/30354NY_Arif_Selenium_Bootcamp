package test_authentication;

import base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page_library.homepages.HomePage;
import page_library.login_homepage.LoginPage;
import page_library.login_homepage.HomeLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

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
//    @Test(alwaysRun = true,groups = {"smoke"},dataProviderClass = data_providers.LoginDataProviderFreeCRM.class, dataProvider = "testLogin")
   @Test
    public void testLogOut() throws SQLException {
        databaseInit();
        String email = "SELECT email from free_CRM.test_data WHERE id= 1;";
        String password = "SELECT password from free_CRM.test_data WHERE id= 1;";
        HomeLoginPage homeLoginPage = new HomeLoginPage();
        homeLoginPage.clickLoginButtonLoginPage();
        loginPage = new LoginPage();
        HomePage homePage = loginPage.logIn((db.executeQueryReadOne(email)).toString(), (db.executeQueryReadOne(password)).toString());
        webDriverWait.until(ExpectedConditions.visibilityOf(homePage.usersFullName));
        LoginPage loginPage = homePage.logOut();
        Assert.assertTrue(isElementVisible(loginPage.logInButton));
    }

}
