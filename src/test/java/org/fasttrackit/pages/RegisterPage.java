package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class RegisterPage extends BasePage {
    @FindBy(id = "reg_email")
    private WebElementFacade emailField;

    public void setEmailField(String email) {
        waitFor(emailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(emailField);
        typeInto(emailField, email);
    }

    @FindBy(id = "reg_password")
    private WebElementFacade passwordField;

    public void setPasswordField(String pass) {
        typeInto(passwordField, pass);
    }

    @FindBy(css = ".woocommerce-FormRow .woocommerce-Button")
    private WebElementFacade registerButton;

    public void clickLoginButton() {
        clickOn(registerButton);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }
}
