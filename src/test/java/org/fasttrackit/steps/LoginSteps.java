package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.LoginPage;
import org.junit.Assert;


public class LoginSteps extends BaseSteps {
    @Step
    public void navigateToLoginPage() {
        homePage.clickAccountLink();
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void clickLogout() {
        myAccountPage.clickLogoutLink();
    }

    @Step
    public void enterCredentials(String email, String pass) {
        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
    }

    @Step
    public void doLogin(String user, String pass) {
        navigateToLoginPage();
        enterCredentials(user, pass);
        clickLogin();
    }

    @Step
    public void checkUserIsLoggedIn(String userName) {
        Assert.assertTrue(myAccountPage.checkUserLoggedIn(userName));
    }

    @Step
    public void checkInvalidLoginMessageDisplayed() {
        Assert.assertTrue(loginPage.checkInvalidLoginMessageDisplayed());
    }

    @Step
    public void checkUserIsLoggedout() {
        Assert.assertTrue(loginPage.checkUserIsLoggedout());
    }

    @Step
    public void checkResetPasswordEmailSent() {
        Assert.assertTrue(myAccountPage.checkResetPasswordEmailSent());
    }

    @Step
    public void navigateToResetPasswordPage() {
        loginPage.navigateToResetPassword();
    }

    @Step
    public void setResetPasswordEmailField(String email) {
        myAccountPage.setResetPasswordEmailField(email);
    }

    @Step
    public void clickOnResetPassword() {
        myAccountPage.clickOnResetPassword();
    }


}
