package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.checkUserIsLoggedIn(EnvConstants.USER_NAME);
    }

    @Test
    public void loginWithInValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("asd@asd.asd", EnvConstants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.checkInvalidLoginMessageDisplayed();
    }

    @Test
    public void logoutTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        loginSteps.clickLogout();
        loginSteps.checkUserIsLoggedout();
    }
    @Test
    public void resetPasswortTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.navigateToResetPassword();
        loginSteps.setResetPasswordEmailField(EnvConstants.USER_EMAIL);
        loginSteps.clickOnResetPassword();
        loginSteps.checkResetPasswordEmailSent();
    }
}
