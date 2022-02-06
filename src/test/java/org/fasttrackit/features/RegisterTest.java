package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.fasttrackit.utils.Helpers;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithValidCredentialsTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.enterCredentials(Helpers.generateRandomEmail(), EnvConstants.USER_PASS);
        registerSteps.clickRegister();
        registerSteps.checkUserIsRegistred();
    }
    @Test
    public void registerWithInvalidCredentialsTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.enterCredentials("", EnvConstants.USER_PASS);
        registerSteps.clickRegister();
        loginSteps.checkInvalidLoginMessageDisplayed();
    }

}
