package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;
import java.util.List;

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
    /*@FindBy()
    public boolean isSubtotalPriceCorrect(){
      return getSubtotalPricesCalculated() == getIntFromPrice(subtotlaText.getText());*/

    @FindBy(css = ".checkout-button")
    private WebElementFacade proceedToCheckout;

    public void clickProceedToCheckoutButton() {

        clickOn(proceedToCheckout);
    }

    @FindBy(css = ".cart_item")
    private List<WebElementFacade> products;

    public boolean checkIfTheProductAppearInTheCart() {
        return !products.isEmpty();
    }

    @FindBy(id = "coupon_code")
    private WebElementFacade clickOnCouponCodeField;

    public void setCouponCodeField(String couponCode) {
        waitFor(clickOnCouponCodeField);
        typeInto(clickOnCouponCodeField, couponCode);
    }

    @FindBy(css = "[name ='apply_coupon']")
    private WebElementFacade couponCodeButton;

    public void clickOnApplyCouponCode() {
        clickOn(couponCodeButton);
    }

    @FindBy(css = ".cart-discount .amount")
    private WebElementFacade discountLabel;
    public Integer getDiscount(){
        String discount = discountLabel.getText().replace("lei", "").replace(",00", "").trim();
        return Integer.valueOf(discount);
    }

    @FindBy(css = ".order-total .amount")
    private WebElementFacade totalLabel;
    public Integer getTotal(){
        String total = totalLabel.getText().replace("lei", "").replace(",00", "").trim();
        return Integer.valueOf(total);
    }

    @FindBy(css = ".cart-subtotal .amount")
    private WebElementFacade subTotalLabel;
    public Integer getSubTotal(){
        String subTotal = subTotalLabel.getText().replace("lei", "").replace(",00", "").trim();
        return Integer.valueOf(subTotal);
    }
}
