package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.utils.EnvConstants;
import java.time.Duration;

public class LoginPage extends BasePage{
    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = "[name ='login']")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce-error strong")
    private WebElementFacade loginErrorLabel;

    @FindBy(css = ".woocommerce-LostPassword a")
    private WebElementFacade resetPasswordButton;

    public void setEmailField(String email){
        waitFor(emailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(emailField);
        typeInto(emailField, email);
    }
    public void setPasswordField(String pass){
        typeInto(passwordField, pass);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }
    public boolean checkInvalidLoginMessageDisplayed() {
        return loginErrorLabel.getText().equalsIgnoreCase(EnvConstants.ERROR_MSG);
    }
    public boolean checkUserIsLoggedout(){
        return loginButton.isDisplayed();
    }
    public void navigateToResetPassword(){clickOn(resetPasswordButton);}


}
