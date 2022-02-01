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
    @FindBy(id = "ship-to-different-address-checkbox")
    private WebElementFacade clickDifferentAddressCheckBox;
    @FindBy(id = "shipping_first_name")
    private WebElementFacade setShippingFirstNameField;
    @FindBy(id = "shipping_last_name")
    private WebElementFacade setShippingLastNameField;
    @FindBy(id = "shipping_address_1")
    private WebElementFacade setShippingAddressField;
    @FindBy(id = "shipping_city")
    private WebElementFacade setShippingTownField;
    @FindBy(id = "shipping_postcode")
    private WebElementFacade setShippingPostcodeField;

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
    public void clickDifferentAddressCheckBox(){
        clickOn(clickDifferentAddressCheckBox);
    }
    public void setShippingFirstNameField(String shippingFirstName){
        waitFor(setShippingFirstNameField);
        typeInto(setShippingFirstNameField, shippingFirstName );
    }
    public void setShippingLastNameField(String shippingLastName){
        waitFor(setShippingLastNameField);
        typeInto(setShippingLastNameField, shippingLastName);
    }
    public void setShippingAddressField(String shippingAddress){
        waitFor(setShippingAddressField);
        typeInto(setShippingAddressField, shippingAddress);
    }
    public void setShippingTownField(String shippingTown){
        waitFor(setShippingTownField);
        typeInto(setShippingTownField, shippingTown);
    }
    public void setShippingPostcodeField(String shippingPostcode){
        waitFor(setShippingPostcodeField);
        typeInto(setShippingPostcodeField, shippingPostcode);
    }


}
