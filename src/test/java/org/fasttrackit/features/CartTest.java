package org.fasttrackit.features;


import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Test
    public void addToCartTest() {
        searchSteps.searchAndSelectFirstProduct("Sunglasses");
        cartSteps.addToCart();
        cartSteps.checkIfItsSuccessfullyAddedToTheCart();
        cartSteps.checkIfTheProductIsInTheCart();
    }

    @Test
    public void removeProductFromTheCartTest() {
        searchSteps.searchAndSelectFirstProduct("Sunglasses");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.removeProductFromCart();
        cartSteps.checkIfSuccessfullyRemovedFromCart();
        cartSteps.checkNumberOfCartProducts(0);
    }

    @Test
    public void checkIfUndoButtonItsWorkingTest() {
        searchSteps.searchAndSelectFirstProduct("Belt");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.removeProductFromCart();
        cartSteps.restoreItemToShoppingCart();
        cartSteps.checkNumberOfCartProducts(1);
    }

    @Test
    public void checkCartTotalSummaryTest() {
        searchSteps.searchAndSelectFirstProduct("Beanie");
        cartSteps.addToCart();
        searchSteps.searchAndSelectFirstProduct("Belt");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
    }

    @Test
    public void validCheckOutWhileAreLoggedInTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectFirstProduct("Belt");
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
        checkoutSteps.checkIfTheOrderIsSuccessful();
    }

    @Test
    public void validCheckOutWhileAreLoggedOutTest() {
        searchSteps.searchAndSelectFirstProduct("Belt");
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
        checkoutSteps.checkIfTheOrderIsSuccessful();
    }

    @Test
    public void shipToDifferentAddressTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectFirstProduct("Belt");
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
        checkoutSteps.checkIfTheOrderIsSuccessful();
    }

    @Test
    public void productLeftInTheCartRemainsAfterLogOutTest() {
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectFirstProduct("Belt");
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
        searchSteps.searchAndSelectFirstProduct("Belt");
        cartSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.applyCouponCode("HELLO10");
        cartSteps.checkIfCouponCodeIsApplied(10);
    }

}
