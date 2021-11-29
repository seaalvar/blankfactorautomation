package com.blankfactor.www.blog.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlogPage extends PageObject {

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div/div/div/div/nav/li[2]/a")
    private WebElementFacade numberPage;

    @FindBy(tagName = "heading-4")
    private List<WebElement> lstTitles;

    @FindBy(className = "theiaStickySidebar")
    private WebElementFacade titles;

    public WebElementFacade getNumberPage() {
        return numberPage;
    }

    public List<WebElement> getLstTitles() {
        return lstTitles;
    }

    public WebElementFacade getTitles() {
        return titles;
    }
}
