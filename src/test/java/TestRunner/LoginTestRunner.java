package TestRunner;

import Config.Setup;
import orderPage.LoginPage;
import orderPage.SearchPage;
import org.testng.annotations.Test;

public class LoginTestRunner extends Setup {
    @Test(priority = 1,description="Login With Valid Credential")
    public void doLoginWithValidCred() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginEntryPage();
        Thread.sleep(500);

    }
}
