package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.fasttrackit.utils.EnvConstants;

public class MyAccountPage extends BasePage {
    @FindBy(css = ".woocommerce-MyAccount-content strong")
    private WebElementFacade loginHelloMessageElement;
    @FindBy(css = ".woocommerce-MyAccount-content a")
    private WebElementFacade logoutLink;
    @FindBy(id = "user_login")
    private WebElementFacade resetPasswordUsernameAndEmailField;
    @FindBy(css = ".woocommerce-Button ")
    private WebElementFacade resetPasswordButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade messageLabel;

    public boolean checkUserLoggedIn(String userName) {
        return loginHelloMessageElement.getText().equalsIgnoreCase(userName);
    }

    public boolean checkUserIsRegistred() {
        return loginHelloMessageElement.isDisplayed();
    }

    public void clickLogoutLink() {
        clickOn(logoutLink);
    }

    public void setResetPasswordEmailField(String email) {
        typeInto(resetPasswordUsernameAndEmailField, email);
    }
    public void clickOnResetPassword(){
        clickOn(resetPasswordButton);
    }
    public boolean checkResetPasswordEmailSent(){
        return messageLabel.getText().equalsIgnoreCase(EnvConstants.RESET_PASSWORD_SUCCES_MSG);
    }
}
