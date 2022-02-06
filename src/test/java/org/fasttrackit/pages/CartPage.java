package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

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
    @FindBy(css = ".cart-subtotal")
    private WebElementFacade subtotalText;



    public Integer calculateProductsPrice() {
        Integer total = 0;
        for(WebElementFacade p:products){
           String price =  p.findElement(By.cssSelector(".amount")).getText();
           if(price != null)
               total = total + getPrice(price);
        }
        return total;
    }

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

    public Integer getDiscount() {
        return getPrice(discountLabel.getText());
    }

    @FindBy(css = ".order-total .amount")
    private WebElementFacade totalLabel;

    public Integer getTotal() {
        return getPrice(totalLabel.getText());
    }

    @FindBy(css = ".cart-subtotal .amount")
    private WebElementFacade subTotalLabel;

    public Integer getSubTotal() {
        return getPrice(subTotalLabel.getText());
    }

    private  Integer getPrice(String text){
        return Integer.valueOf(text.replace("lei", "").replace(",00", "").trim());
    }
}
