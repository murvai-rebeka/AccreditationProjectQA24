package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.utils.EnvConstants;

import java.time.Duration;
import java.util.Locale;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElementFacade emailField;

    public void setEmailField(String email) {
        waitFor(emailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(emailField);
        typeInto(emailField, email);
    }

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    public void setPasswordField(String pass) {
        typeInto(passwordField, pass);
    }

    @FindBy(css = "[name ='login']")
    private WebElementFacade loginButton;

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    @FindBy(css = ".woocommerce-error strong")
    private WebElementFacade loginErrorLabel;

    public boolean checkInvalidLoginMessageDisplayed() {
        return loginErrorLabel.getText().toLowerCase().contains(EnvConstants.ERROR_MSG.toLowerCase());
    }

    public boolean checkUserIsLoggedout() {
        return loginButton.isDisplayed();
    }

    @FindBy(css = ".woocommerce-LostPassword a")
    private WebElementFacade resetPasswordButton;

    public void navigateToResetPassword() {
        clickOn(resetPasswordButton);
    }


}
