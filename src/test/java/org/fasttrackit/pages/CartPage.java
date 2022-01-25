package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends BasePage {
    @FindBy(css = ".product-remove a")
    private WebElementFacade removeProductFromCart;

    public void clickRemoveProductFromCart() {
        clickOn(removeProductFromCart);
    }

    @FindBy(css = ".cart-empty")
    private WebElementFacade successfullyRemovedFromCartMessage;

    public boolean checkIfItsSuccessfullyRemovedFromCart() {
        System.out.println(successfullyRemovedFromCartMessage.getText());
        return successfullyRemovedFromCartMessage.isDisplayed() &&
                successfullyRemovedFromCartMessage.getText().equalsIgnoreCase("Your cart is currently empty.");
    }

    @FindBy(css = ".restore-item")
    private WebElementFacade restoreItemToShoppingCart;

    public void clickRestoreItemLink() {
        System.out.println(restoreItemToShoppingCart.getText());
        waitFor(restoreItemToShoppingCart);
        clickOn(restoreItemToShoppingCart);
    }

}
