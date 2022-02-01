package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class ReviewsTest extends BaseTest{
    @Test
    public void addReviewWhileAreLoggedIn(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("Polo");
        reviewsSteps.clickOnReviewsLink();
        reviewsSteps.clickOnSelectRating();
        String review = "This is my review_" + java.util.UUID.randomUUID();
        reviewsSteps.writeReviewAboutProduct(review);
        reviewsSteps.checkIfReviewIsAdded(review);
    }
    @Test
    public void addReviewWhileAreLoggedOut(){
        searchSteps.searchAndSelectProduct("Belt");
        reviewsSteps.clickOnReviewsLink();
        reviewsSteps.clickOnSelectRating();
        String review = "This is my review_" + java.util.UUID.randomUUID();
        reviewsSteps.setNameAndEmailField(EnvConstants.FIRST_NAME, EnvConstants.USER_EMAIL);
        reviewsSteps.writeReviewAboutProduct(review);
        reviewsSteps.checkIfReviewIsAdded(review);
    }
}
