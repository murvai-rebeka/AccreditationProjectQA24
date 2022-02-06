package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest {
    @Test
    public void searchByProductTitleTest() {
        searchSteps.executeSearch("abc");
        searchSteps.existProductsAfterSearch();
    }
}
