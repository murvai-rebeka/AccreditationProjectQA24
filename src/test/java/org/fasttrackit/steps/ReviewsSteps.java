package org.fasttrackit.steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ReviewsSteps extends BaseSteps{
    @Step
    public void clickOnReviewsLink(){
        productPage.clickOnReviewsLink();
    }
    @Step
    public void clickOnSelectRating(){
        reviewsPage.clickOnRatingStars();

    }
    @Step
    public void writeReviewAboutProduct(String review){
      reviewsPage.setReviewField(review);
      reviewsPage.clickOnSubmitButton();
    }
    @Step
    public void checkIfReviewIsAdded(String review){
        Assert.assertTrue(reviewsPage.checkIfReviewIsAdded(review));

    }
    @Step
    public void setNameAndEmailField(String name, String email){
        reviewsPage.setNameField(name);
        reviewsPage.setEmailField(email);
    }
}
