package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;
import org.fasttrackit.utils.EnvConstants;

public class BaseSteps extends ScenarioSteps {
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected MyAccountPage myAccountPage;
    protected RegisterPage registerPage;
    protected SearchResultPage searchResultPage;
    protected ProductPage productPage;
    protected CartPage cartPage;
    protected CheckoutPage checkoutPage;


  /*  @Step
    public void navigateToAdminHomePage(){
        getDriver().get(EnvConstants.ADMIN_BASE_URL);
    }
*/
    @Step
    public void navigateToHomePage(){
        getDriver().get(EnvConstants.BASE_URL);
    }

}



