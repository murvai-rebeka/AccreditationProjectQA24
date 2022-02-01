package org.fasttrackit.features;


import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Test
    public void addToCartTest() {
        searchSteps.searchAndSelectProduct("Sunglasses");
        cartSteps.addToCart();
        cartSteps.checkIfItsSuccessfullyAddedToTheCart();
        cartSteps.checkIfItsXAppear();
    }

    @Test
    public void removeProductFromTheCart() {
        searchSteps.searchAndSelectProduct("Sunglasses");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.removeProductFromCart();
        cartSteps.checkIfItsSuccessfullyRemovedFromCart();
        cartSteps.checkNumberOfCartProducts(0);
    }

    @Test
    public void checkIfItsUndoButtonItsWorking() {
        searchSteps.searchAndSelectProduct("Belt");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.removeProductFromCart();
        //  cartSteps.checkNumberOfCartProducts(0);
        cartSteps.restoreItemToShoppingCart();
        cartSteps.checkNumberOfCartProducts(1);
    }

    @Test
    public void checkCartTotalSummaryTest() {
        // loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("Beanie");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        // cartSteps.checkSubtotalPriceIsDisplayedCorrectly();

    }

    @Test
    public void validCheckOutTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("Belt");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.proceedToCheckout();
        checkoutSteps.enterCheckoutDetails(EnvConstants.FIRST_NAME,
                EnvConstants.LAST_NAME,
                EnvConstants.STR_ADDRESS,
                EnvConstants.CITY_NAME,
                EnvConstants.POSTCODE_ZIP,
                EnvConstants.PHONE_NUMBER
        );
        checkoutSteps.clickOnCheckoutButton();
        checkoutSteps.checkIfOrderSuccessfull();
    }

    @Test
    public void validCheckOutTest2() {
        searchSteps.searchAndSelectProduct("Belt");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.proceedToCheckout();
        checkoutSteps.enterCheckoutDetails(EnvConstants.FIRST_NAME,
                EnvConstants.LAST_NAME,
                EnvConstants.STR_ADDRESS,
                EnvConstants.CITY_NAME,
                EnvConstants.POSTCODE_ZIP,
                EnvConstants.PHONE_NUMBER
        );
        checkoutSteps.setCheckOutEmail(EnvConstants.EMAIL_ADDRESS);
        checkoutSteps.clickOnCheckoutButton();
        checkoutSteps.checkIfOrderSuccessfull();
    }

    @Test
    public void shipToDifferentAddressTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("Belt");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.proceedToCheckout();
        checkoutSteps.enterCheckoutDetails(EnvConstants.FIRST_NAME,
                EnvConstants.LAST_NAME,
                EnvConstants.STR_ADDRESS,
                EnvConstants.CITY_NAME,
                EnvConstants.POSTCODE_ZIP,
                EnvConstants.PHONE_NUMBER
        );
        checkoutSteps.clckOnShipToDifferentAddressCheckBox();
        checkoutSteps.enterCheckoutDetailsForDifferentAddress(EnvConstants.SHIPPING_FIRSTNAME,
                EnvConstants.SHIPPING_LASTNAME,
                EnvConstants.SHIPPING_ADDRESS,
                EnvConstants.SHIPPING_TOWN,
                EnvConstants.SHIPPING_POSTCODE);
        checkoutSteps.clickOnCheckoutButton();
        checkoutSteps.checkIfOrderSuccessfull();
    }

    @Test
    public void productLeftInTheCartRemainsAfterLoggOutTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("Belt");
        cartSteps.addToCart();
        loginSteps.navigateToLoginPage();
        loginSteps.clickLogout();
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        cartSteps.navigateToCartPage();
        cartSteps.checkIfTheProductAppearInTheCart();
    }

    @Test
    public void verifyFixedDiscountCouponTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("Belt");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.applyCouponCodeField("HELLO10");
        cartSteps.checkIfCouponCodeIsApplied(10);
    }

}
