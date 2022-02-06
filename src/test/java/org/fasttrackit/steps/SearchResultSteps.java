package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchResultSteps extends BaseSteps{
    @Step
    public void checkIfPoductsAreLoaded(){
        Assert.assertTrue(searchResultPage.checkIfProductsAreLoaded());
    }
    @Step
    public void clickOnNextPageLink(){
        searchResultPage.clickOnNextPageLink();
    }
    @Step
    public void clickOnPreviusPageLink(){
        searchResultPage.clickOnPreviusPageLink();
    }
}
