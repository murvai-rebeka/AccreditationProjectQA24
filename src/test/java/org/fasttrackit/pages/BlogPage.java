package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class BlogPage extends BasePage{

    @FindBy(css = ".comment-form-comment textarea")
    private WebElementFacade commentInputField;

    public void setWriteCommentAndPost(String comment){
        waitFor(commentInputField);
        typeInto(commentInputField, comment);
    }
    @FindBy(id = "submit")
    private WebElementFacade postCommentButton;

    public void clickOnPostCommentButton(){
        clickOn(postCommentButton);
    }

    @FindBy(css = ".comment-content p")
    private List<WebElementFacade> comments;

    public boolean checkIfBlogCommentAreAdded(String comment){
        for(WebElementFacade c:comments){
            if(c.getText().equalsIgnoreCase(comment))
                return true;
        }
        return false;
    }

    @FindBy(id = "author")
    private WebElementFacade nameField;
    @FindBy(id = "email")
    private WebElementFacade emailField;

    public void setNameAndEmailField(String name, String email){
        waitFor(nameField);
        typeInto(nameField, name);
        waitFor(emailField);
        typeInto(emailField, email);
    }

    @FindBy(css = ".comment-reply-link ")
    private WebElementFacade replyLink;

    public void clickOnReplyLink(){
        clickOn(replyLink);
    }

    public boolean checkIfThereAreComments(){
        return !comments.isEmpty();
    }
}
