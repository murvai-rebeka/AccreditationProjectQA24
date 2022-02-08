package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.fasttrackit.utils.Helpers;
import org.junit.Test;

public class ReviewsTest extends BaseTest{
    @Test
    public void addReviewWhileAreLoggedInTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectFirstProduct("Polo");
        reviewsSteps.clickOnReviewsLink();
        reviewsSteps.clickOnSelectRating();
        String review = "This is my review_" + java.util.UUID.randomUUID();
        Helpers.waitFor(10000);
        reviewsSteps.writeReviewAboutProduct(review);
        reviewsSteps.checkIfReviewIsAdded(review);
    }
    @Test
    public void addReviewWhileAreLoggedOutTest(){
        searchSteps.searchAndSelectFirstProduct("Belt");
        reviewsSteps.clickOnReviewsLink();
        reviewsSteps.clickOnSelectRating();
        String review = "This is my review_" + java.util.UUID.randomUUID();
        reviewsSteps.setNameAndEmailField(EnvConstants.FIRST_NAME, EnvConstants.USER_EMAIL);
        Helpers.waitFor(10000);
        reviewsSteps.writeReviewAboutProduct(review);
        reviewsSteps.checkIfReviewIsAdded(review);
    }
}
