package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps {
    @Step
    public void navigateToRegisterPage(){
        homePage.clickAccountLink();
    }
    @Step
    public void enterCredentials(String email, String pass){
        registerPage.setEmailField(email);
        registerPage.setPasswordField(pass);
    }
    @Step
    public void clickRegister(){
        registerPage.clickRegisterButton();
    }
    @Step
    public void checkUserIsRegistred(){
        Assert.assertTrue(myAccountPage.checkUserIsRegistred());
    }
}
