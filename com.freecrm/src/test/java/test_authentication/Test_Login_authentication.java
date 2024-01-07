package test_authentication;

import base.BasePage;
import login_homepage.CogmentoLoginPage;
import login_homepage.FreeCRMLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Login_authentication extends BasePage {

    FreeCRMLoginPage freeCRMLoginPage;
    @Test
    public void test_Login(){
        freeCRMLoginPage = new FreeCRMLoginPage();
        freeCRMLoginPage.loginButtonFreeCRM.click();
        CogmentoLoginPage cogmentoLoginPage = new CogmentoLoginPage();
        Assert.assertTrue(isElementVisible(cogmentoLoginPage.logInButtonCogmetoPage));
    }

}
