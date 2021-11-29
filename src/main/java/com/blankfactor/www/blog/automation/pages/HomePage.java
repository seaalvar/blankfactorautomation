package com.blankfactor.www.blog.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy(id = "menu-item-4436")
    private WebElementFacade lnkInsights;

    @FindBy(xpath = "/html/body/div[1]/header/div/nav/div[2]/ul/li[5]/div/div/div/div/div[2]/a[1]/p")
    private WebElementFacade lnkBlog;

    public WebElementFacade getLnkInsights() {
        return lnkInsights;
    }

    public WebElementFacade getLnkBlog() {
        return lnkBlog;
    }
}
