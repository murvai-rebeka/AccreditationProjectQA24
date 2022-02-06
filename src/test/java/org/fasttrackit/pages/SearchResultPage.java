package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultPage extends BasePage {
    @FindBy(css = "article")
    private List<WebElementFacade> listOfProducts;

    public boolean existProductsAfterSearch() {
        waitFor(listOfProducts.get(0));

        return !listOfProducts.isEmpty();
    }

    @FindBy(css = ".entry-title a")
    private WebElementFacade productTitle;

    public void clickOnProductTitle() {
        clickOn(productTitle);
    }

    @FindBy(css = ".product")
    private List<WebElementFacade> listOfLoadedProducts;

    public boolean checkIfProductsAreLoaded(){
        waitFor(listOfLoadedProducts.get(0));
        return !listOfLoadedProducts.isEmpty();
    }
    @FindBy(css = ".next")
    private WebElementFacade nextPageLink;

    public void clickOnNextPageLink(){
        clickOn(nextPageLink);
    }
    @FindBy(css = ".prev")
    private WebElementFacade previousPageLink;

    public void clickOnPreviusPageLink(){
        clickOn(previousPageLink);
    }
}
