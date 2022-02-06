package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.utils.EnvConstants;

public class HomePageSteps extends BaseSteps{
    @Step
    public void navigateToBlogPage(){
        getDriver().get(EnvConstants.BLOG_URL);
    }
}
