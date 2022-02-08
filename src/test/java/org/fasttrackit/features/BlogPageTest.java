package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.fasttrackit.utils.Helpers;
import org.junit.Test;

public class BlogPageTest extends BaseTest{
    @Test
    public void writeBlogPostWhileAreLoggedInTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        homePageSteps.navigateToBlogPage();
        String comment = "This is my comment_" + java.util.UUID.randomUUID();
        Helpers.waitFor(10000);
        blogPageSteps.writeCommentAndPost(comment);
        blogPageSteps.checkIfBlogCommentAreAdded(comment);
    }
    @Test
    public void writeBlogPostWhileAreLogOutTest(){
        homePageSteps.navigateToBlogPage();
        String comment = "This is my comment_" + java.util.UUID.randomUUID();
        blogPageSteps.setNameAndEmailField(EnvConstants.LAST_NAME, EnvConstants.EMAIL_ADDRESS);
        Helpers.waitFor(10000);
        blogPageSteps.writeCommentAndPost(comment);
        blogPageSteps.checkIfBlogCommentAreAdded(comment);
    }
    @Test
    public void replyToExistingBlogPostWhileAreLoggedInTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        homePageSteps.navigateToBlogPage();
        blogPageSteps.clickOnReplyLink();
        String comment = "This is my reply comment_" + java.util.UUID.randomUUID();
        Helpers.waitFor(10000);
        blogPageSteps.writeCommentAndPost(comment);
        blogPageSteps.checkIfBlogCommentAreAdded(comment);
    }
    @Test
    public void checkIfBlogsAreLoadedTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        homePageSteps.navigateToBlogPage();
        blogPageSteps.checkIfThereAreComments();
    }


}
