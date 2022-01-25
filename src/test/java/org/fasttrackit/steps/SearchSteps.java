package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void executeSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchButoon();
        Assert.assertTrue(searchResultPage.existProductsAfterSearch());
    }
    @Step
    public void searchAndSelectProduct(String productName){
        homePage.setSearchField(productName);
        homePage.clickSearchButoon();
        searchResultPage.clickOnProductTitle();
    }

}
