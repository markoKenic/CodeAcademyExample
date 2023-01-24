package tests;

import org.junit.Test;

public class LoginTests extends BaseTest {

    @Test
    public void verifySucessfulLogin(){
        LoginPage LoginPage = new LoginPage(driver);

        loginPage.goTobaseUrl();
        


    }

    
}
