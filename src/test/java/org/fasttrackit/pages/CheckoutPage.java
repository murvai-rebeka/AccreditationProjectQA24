package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class CheckoutPage extends BasePage {
    @FindBy(id = "billing_first_name")
    private WebElementFacade setFirstNameField;

    public void setFirstNameField(String firstName) {
        waitFor(setFirstNameField);
        typeInto(setFirstNameField, firstName);
    }

    @FindBy(id = "billing_last_name")
    private WebElementFacade setLastNameField;

    public void setSetLastNameField(String lastName) {
        waitFor(setLastNameField);
        typeInto(setLastNameField, lastName);
    }

    @FindBy(id = "billing_address_1")
    private WebElementFacade setAddressField;

    public void setAddressField(String streetAddress) {
        waitFor(setAddressField);
        typeInto(setAddressField, streetAddress);
    }

    @FindBy(id = "billing_city")
    private WebElementFacade setCityField;

    public void setSetCityField(String nameOfTheCity) {
        waitFor((setCityField));
        typeInto(setCityField, nameOfTheCity);
    }

    @FindBy(id = "billing_postcode")
    private WebElementFacade setPostcodeField;

    public void setPostcodeField(String postCode) {
        waitFor(setPostcodeField);
        typeInto(setPostcodeField, postCode);
    }

    @FindBy(id = "billing_phone")
    private WebElementFacade setPhoneNumberField;

    public void setSetPhoneNumberField(String phoneNumber) {
        waitFor(setPhoneNumberField);
        typeInto(setPhoneNumberField, phoneNumber);
    }

    @FindBy(id = "place_order")
    private WebElementFacade checkoutButton;

    public void clickCheckoutButton() {

        clickOn(checkoutButton);
    }

    @FindBy(css = ".woocommerce-notice ")
    private WebElementFacade checkSuccessfullMsg;

    public boolean checkOrderSuccessfullMsg() {
        waitFor(checkSuccessfullMsg);
        System.out.println(checkSuccessfullMsg.getText());
        return checkSuccessfullMsg.isDisplayed() &&
                checkSuccessfullMsg.getText().equalsIgnoreCase("Thank you. Your order has been received.");
    }

    @FindBy(id = "billing_email")
    private WebElementFacade setCheckOutEmail;

    public void setEmailAddress(String emailAddress) {
        waitFor(setCheckOutEmail);
        typeInto(setCheckOutEmail, emailAddress);
    }

    @FindBy(id = "ship-to-different-address-checkbox")
    private WebElementFacade clickDifferentAddressCheckBox;

    public void clickDifferentAddressCheckBox() {

        clickOn(clickDifferentAddressCheckBox);
    }

    @FindBy(id = "shipping_first_name")
    private WebElementFacade setShippingFirstNameField;

    public void setShippingFirstNameField(String shippingFirstName) {
        waitFor(setShippingFirstNameField);
        typeInto(setShippingFirstNameField, shippingFirstName);
    }

    @FindBy(id = "shipping_last_name")
    private WebElementFacade setShippingLastNameField;

    public void setShippingLastNameField(String shippingLastName) {
        waitFor(setShippingLastNameField);
        typeInto(setShippingLastNameField, shippingLastName);
    }

    @FindBy(id = "shipping_address_1")
    private WebElementFacade setShippingAddressField;

    public void setShippingAddressField(String shippingAddress) {
        waitFor(setShippingAddressField);
        typeInto(setShippingAddressField, shippingAddress);
    }

    @FindBy(id = "shipping_city")
    private WebElementFacade setShippingTownField;

    public void setShippingTownField(String shippingTown) {
        waitFor(setShippingTownField);
        typeInto(setShippingTownField, shippingTown);
    }

    @FindBy(id = "shipping_postcode")
    private WebElementFacade setShippingPostcodeField;

    public void setShippingPostcodeField(String shippingPostcode) {
        waitFor(setShippingPostcodeField);
        typeInto(setShippingPostcodeField, shippingPostcode);
    }


}
