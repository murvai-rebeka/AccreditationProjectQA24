package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ProductPage extends BasePage {
    @FindBy(css = ".single_add_to_cart_button ")
    private WebElementFacade addToCartButton;

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade messageLabel;

    public boolean checkIfItsSuccessfullyAddedToTheCart() {
        return messageLabel.isDisplayed() && messageLabel.getText().contains("has been added to your cart.");
    }

    @FindBy(css = ".header-cart-amount")
    private WebElementFacade cartAmountLabel;

    public boolean checkIfItsXAppear() {
        String price = cartAmountLabel.getText().trim();
        System.out.println(price);
        return cartAmountLabel.isDisplayed() && !price.contains("(0)");
    }

    @FindBy(css = ".header-cart-checkout")
    private WebElementFacade shoppingCartButton;

    public void clickOnViewYourShoppingCartButton() {
        clickOn(shoppingCartButton);
    }
    @FindBy(css = ".cart_item")
    private List<WebElementFacade> products;
    public Integer getNumberOfCartProducts(){
        waitFor(products.get(0));
        System.out.println(products.size());
        return products.size();
    }
}
