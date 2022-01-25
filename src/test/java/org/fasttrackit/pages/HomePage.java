package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class HomePage extends BasePage {
    @FindBy(css = ".site-header-right-link a")
    private WebElementFacade accountLink;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    @FindBy(css = ".search-btn")
    private WebElementFacade showSearchButton;

    public void setSearchField(String keyword) {
        clickOn(showSearchButton);
        typeInto(searchInput, keyword);
    }

    @FindBy(css = ".search-field")
    private WebElementFacade searchInput;
    @FindBy(css = ".search-submit")
    private WebElementFacade searchButton;

    public void clickSearchButoon() {
        clickOn(searchButton);
    }

}

