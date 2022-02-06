package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.BlogPage;
import org.junit.Assert;

public class BlogPageSteps extends BaseSteps{
    @Step
    public void writeCommentAndPost(String comment){
        blogPage.setWriteCommentAndPost(comment);
        blogPage.clickOnPostCommentButton();
    }
    @Step
    public void checkIfBlogCommentAreAdded(String comment){
        Assert.assertTrue(blogPage.checkIfBlogCommentAreAdded(comment));
    }
    @Step
    public void setNameAndEmailField(String name, String email){
        blogPage.setNameAndEmailField(name, email);
    }
    @Step
    public void clickOnReplyLink(){
        blogPage.clickOnReplyLink();
    }
    @Step
    public void checkIfThereAreComments(){
        Assert.assertTrue(blogPage.checkIfThereAreComments());
    }
}
