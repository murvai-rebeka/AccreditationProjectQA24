package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {
    @Step
    public void addToCart() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkIfItsSuccessfullyAddedToTheCart() {
        Assert.assertTrue(productPage.checkIfItsSuccessfullyAddedToTheCart());
    }

    @Step
    public void checkIfItsXAppear() {
        Assert.assertTrue(productPage.checkIfItsXAppear());
    }

    @Step
    public void navigateToCartPage() {
        productPage.clickOnViewYourShoppingCartButton();
    }

    @Step
    public void removeProductFromCart() {
        cartPage.clickRemoveProductFromCart();
    }

    @Step
    public void checkIfItsSuccessfullyRemovedFromCart() {
        Assert.assertTrue(cartPage.checkIfItsSuccessfullyRemovedFromCart());
    }

    @Step
    public void restoreItemToShoppingCart() {
        cartPage.clickRestoreItemLink();
    }

    @Step
    public void checkNumberOfCartProducts(Integer count) {
        Assert.assertEquals(productPage.getNumberOfCartProducts(), count);
    }

}
