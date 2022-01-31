package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class CheckoutPage extends BasePage {
    @FindBy(id = "billing_first_name")
    private WebElementFacade setFirstNameField;
    @FindBy(id = "billing_last_name")
    private WebElementFacade setLastNameField;
    @FindBy(id = "billing_address_1")
    private WebElementFacade setAddressField;
    @FindBy(id = "billing_city")
    private WebElementFacade setCityField;
    @FindBy(id = "billing_postcode")
    private WebElementFacade setPostcodeField;
    @FindBy(id = "billing_phone")
    private WebElementFacade setPhoneNumberField;
    @FindBy(id = "place_order")
    private WebElementFacade checkoutButton;
    @FindBy(css = ".woocommerce-notice ")
    private  WebElementFacade checkSuccessfullMsg;

    @FindBy(id = "billing_email")
    private WebElementFacade setCheckOutEmail;

    public void setFirstNameField(String firstName) {
        waitFor(setFirstNameField);
        typeInto(setFirstNameField, firstName);
    }

    public void setSetLastNameField(String lastName) {
        waitFor(setLastNameField);
        typeInto(setLastNameField, lastName);
    }

    public void setAddressField(String streetAddress) {
        waitFor(setAddressField);
        typeInto(setAddressField, streetAddress);
    }

    public void setSetCityField(String nameOfTheCity) {
        waitFor((setCityField));
        typeInto(setCityField, nameOfTheCity);
    }

    public void setPostcodeField(String postCode) {
        waitFor(setPostcodeField);
        typeInto(setPostcodeField, postCode);
    }

    public void setSetPhoneNumberField(String phoneNumber){
        waitFor(setPhoneNumberField);
        typeInto(setPhoneNumberField, phoneNumber);
    }

    public void clickCheckoutButton(){
        clickOn(checkoutButton);
    }
    public boolean checkOrderSuccessfullMsg(){
        waitFor(checkSuccessfullMsg);
        System.out.println(checkSuccessfullMsg.getText());
        return checkSuccessfullMsg.isDisplayed() &&
                checkSuccessfullMsg.getText().equalsIgnoreCase("Thank you. Your order has been received.");
    }
    public void setEmailAddress(String emailAddress) {
        waitFor(setCheckOutEmail);
        typeInto(setCheckOutEmail, emailAddress);
    }


}
