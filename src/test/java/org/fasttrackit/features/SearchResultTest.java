package org.fasttrackit.features;
import org.junit.Test;

public class SearchResultTest extends BaseTest{
    @Test
    public void checkIfProductsAreLoadedTest() {
        searchSteps.navigateToShopPage();
        searchResultSteps.checkIfPoductsAreLoaded();
    }

    @Test
    public void checkPaginationTest() {
        searchSteps.navigateToShopPage();
        searchResultSteps.clickOnNextPageLink();
        searchResultSteps.checkIfPoductsAreLoaded();
        searchResultSteps.clickOnPreviusPageLink();
        searchResultSteps.checkIfPoductsAreLoaded();
    }
}
