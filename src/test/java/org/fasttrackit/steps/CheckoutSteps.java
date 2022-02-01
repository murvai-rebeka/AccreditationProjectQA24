package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps {
    @Step
    public void enterCheckoutDetails(String Firstname, String Lastname, String streetAddress,
                                     String nameOfTheCity, String postCode, String phoneNumber) {
        checkoutPage.setFirstNameField(Firstname);
        checkoutPage.setSetLastNameField(Lastname);
        checkoutPage.setAddressField(streetAddress);
        checkoutPage.setSetCityField(nameOfTheCity);
        checkoutPage.setPostcodeField(postCode);
        checkoutPage.setSetPhoneNumberField(phoneNumber);
    }
    public void clickOnCheckoutButton(){
        checkoutPage.clickCheckoutButton();
    }
    public void checkIfOrderSuccessfull(){
        Assert.assertTrue(checkoutPage.checkOrderSuccessfullMsg());
    }
    @Step
    public void setCheckOutEmail(String emailAddress){
        checkoutPage.setEmailAddress(emailAddress);
    }
    public void clckOnShipToDifferentAddressCheckBox(){
        checkoutPage.clickDifferentAddressCheckBox();
    }
    @Step
    public void enterCheckoutDetailsForDifferentAddress(String shippingFirstName, String shippingLastName,
    String shippingAddress, String shippingTown, String shippingPostcode){
        checkoutPage.setShippingFirstNameField(shippingFirstName);
        checkoutPage.setShippingLastNameField(shippingLastName);
        checkoutPage.setShippingAddressField(shippingAddress);
        checkoutPage.setShippingTownField(shippingTown);
        checkoutPage.setShippingPostcodeField(shippingPostcode);
    }


}
