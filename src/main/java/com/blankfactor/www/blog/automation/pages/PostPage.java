package com.blankfactor.www.blog.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PostPage extends PageObject {

    @FindBy(className = "heading-3")
    private WebElementFacade postTitle;

    @FindBy(name = "email")
    private WebElementFacade email;

    @FindBy(xpath = "//button[contains(text(),' Subscribe ')]")
    private WebElementFacade btnSubscribe;

    @FindBy(className = "section-title")
    private WebElementFacade lblThank;

    public WebElementFacade getPostTitle() {
        return postTitle;
    }

    public WebElementFacade getEmail() {
        return email;
    }

    public WebElementFacade getBtnSubscribe() {
        return btnSubscribe;
    }

    public WebElementFacade getLblThank() {
        return lblThank;
    }
}
