package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ReviewsPage extends BasePage{
    @FindBy(id = "comment")
    private WebElementFacade reviewInputField;

    public void setReviewField(String review){
        waitFor(reviewInputField);
        typeInto(reviewInputField, review);
    }

    @FindBy(css = ".star-4")
    private WebElementFacade ratingStars;

    public void clickOnRatingStars(){
        clickOn(ratingStars);
    }

    @FindBy(id = "submit")
    private WebElementFacade submitButton;

    public void clickOnSubmitButton(){
        clickOn(submitButton);
    }

    @FindBy(css = ".comment_container .description p")
    private List<WebElementFacade> reviews;
    public boolean checkIfReviewIsAdded(String review){
        for(WebElementFacade r:reviews){
            if(r.getText().equalsIgnoreCase(review))
                return true;
        }
        return false;

    }
    @FindBy(id = "author")
    private WebElementFacade nameField;

    public void setNameField(String name){
        waitFor(nameField);
        typeInto(nameField, name);
    }
    @FindBy(id = "email")
    private WebElementFacade emailField;

    public void setEmailField(String email){
        waitFor(emailField);
        typeInto(emailField, email);
    }

}
